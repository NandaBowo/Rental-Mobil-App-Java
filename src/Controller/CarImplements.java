/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import static Connection.Connect.connect;
import Model.CarModel;
import java.util.ArrayList;
import java.util.List;
import java.sql.*;

/**
 *
 * @author HP
 */
public class CarImplements implements CarInterface {
    List carModel = new ArrayList();

    @Override
    public CarModel[] getAll() {
        String query = "SELECT * FROM cars";
        
        try {
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
    public Boolean add(String car_code, String car_name, String brand, String passenger, String plate, String status) {
        String query = "INSERT INTO cars (car_code, car_name, brand, passenger_capacity, license_plate_num, status) VALUES (?, ?, ?, ?, ?, ?)";
        int result = 0;
        
        try {
            PreparedStatement ps = connect().prepareStatement(query);
            
            ps.setString(1, car_code);
            ps.setString(2, car_name);
            ps.setString(3, brand);
            ps.setInt(4, Integer.parseInt(passenger));
            ps.setString(5, plate);
            ps.setString(6, status);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return result > 0;
    }

    @Override
    public Boolean edit(String car_code, String car_name, String brand, String passenger, String plate, String status) {
        String query = "UPDATE cars SET car_code = ?, car_name = ?, brand = ?, passenger_capacity = ?, license_plate_num = ?, status = ? WHERE car_code = ?";
        int result = 0;
        
        try {
            PreparedStatement ps = connect().prepareStatement(query);
            
            ps.setString(1, car_code);
            ps.setString(2, car_name);
            ps.setString(3, brand);
            ps.setInt(4, Integer.parseInt(passenger));
            ps.setString(5, plate);
            ps.setString(6, status);
            ps.setString(7, car_code);
            result = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return result > 0;
    }

    @Override
    public Boolean delete(String car_code) {
        String query = "DELETE FROM cars where car_code = ?";
        int executeResult = 0;
        
        try {
            PreparedStatement ps = connect().prepareStatement(query);
            ps.setString(1, car_code);
            executeResult = ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error : " + e);
        }
        
        return executeResult > 0;
    }
}
