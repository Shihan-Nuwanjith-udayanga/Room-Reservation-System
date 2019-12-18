/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.business.custom.impl;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Date;
import lk.ijse.hotel_common.dto.ReservationDTO;
import lk.ijse.hotel_server.business.custom.ReservationBO;
import lk.ijse.hotel_server.dao.DAOFactory;
import lk.ijse.hotel_server.dao.DAOTypes;
import lk.ijse.hotel_server.dao.custom.ReservationDAO;
import lk.ijse.hotel_server.db.DBConnection;
import lk.ijse.hotel_server.entity.Customer;
import lk.ijse.hotel_server.entity.Meal;
import lk.ijse.hotel_server.entity.Reservation;
import lk.ijse.hotel_server.entity.Room;

/**
 *
 * @author Dell
 */
public class ReservationBOImpl implements ReservationBO{
    
    ReservationDAO dAO = (ReservationDAO) DAOFactory.getInstance().getDAO(DAOTypes.RESERVATION);

    @Override
    public boolean book(ReservationDTO rdto) throws Exception {
        try(Connection connection = DBConnection.getInstance().getConnection()){
            dAO.setConnection(connection);
            connection.setAutoCommit(false);
            boolean addCustomer = dAO.addCustomer(new Customer(
                    rdto.getCid(),
                    rdto.getCustomer_name(),
                    rdto.getCustomer_address(),
                    rdto.getCustomer_contact()));
            if (addCustomer) {
                boolean setReservation = dAO.setReservation(new Reservation(
                        rdto.getCid(),
                        rdto.getReservation_id(),
                        rdto.getArrival_date(),
                        rdto.getDeparture_date(),
                        rdto.getNo_of_customr(),
                        rdto.getRoom_qty()));
                if (setReservation) {
                    boolean setRoom = dAO.setRoom(new Room(
                            rdto.getRid(),
                            rdto.getReservation_id(),
                            rdto.getRoom_type()));
                    if (setRoom) {
                        boolean setMeal = dAO.setMeal(new Meal(
                                rdto.getMid(),
                                rdto.getReservation_id(),
                                rdto.getMeal_type(),
                                rdto.getMeal_qty()));
                        if (setMeal) {
                            connection.commit();
                            return true;
                        }
                    }
                }
            }else{
                connection.rollback();
                return false;
            }
        }catch(Exception ex){
            ex.printStackTrace();
        }finally{
        return false;           
        }
    }

    @Override
    public ArrayList<ReservationDTO> searchByType(String roomType) throws Exception {
         try (Connection connection = DBConnection.getInstance().getConnection()) {
            dAO.setConnection(connection);
            ArrayList<ReservationDTO> roomList = new ArrayList<>();
            if (roomType.equals("Normal")) {
                ArrayList<Room> normalRoom = dAO.getNormalRoom();
                for (Room room : normalRoom) {
                    if (room.getReservation_id()== 0) {
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                null));
                    } else {
                        String departureDate = dAO.getDepartureDate(room.getReservation_id());
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                departureDate));
                    }
                }
                return roomList;
            }
            if (roomType.equals("Luxary")) {
                ArrayList<Room> luxaryRoom = dAO.getLuxaryRoom();
                for (Room room : luxaryRoom) {
                    if (room.getReservation_id()== 0) {
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                null));
                    } else {
                        String departureDate = dAO.getDepartureDate(room.getReservation_id());
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                departureDate));
                    }
                }
                return roomList;
            }
            if (roomType.equals("Super Luxary")) {
                ArrayList<Room> SuperLuxaryRoom = dAO.getSuperLuxaryRoom();
                for (Room room : SuperLuxaryRoom) {
                    if (room.getReservation_id()== 0) {
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                null));
                    } else {
                        String departureDate = dAO.getDepartureDate(room.getReservation_id());
                        roomList.add(new ReservationDTO(
                                room.getRid(),
                                room.getReservation_id(),
                                room.getRoom_type(),
                                departureDate));
                    }
                }
                return roomList;
            } else {
                return null;
            }
        }

    }

    @Override
    public int getMealID() throws Exception {
        try (Connection connection = DBConnection.getInstance().getConnection()) {
            dAO.setConnection(connection);
            return dAO.getMealID();
        }
    }

    @Override
    public int getReservationID() throws Exception {
         try (Connection connection = DBConnection.getInstance().getConnection()) {
            dAO.setConnection(connection);
            return dAO.getReservationID();
        }
    }
    
}
