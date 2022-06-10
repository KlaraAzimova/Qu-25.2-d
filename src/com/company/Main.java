package com.company;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        HashSet<City> cityHashSet = new HashSet<>();
        cityHashSet.add(new City(+3, "Biskek"));
        cityHashSet.add(new City(+7, "Russia"));
        cityHashSet.add(new City(+1, "USA"));
        cityHashSet.add(new City(+90, "Turkey"));
        cityHashSet.add(new City(+77, "Kazaxstan"));
//        for (City city : cityHashSet) {
//            System.out.println(city);
//        }
//        System.out.println();

        TreeSet<City> cities = new TreeSet<>(cityHashSet);
        for (City k : cities) {
            if (k.getCode() % 2 != 0) {
                System.out.println(k);
            }
        }
    }
}