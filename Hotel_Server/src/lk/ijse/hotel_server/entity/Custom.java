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
public class Custom {
    private String rid;
    private int reservation_id;
    private String room_type;
    private String departure_date;

    public Custom() {
    }

    public Custom(String rid, int reservation_id, String room_type, String departure_date) {
        this.rid = rid;
        this.reservation_id = reservation_id;
        this.room_type = room_type;
        this.departure_date = departure_date;
    }

    public String getRid() {
        return rid;
    }

    public void setRid(String rid) {
        this.rid = rid;
    }

    public int getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(int reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getDeparture_date() {
        return departure_date;
    }

    public void setDeparture_date(String departure_date) {
        this.departure_date = departure_date;
    }

    @Override
    public String toString() {
        return "Custom{" + "rid=" + rid + ", reservation_id=" + reservation_id + ", room_type=" + room_type + ", departure_date=" + departure_date + '}';
    }
    
    
}
