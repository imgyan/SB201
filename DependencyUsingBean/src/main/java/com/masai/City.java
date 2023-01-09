package com.masai;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class City {
    @Value("#{'${cities}'.split(',')}")
  // @Value("${cities}")
    private List<String> cities;


    public void funA() {
        System.out.println(cities.size());
      cities.forEach(c-> System.out.println(c));
    }

}
