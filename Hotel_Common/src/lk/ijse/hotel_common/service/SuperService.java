/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_common.service;

import java.rmi.Remote;
import lk.ijse.hotel_common.observer.Subject;
import lk.ijse.hotel_common.reservation.Reserve;

/**
 *
 * @author Dell
 */
public interface SuperService extends Remote, Subject ,Reserve{
    
}
