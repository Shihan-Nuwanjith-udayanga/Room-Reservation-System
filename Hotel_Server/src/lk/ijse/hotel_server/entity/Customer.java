/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.hotel_server.entity;

/**
 *
 * @author Dell
 */
public class Customer {
    private int cid;
    private String customer_name;
    private String customer_address;
    private int customer_contact;

    public Customer() {
    }

    public Customer(int cid, String customer_name, String customer_address, int customer_contact) {
        this.cid = cid;
        this.customer_name = customer_name;
        this.customer_address = customer_address;
        this.customer_contact = customer_contact;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(String customer_name) {
        this.customer_name = customer_name;
    }

    public String getCustomer_address() {
        return customer_address;
    }

    public void setCustomer_address(String customer_address) {
        this.customer_address = customer_address;
    }

    public int getCustomer_contact() {
        return customer_contact;
    }

    public void setCustomer_contact(int customer_contact) {
        this.customer_contact = customer_contact;
    }

    @Override
    public String toString() {
        return "Customer{" + "cid=" + cid + ", customer_name=" + customer_name + ", customer_address=" + customer_address + ", customer_contact=" + customer_contact + '}';
    }
    
    
}
