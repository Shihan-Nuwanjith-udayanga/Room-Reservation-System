/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.service;

import java.rmi.server.UnicastRemoteObject;
import lk.ijse.hotel_common.service.RemoteServiceFactory;
import lk.ijse.hotel_common.service.ServiceType;
import lk.ijse.hotel_common.service.SuperService;
import lk.ijse.hotel_server.service.impl.ReservationServiceImpl;

/**
 *
 * @author Dell
 */
public class ServiceFactory extends UnicastRemoteObject implements RemoteServiceFactory{

    private static ServiceFactory serviceFactory;
    
    private ServiceFactory()throws Exception{
        
    }
    
    public static ServiceFactory getInstance()throws Exception{
        return (serviceFactory == null) ? (serviceFactory = new ServiceFactory()): serviceFactory;
    }
    
    @Override
    public SuperService getService(ServiceType serviceType) throws Exception {
        switch(serviceType){
            case RESERVATION:
                return new ReservationServiceImpl();
                
            default:
                return null;
        }
    }
    
}
