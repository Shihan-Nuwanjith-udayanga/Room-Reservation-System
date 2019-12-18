/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_client.connector;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.hotel_common.service.RemoteServiceFactory;
import lk.ijse.hotel_common.service.ServiceType;
import lk.ijse.hotel_common.service.custom.ReservationService;

/**
 *
 * @author Dell
 */
public class ProxyHandler {
    private static ProxyHandler proxyHandler;
    private ReservationService reservationService;

    public ProxyHandler() {
        try {
            RemoteServiceFactory lookup =  (RemoteServiceFactory) Naming.lookup("rmi://localhost:5050/Reservation");
            reservationService = (ReservationService) lookup.getService(ServiceType.RESERVATION);

        } catch (NotBoundException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (MalformedURLException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (RemoteException ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        } catch (Exception ex) {
            Logger.getLogger(ProxyHandler.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static ProxyHandler getInstance(){
        return (proxyHandler==null)?(proxyHandler = new ProxyHandler()):proxyHandler;
    }
    
    public ReservationService getReservation(){
        return reservationService;
    }
}
