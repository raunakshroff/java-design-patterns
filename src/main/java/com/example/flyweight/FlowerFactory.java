package com.example.flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlowerFactory {

  private static Map<String, Flower> flowerCache = new HashMap<>();

  public static Flower getFlower(String name) {

    return flowerCache.computeIfAbsent(name, Flower::new);

  }

}
