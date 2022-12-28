package com.masai.usecases;

import com.masai.dao.UserDao;
import com.masai.dao.UserDaoImpl;
import com.masai.entities.User;
import com.masai.exceptions.UserNotFoundException;

import java.util.List;
import java.util.Scanner;

public class GetUserByNameUsecase {


    public static void main(String[] args) {
        UserDao dao= new UserDaoImpl();

        Scanner sc =new Scanner(System.in);
        System.out.println("Enter User Name to find User");

        String name= sc.next();

        try {
          List<User> users= dao.findByName(name);

          users.forEach(u -> System.out.println(u.getPhones()));

//          for (User u:users){
//              System.out.println(u.getPhones());
//              System.out.println("======================================");
//          }

        } catch (UserNotFoundException e) {
            System.out.println(e);

        }
    }
}
