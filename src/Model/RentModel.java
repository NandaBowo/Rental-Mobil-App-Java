/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class RentModel {
    private String car_code;
    private String tenant_name;
    private String rent_date;
    private int rent_duration;

    public String getCarCode() {
        return car_code;
    }

    public void setCarCode(String car_code) {
        this.car_code = car_code;
    }

    public String getTenantName() {
        return tenant_name;
    }

    public void setTenantName(String tenant_name) {
        this.tenant_name = tenant_name;
    }

    public String getRentDate() {
        return rent_date;
    }

    public void setRentDate(String rent_date) {
        this.rent_date = rent_date;
    }

    public int getRentDuration() {
        return rent_duration;
    }

    public void setRentDuration(int rent_duration) {
        this.rent_duration = rent_duration;
    }
}
