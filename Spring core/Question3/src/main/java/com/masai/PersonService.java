package com.masai;

import javax.swing.text.html.parser.Entity;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class PersonService {

    private Map<Person, Skill> skillMap;

    public void setSkillMap(Map<Person, Skill> skillMap) {
        this.skillMap = skillMap;
    }

    private List<Person> personList;

    public void setPersonList(List<Person> personList) {
        this.personList = personList;
    }

    public void printSkillMap(){
        //print all the person's and their skill details from the skillMap

        for(Map.Entry<Person, Skill> entityset:skillMap.entrySet()){
            System.out.println(entityset.getKey().toString());
            System.out.println(entityset.getValue().toString());
            System.out.println("==================================");
        }
    }

    public void printPersonList(){
        //sort the List of Person according to the increasing order of the age
        //print all the sorted Person Details

        Collections.sort(personList,(a,b)->a.getAge()>b.getAge()?1:-1);

        personList.forEach(person -> System.out.println(person));
    }
}
