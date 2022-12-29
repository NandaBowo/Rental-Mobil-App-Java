/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author HP
 */
public class CarModel {
    private String car_code;
    private String car_name;
    private String brand;
    private int passenger;
    private String plate;
    private String status;

    public String getCarCode() {
        return car_code;
    }

    public void setCarCode(String car_code) {
        this.car_code = car_code;
    }

    public String getCarName() {
        return car_name;
    }

    public void setCarName(String car_name) {
        this.car_name = car_name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPassenger() {
        return passenger;
    }

    public void setPassenger(int passenger) {
        this.passenger = passenger;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
