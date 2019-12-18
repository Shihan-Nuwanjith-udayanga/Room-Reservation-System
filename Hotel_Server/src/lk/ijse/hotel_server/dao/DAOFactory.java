/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.dao;

import lk.ijse.hotel_server.dao.custom.impl.ReservationDAOImpl;

/**
 *
 * @author Dell
 */
public class DAOFactory {
    
    private static DAOFactory dAOFactory;

    public DAOFactory() {
    }
    
    public static DAOFactory getInstance(){
        return (dAOFactory == null) ? (dAOFactory = new DAOFactory()) : dAOFactory;
    }
    
    public SuperDAO getDAO(DAOTypes dAOTypes){
        switch (dAOTypes){
            case RESERVATION:
                return new ReservationDAOImpl();
            default:
                return null;
        }
    }
}
