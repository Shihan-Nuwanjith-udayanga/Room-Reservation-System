/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_common.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class ReservationDTO implements Serializable{
    private int reservation_id;
    
    private int cid;
    private String customer_name;
    private String customer_address;
    private int customer_contact;
    private int no_of_customr;
    
    private int mid;
    private String meal_type;
    private int meal_qty;

    private int rid;
    private String room_type;
    private int room_qty;
    private String arrival_date;
    private String departure_date;
    
    
    public ReservationDTO() {
    }

    public ReservationDTO(int reservation_id, int cid, String customer_name, String customer_address, int customer_contact, int no_of_customr, int mid, String meal_type, int meal_qty, int rid, String room_type, int room_qty, String arrival_date, String departure_date) {
        this.reservation_id = reservation_id;
        this.cid = cid;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_contact = customer_contact;
        this.no_of_customr = no_of_customr;
        this.mid = mid;
        this.meal_type = meal_type;
        this.meal_qty = meal_qty;
        this.rid = rid;
        this.room_type = room_type;
        this.room_qty = room_qty;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
    }

    

    public ReservationDTO(int reservation_id, int rid, String room_type, String departure_date) {
        this.reservation_id = reservation_id;
        this.rid = rid;
        this.room_type = room_type;
        this.departure_date = departure_date;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(int customer_contact) {
        this.customer_contact = customer_contact;
    }

    public int getNo_of_customr() {
        return no_of_customr;
    }

    public void setNo_of_customr(int no_of_customr) {
        this.no_of_customr = no_of_customr;
    }

    public int getMid() {
        return mid;
    }

    public void setMid(int mid) {
        this.mid = mid;
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

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
        this.rid = rid;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public int getRoom_qty() {
        return room_qty;
    }

    public void setRoom_qty(int room_qty) {
        this.room_qty = room_qty;
    }

    public String getArrival_date() {
        return arrival_date;
    }

    public void setArrival_date(String arrival_date) {
        this.arrival_date = arrival_date;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    @Override
    public String toString() {
        return "ReservationDTO{" + "reservation_id=" + reservation_id + ", cid=" + cid + ", customer_name=" + customer_name + ", customer_address=" + customer_address + ", customer_contact=" + customer_contact + ", no_of_customr=" + no_of_customr + ", mid=" + mid + ", meal_type=" + meal_type + ", meal_qty=" + meal_qty + ", rid=" + rid + ", room_type=" + room_type + ", room_qty=" + room_qty + ", arrival_date=" + arrival_date + ", departure_date=" + departure_date + '}';
    }

    
}
