/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.dao.custom.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import lk.ijse.hotel_server.dao.CrudUtil;
import lk.ijse.hotel_server.dao.custom.ReservationDAO;
import lk.ijse.hotel_server.entity.Customer;
import lk.ijse.hotel_server.entity.Meal;
import lk.ijse.hotel_server.entity.Reservation;
import lk.ijse.hotel_server.entity.Room;

/**
 *
 * @author Dell
 */
public class ReservationDAOImpl implements ReservationDAO{
    
    private Connection connection;

    @Override
    public boolean addCustomer(Customer customer) throws Exception {
        System.out.println("add Customer :" + customer);
        Boolean b  = CrudUtil.execute("INSERT INTO customer VALUES(?,?,?,?)", connection,
                customer.getCid(),
                customer.getCustomer_name(),
                customer.getCustomer_address(),
                customer.getCustomer_contact());
        System.out.println("add Customer:" + b);
        return b;
    }

    @Override
    public boolean setReservation(Reservation reservation) throws Exception {
        System.out.println("set Reservation :"+reservation);
        Boolean b= CrudUtil.execute("INSERT INTO reservation VALUES(?,?,?,?,?,?)", connection, 
                reservation.getCid(),
                reservation.getReservation_id(),
                reservation.getArrival_date(),
                reservation.getDeparture_date(),
                reservation.getNo_of_customer(),
                reservation.getRoom_qty());
        System.out.println("set Reservation :" + b);
        return b;
    }

    @Override
    public boolean setRoom(Room room) throws Exception {
        System.out.println("room :"+ room);
        Boolean b= CrudUtil.execute("UPDATE room SET reservation_id=? WHERE rid=?", connection, 
                room.getReservation_id(),
                room.getRid());
        System.out.println("set Room :" + b);
        return b;
    }

    @Override
    public boolean setMeal(Meal meal) throws Exception {
        System.out.println("set Meal :" + meal);
            Boolean b= CrudUtil.execute("INSERT INTO meal VALUES(?,?,?,?)", connection, 
                    meal.getMid(),
                    meal.getReservation_id(),
                    meal.getMeal_type(),
                    meal.getMeal_qty());
            System.out.println("setMeal :" + b);
            return b;
    }


    @Override
    public void setConnection(Connection connection) throws Exception {
        this.connection=connection;
    }

    @Override
    public ArrayList<Room> getLuxaryRoom() throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT * FROM room WHERE room_type='Luxary'", connection);
        ArrayList<Room> arrayList = new ArrayList<>();
        while (rst.next()) {            
           arrayList.add(new Room(rst.getInt(1),rst.getInt(2),rst.getString(3)));
        }
        return arrayList;
    }

    @Override
    public ArrayList<Room> getSuperLuxaryRoom() throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT * FROM room WHERE room_type='Super Luxary'", connection);
        ArrayList<Room> arrayList = new ArrayList<>();
        while (rst.next()) {
           arrayList.add(new Room(rst.getInt(1),rst.getInt(2),rst.getString(3)));
        }
        return arrayList;
    }

    @Override
    public String getDepartureDate(int reserveID) throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT departure_date FROM reservation WHERE reservation_id = ?", connection, reserveID);
        if (rst.next()) {
            return rst.getString(1);
        }
        return null;
    }

    @Override
    public int getMealID() throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT mid FROM meal ORDER BY mid DESC LIMIT 1", connection);
        if (rst.next()) {
            int mid = rst.getInt(1);
            mid++;
            return mid;
        }
        return 1;
    }

    @Override
    public int getReservationID() throws Exception {
        ResultSet rst = CrudUtil.execute("SELECT reservation_id FROM reservation ORDER BY reservation_id DESC LIMIT 1", connection);
        if (rst.next()) {
            int resid = rst.getInt(1);
            resid++;
            return resid;
        }
        return 1;
    }

    @Override
    public ArrayList<Room> getNormalRoom() throws Exception {
        ResultSet rst  = CrudUtil.execute("SELECT * FROM room WHERE room_type='Normal' ", connection );
        ArrayList <Room> arrayList = new ArrayList<>();
        while(rst.next()){
            arrayList.add(new Room(
                    rst.getInt(1),
                    rst.getInt(2),
                    rst.getString(3)
            ));
        }
        return arrayList;
    }
    
}
