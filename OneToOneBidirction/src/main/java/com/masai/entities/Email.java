package com.masai.entities;

import javax.persistence.*;
import java.time.LocalDate;
@Entity
public class Email {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int mail_id;
    private String    email;
    private LocalDate created_date;
    @OneToOne(mappedBy = "email")
   // @JoinColumn(name = "id")
    private User user;


    public int getMail_id() {
        return mail_id;
    }

    public void setMail_id(int mail_id) {
        this.mail_id = mail_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mail_id='" + mail_id + '\'' +
                ", email='" + email + '\'' +
                ", created_date=" + created_date +
                '}';
    }
}
