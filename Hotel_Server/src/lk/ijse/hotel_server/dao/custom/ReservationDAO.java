/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.dao.custom;

import java.util.ArrayList;
import java.util.Date;
import lk.ijse.hotel_server.dao.SuperDAO;
import lk.ijse.hotel_server.entity.Customer;
import lk.ijse.hotel_server.entity.Meal;
import lk.ijse.hotel_server.entity.Reservation;
import lk.ijse.hotel_server.entity.Room;

/**
 *
 * @author Dell
 */
public interface ReservationDAO extends SuperDAO {

    public boolean addCustomer(Customer customer) throws Exception;

    public boolean setReservation(Reservation reservation) throws Exception;

    public boolean setRoom(Room room) throws Exception;

    public boolean setMeal(Meal meal) throws Exception;

    public ArrayList<Room> getNormalRoom() throws Exception;

    public ArrayList<Room> getLuxaryRoom() throws Exception;

    public ArrayList<Room> getSuperLuxaryRoom() throws Exception;

    public String getDepartureDate(int reserveID) throws Exception;

    public int getMealID() throws Exception;

    public int getReservationID() throws Exception;

}
