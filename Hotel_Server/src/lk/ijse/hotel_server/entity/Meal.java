/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.entity;

/**
 *
 * @author Dell
 */
public class Meal {
    private int mid;
    private int reservation_id;
    private String meal_type;
    private int meal_qty;

    public Meal() {
    }

    public Meal(int mid, int reservation_id, String meal_type, int meal_qty) {
        this.mid = mid;
        this.reservation_id = reservation_id;
        this.meal_type = meal_type;
        this.meal_qty = meal_qty;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getMeal_type() {
        return meal_type;
    }

    public void setMeal_type(String meal_type) {
        this.meal_type = meal_type;
    }

    public int getMeal_qty() {
        return meal_qty;
    }

    public void setMeal_qty(int meal_qty) {
        this.meal_qty = meal_qty;
    }

    @Override
    public String toString() {
        return "Meal{" + "mid=" + mid + ", reservation_id=" + reservation_id + ", meal_type=" + meal_type + ", meal_qty=" + meal_qty + '}';
    }
    
    
}
