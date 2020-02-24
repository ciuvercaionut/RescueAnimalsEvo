package Entities;

public class Girl {

    private String name;
    private int age;
    Dog dog;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void rescueAnimal(Dog dog){
        dog.setRescued(true);
        System.out.println(name + " has rescued " + dog.getName());

    }

    public void feedAnimal(Animal animal, Food food){

        if(food.getTaste().equalsIgnoreCase("good")){
            animal.setWeight(animal.getWeight() + 0.5);
            animal.setHealth(animal.getHealth() + 5);
        }else{
            animal.setWeight(animal.getWeight() + 0.2);
            animal.setHealth(animal.getHealth() + 2);
        }
    }

    public void giveMedication(Dog dog){
        System.out.println(dog.getName() +  " got his medicine");
        dog.setHealth(dog.getHealth() + 6);
        dog.giveLove();
    }
}
