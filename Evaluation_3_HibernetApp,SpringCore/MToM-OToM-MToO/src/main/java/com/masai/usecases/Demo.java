package com.masai.usecases;

import com.masai.entities.Gym;
import com.masai.entities.Person;
import com.masai.entities.Trainer;
import com.masai.utility.EMUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;

import java.util.List;

public class Demo {

    public static void main(String[] args) {
        EntityManager em = EMUtil.provideEntityManager();

//        Gym gym=new Gym();
//        gym.setGym_name("A");
//        gym.setMonthly_fee(900);
//        em.getTransaction().begin();
//        em.persist(gym);
//        em.getTransaction().commit();
//        em.close();
//        System.out.println(gym);


//      Gym gym=em.find(Gym.class,1);
//
//      Person p=new Person();
//      p.setName("Aman");
//      p.setEmail("aman@gmail.com");
//      p.setMobile("989399393");
//      p.getGymList().add(gym);
//
//      gym.getPersonList().add(p);
//
//       em.getTransaction().begin();
//        em.persist(p);
//        em.getTransaction().commit();
//        em.close();
//      System.out.println(p);


//        Trainer trainer=new Trainer();
//        trainer.setTrainer_name("xyz");
//        trainer.setEmail("xyz@gmail.com");
//        trainer.setYear_of_experience(4);
//
//        em.getTransaction().begin();
//        em.persist(trainer);
//        em.getTransaction().commit();
//        em.close();
//        System.out.println(trainer);


//        Gym gym = em.find(Gym.class, 1);
//
//        Trainer trainer = new Trainer();
//        trainer.setTrainer_name("xyz");
//        trainer.setEmail("xyz@gmail.com");
//        trainer.setYear_of_experience(4);
//
//        gym.setTrainer(trainer);
//
//        trainer.getGymList().add(gym);
//
//
//
//        em.getTransaction().begin();
//        em.persist(trainer);
//        em.getTransaction().commit();
//        em.close();
//        System.out.println(trainer);
//      System.out.println(trainer.getGymList());


        // String name="A";

        String jpql = "from Gym where gym_name=:gn";

        Query q = em.createQuery(jpql);
        q.setParameter("gn", "A");
        List<Gym> gymList = q.getResultList();
        System.out.println(gymList);

        System.out.println("===================================================================================");
        List<Person> p = gymList.get(0).getPersonList();





        p.forEach(p1 -> System.out.println(p1));


    }
}
