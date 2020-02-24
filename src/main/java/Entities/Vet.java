package Entities;

import Entities.Animal;

public class Vet {

    private String name;



    public void giveMedication(Dog dog){
        System.out.println(dog.getName() + " got his medicine from the Vet");
        dog.setHealth(dog.getHealth() + 20);
        dog.fear();

    }
}
