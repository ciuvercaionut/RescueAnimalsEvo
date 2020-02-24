package Entities;

import Entities.Animal;

public class Dog  extends Animal {

    private String breed;
    private boolean isRescued = false;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public boolean isRescued() {
        return isRescued;
    }

    public void setRescued(boolean rescued) {
        isRescued = rescued;
    }

    public void giveLove() {
        System.out.println("Love you");
    }

    public void fear() {
        System.out.println("mrrrr");
    }

    public void checkIfHappy() {
        if (getWeight() > 2) {
            System.out.println("Happy dog");
        } else if (getWeight() < 1.5) {
            System.out.println("your dog is starving man");
        } else {
            System.out.println("Sad dog");
        }
    }
}