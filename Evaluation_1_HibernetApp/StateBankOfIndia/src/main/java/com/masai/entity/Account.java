package com.masai.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String email;
    private String address;

    private double balance;
    @Temporal(TemporalType.DATE)
    private Date created_date;

    public Account() {
    }

    public Account(String email, String address, double balance) {
        this.email = email;
        this.address = address;
        this.balance = balance;
    }

    public Account(String email, String address, double balance, Date created_date) {
        this.email = email;
        this.address = address;
        this.balance = balance;
        this.created_date = created_date;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Date getCreated_date() {
        return created_date;
    }

    public void setCreated_date(Date created_date) {
        this.created_date = created_date;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", balance=" + balance +
                ", created_date=" + created_date +
                '}';
    }
}
