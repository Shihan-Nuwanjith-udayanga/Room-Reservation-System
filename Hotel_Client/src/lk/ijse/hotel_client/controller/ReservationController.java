/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_client.controller;

import java.util.ArrayList;
import lk.ijse.hotel_client.connector.ProxyHandler;
import lk.ijse.hotel_common.dto.ReservationDTO;
import lk.ijse.hotel_common.service.custom.ReservationService;

/**
 *
 * @author Dell
 */
public class ReservationController {
    
    ReservationService reservation = ProxyHandler.getInstance().getReservation();
    
    public boolean book(ReservationDTO rdto) throws Exception{
        return reservation.book(rdto);
    }
    
    public ArrayList<ReservationDTO> searchByType(String roomType) throws Exception {
        return reservation.searchByType(roomType);
    }
    
    public int getMealID() throws Exception {
        return reservation.getMealID();
    }

    public int getReservationID() throws Exception {
        return reservation.getReservationID();
    }
}
