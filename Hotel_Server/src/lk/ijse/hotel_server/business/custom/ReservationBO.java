/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.business.custom;

import java.util.ArrayList;
import lk.ijse.hotel_common.dto.ReservationDTO;
import lk.ijse.hotel_server.business.SuperBO;

/**
 *
 * @author Dell
 */
public interface ReservationBO extends SuperBO {

   public boolean book(ReservationDTO rdto) throws Exception;

    public ArrayList<ReservationDTO> searchByType(String roomType) throws Exception;

    public int getMealID() throws Exception;

    public int getReservationID() throws Exception;

}
