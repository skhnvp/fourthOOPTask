package ru.stepup.oop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class City {
    private String name;
    private List<Road> arrOfRoads = new ArrayList<>();

    public City(String name) {
        this.name = name;
    }

    public City(String name, Road... road) {
        this.name = name;
        arrOfRoads.addAll(Arrays.asList(road));
    }

    public void travelBy(int n) {
        if (n != 0) {
            int randomCityIndex = (int) (Math.random() * arrOfRoads.size());

            System.out.println("Прибытие в город: " + arrOfRoads.get(randomCityIndex).getCity());
            arrOfRoads.get(randomCityIndex).getCity().travelBy(--n);
        }

    }

    public void travelToA(int n) {
        if (n != 0) {
            if (n == 3) {
                for (int i = 0; i < arrOfRoads.size(); i++) {
                    if (!Objects.equals(arrOfRoads.get(i).getCity().name, "A")) {
                        System.out.println("Прибытие в город: " + arrOfRoads.get(i).getCity());
                        arrOfRoads.get(i).getCity().travelToA(n - 1);
                    }
                }
            }
            if (n == 2) {
                for (int i = 0; i < arrOfRoads.size(); i++) {
                    if (!Objects.equals(arrOfRoads.get(i).getCity().name, "B")) {
                        System.out.println("Прибытие в город: " + arrOfRoads.get(i).getCity());
                        arrOfRoads.get(i).getCity().travelToA(n - 1);
                    }
                }
            }
            if (n == 1) {
                for (int i = 0; i < arrOfRoads.size(); i++) {
                    if (Objects.equals(arrOfRoads.get(i).getCity().name, "A")) {
                        System.out.println("Прибытие в город: " + arrOfRoads.get(i).getCity());
                        arrOfRoads.get(i).getCity().travelToA(n - 1);
                    }
                }
            }

        }

    }

    public void addRoad(Road road) {
        this.arrOfRoads.add(road);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Город: " + name + "\nСписок связанных городов: \n" + arrOfRoads;
    }
}
