/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Connection.Connect.connect;
import Model.CarModel;
import Model.RentModel;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class RentExtends extends RentAbstract {
    List carModel = new ArrayList();
    List rentModel = new ArrayList();

    @Override
    public CarModel[] getAllWhere(String column, String value) {
        String query = "SELECT * FROM cars WHERE " + column + " = '" + value + "'";
        
        try {
            connect();
            Statement st = connect().createStatement();
            ResultSet res = st.executeQuery(query);
            
            while(res.next()) {
                CarModel cm = new CarModel();
                
                cm.setCarCode(res.getString("car_code"));
                cm.setCarName(res.getString("car_name"));
                cm.setBrand(res.getString("brand"));
                cm.setPassenger(res.getInt("passenger_capacity"));
                cm.setPlate(res.getString("license_plate_num"));
                cm.setStatus(res.getString("status"));
                
                carModel.add(cm);
            }
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return (CarModel[]) carModel.toArray(CarModel[]::new);
    }

    @Override
    public Boolean add(String car_code, String tenant_name, String rent_date, String rent_duration) {
        String query = "INSERT INTO rents (car_code, tenant_name, rent_date, rent_duration) VALUES (?, ?, ?, ?)";
        String query2 = "UPDATE cars SET status = 'Kosong' WHERE car_code = ?";
        int result = 0;
        
        try {
            PreparedStatement ps = connect().prepareStatement(query);
            PreparedStatement ps2 = connect().prepareStatement(query2);
            
            ps.setString(1, car_code);
            ps.setString(2, tenant_name);
            ps.setString(3, rent_date);
            ps.setString(4, rent_duration);
            
            ps2.setString(1, car_code);
            
            result = ps.executeUpdate();
            result = ps2.executeUpdate();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Masukkan angka pada kolom durasi pinjam!");
        }
        
        return result > 0;
    }

    @Override
    public RentModel[] getAll() {
        String query = "SELECT * FROM rents";
        
        try {
            Statement st = connect().createStatement();
            ResultSet res = st.executeQuery(query);
            
            while(res.next()) {
                RentModel rm = new RentModel();
                
                rm.setCarCode(res.getString("car_code"));
                rm.setTenantName(res.getString("tenant_name"));
                rm.setRentDate(res.getString("rent_date"));
                rm.setRentDuration(res.getInt("rent_duration"));
                
                rentModel.add(rm);
            }
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return (RentModel[]) rentModel.toArray(RentModel[]::new);
    }

    @Override
    public Boolean delete(String car_code) {
        String query = "DELETE FROM rents where car_code = ?";
        String query2 = "UPDATE cars SET status = 'Tersedia' WHERE car_code = ?";
        int executeResult = 0;
        
        try {
            PreparedStatement ps = connect().prepareStatement(query);
            ps.setString(1, car_code);
            executeResult = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        try {
            PreparedStatement ps2 = connect().prepareStatement(query2);
            ps2.setString(1, car_code);
            executeResult = ps2.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return executeResult > 0;
    }
    
}
