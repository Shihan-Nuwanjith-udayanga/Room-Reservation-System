/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_common.service.custom;

import java.util.ArrayList;
import lk.ijse.hotel_common.dto.ReservationDTO;
import lk.ijse.hotel_common.service.SuperService;

/**
 *
 * @author Dell
 */
public interface ReservationService extends SuperService {

    public boolean book(ReservationDTO rdto) throws Exception;

    public ArrayList<ReservationDTO> searchByType(String roomType) throws Exception;

    public int getMealID() throws Exception;

    public int getReservationID() throws Exception;

}
