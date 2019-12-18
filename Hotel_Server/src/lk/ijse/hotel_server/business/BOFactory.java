/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.business;

import lk.ijse.hotel_server.business.custom.impl.ReservationBOImpl;

/**
 *
 * @author Dell
 */
public class BOFactory {
    private static BOFactory bOFactory;

    public BOFactory() {
    }
    
    public static BOFactory getInstance(){
        return (bOFactory == null) ? (bOFactory = new BOFactory()) : bOFactory;
    }
    
    public SuperBO getBO(BOTypes bOTypes){
        switch (bOTypes){
            case RESERVATION:
                return new ReservationBOImpl();
           default:
               return null;
        }
    }
    
}
