package com.masai.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Trainer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int trainer_id;
    private String trainer_name;
    private int year_of_experience;
    private String email;

    @OneToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER,mappedBy = "trainer")
    private List<Gym> gymList =new ArrayList<>();


    public int getTrainer_id() {
        return trainer_id;
    }

    public void setTrainer_id(int trainer_id) {
        this.trainer_id = trainer_id;
    }

    public String getTrainer_name() {
        return trainer_name;
    }

    public void setTrainer_name(String trainer_name) {
        this.trainer_name = trainer_name;
    }

    public int getYear_of_experience() {
        return year_of_experience;
    }

    public void setYear_of_experience(int year_of_experience) {
        this.year_of_experience = year_of_experience;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Gym> getGymList() {
        return gymList;
    }

    public void setGymList(List<Gym> gymList) {
        this.gymList = gymList;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "trainer_id=" + trainer_id +
                ", trainer_name='" + trainer_name + '\'' +
                ", year_of_experience=" + year_of_experience +
                ", email='" + email + '\'' +
                '}';
    }
}
