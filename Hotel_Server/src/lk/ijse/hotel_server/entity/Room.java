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
public class Room {
    private int rid;
    private int reservation_id;
    private String room_type;

    public Room() {
    }

    public Room(int rid, int reservation_id, String room_type) {
        this.rid = rid;
        this.reservation_id = reservation_id;
        this.room_type = room_type;
    }

    public int getRid() {
        return rid;
    }

    public void setRid(int rid) {
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

    @Override
    public String toString() {
        return "Room{" + "rid=" + rid + ", reservation_id=" + reservation_id + ", room_type=" + room_type + '}';
    }
    
    
}
