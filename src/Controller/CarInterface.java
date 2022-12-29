/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CarModel;

/**
 *
 * @author HP
 */
public interface CarInterface {
    CarModel[] getAll();
    Boolean add(String car_code, String car_name, String brand, String passenger, String plate, String status);
    Boolean edit(String car_code, String car_name, String brand, String passenger, String plate, String status);
    Boolean delete(String car_code);
}
