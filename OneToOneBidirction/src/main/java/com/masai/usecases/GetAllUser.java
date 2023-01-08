package com.masai.usecases;

import com.masai.entities.User;
import com.masai.utility.EMUtil;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

public class GetAllUser {

    public static void main(String[] args) {
        EntityManager em= EMUtil.provideEntityManager();

          Query  q= em.createQuery("from User");
          List<User>  userList=q.getResultList();
          userList.forEach(u-> System.out.println(u));
    }
}
