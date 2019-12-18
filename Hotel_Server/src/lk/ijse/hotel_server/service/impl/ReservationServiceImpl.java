/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.service.impl;

import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.hotel_common.dto.ReservationDTO;
import lk.ijse.hotel_common.observer.Observer;
import lk.ijse.hotel_common.service.custom.ReservationService;
import lk.ijse.hotel_server.business.BOFactory;
import lk.ijse.hotel_server.business.BOTypes;
import lk.ijse.hotel_server.business.custom.ReservationBO;
import lk.ijse.hotel_server.service.reservation.impl.ReservationImpl;

/**
 *
 * @author Dell
 */
public class ReservationServiceImpl extends UnicastRemoteObject implements ReservationService {

    ReservationBO bO = (ReservationBO) BOFactory.getInstance().getBO(BOTypes.RESERVATION);

    private static ArrayList<Observer> observers = new ArrayList<>();
    
    private ReservationImpl<ReservationService> reservationImpl = new ReservationImpl<ReservationService>();

    public ReservationServiceImpl() throws Exception {

    }

    @Override
    public boolean book(ReservationDTO rdto) throws Exception {
        boolean book = bO.book(rdto);
        if (book) {
            notify("");
            return true;
        }
        return false;
    }

    @Override
    public void register(Observer observer) throws Exception {
        observers.add(observer);
    }

    @Override
    public void remove(Observer observer) throws Exception {
        observers.remove(observer);
    }

    @Override
    public void notify(String message) throws Exception {
        for (Observer observer : observers) {
            new Thread(
                    new Runnable() {
                @Override
                public void run() {
                    try {
                        observer.update(message);
                    } catch (Exception ex) {
                        Logger.getLogger(ReservationServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            ).start();
        }
    }

    @Override
    public ArrayList<ReservationDTO> searchByType(String roomType) throws Exception {
         return bO.searchByType(roomType);
    }

    @Override
    public int getMealID() throws Exception {
        return bO.getMealID();
    }

    @Override
    public int getReservationID() throws Exception {
        return bO.getReservationID();
    }

    @Override
    public boolean reserve(Object key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean release(Object key) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
