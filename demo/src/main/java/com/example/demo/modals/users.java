package com.example.demo.modals;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class users {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int id;
    private String first_name;
    private String last_name;
    private int count;
    private String email_address;
    private int phone_number;
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

  
   
    

    public users(int id, String first_name, String last_name, int count, String email_address, int phone_number) {
        this.id = id;
        this.first_name = first_name;
        this.last_name = last_name;
        this.count = count;
        this.email_address = email_address;
        this.phone_number = phone_number;
    }

    public users() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

   

    public String getEmail_address() {
        return email_address;
    }

    public void setEmail_address(String email_address) {
        this.email_address = email_address;
    }

    public int getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(int phone_number) {
        this.phone_number = phone_number;
    }
    @Override
    public String toString() {
        return "users [id=" + id + ", first_name=" + first_name + ", last_name=" + last_name + ", count=" + count
                + ", email_address=" + email_address + ", phone_number=" + phone_number + "]";
    }
   

}
