/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.CarModel;
import Model.RentModel;

/**
 *
 * @author HP
 */
public abstract class RentAbstract {
    public abstract CarModel[] getAllWhere(String column, String value);
    public abstract Boolean add(String car_code, String tenant_name, String rent_date, String rent_duration);
    public abstract RentModel[] getAll();
    public abstract Boolean delete(String car_code);
}
