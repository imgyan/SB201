package com.masai.usecases;

import com.masai.dao.UserDao;
import com.masai.dao.UserDaoImpl;
import com.masai.entities.PhoneNumber;
import com.masai.entities.PhoneType;
import com.masai.entities.User;
import com.masai.exceptions.UserNotFoundException;

public class CreateUserUsecase {

    public static void main(String[] args)  {
        UserDao dao=new UserDaoImpl();

        User user =new User();
        user.setUserName("Aman");
        user.setEmailId("aman@gmail.com");
        user.getPhones().add(new PhoneNumber(1,"904725573",PhoneType.HOME));
        user.getPhones().add(new PhoneNumber(2,"804725573",PhoneType.LANDLINE));
        user.getPhones().add(new PhoneNumber(3,"704725573",PhoneType.OFFICE));



        try {
            System.out.println(dao.createUser(user));
        } catch (UserNotFoundException e) {
            System.out.println(e);
        }




    }

}
