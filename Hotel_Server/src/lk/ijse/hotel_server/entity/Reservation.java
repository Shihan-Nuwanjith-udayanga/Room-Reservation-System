/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.entity;

import java.util.Date;

/**
 *
 * @author Dell
 */
public class Reservation {
    private int cid;
    private int reservation_id;
    private String arrival_date;
    private String departure_date;
    private int no_of_customer;
    private int room_qty;

    public Reservation() {
    }

    public Reservation(int cid, int reservation_id, String arrival_date, String departure_date, int no_of_customer, int room_qty) {
        this.cid = cid;
        this.reservation_id = reservation_id;
        this.arrival_date = arrival_date;
        this.departure_date = departure_date;
        this.no_of_customer = no_of_customer;
        this.room_qty = room_qty;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
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

    public int getNo_of_customer() {
        return no_of_customer;
    }

    public void setNo_of_customer(int no_of_customer) {
        this.no_of_customer = no_of_customer;
    }

    public int getRoom_qty() {
        return room_qty;
    }

    public void setRoom_qty(int room_qty) {
        this.room_qty = room_qty;
    }

    @Override
    public String toString() {
        return "Reservation{" + "cid=" + cid + ", reservation_id=" + reservation_id + ", arrival_date=" + arrival_date + ", departure_date=" + departure_date + ", no_of_customer=" + no_of_customer + ", room_qty=" + room_qty + '}';
    }

    
}
