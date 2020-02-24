import Entities.Dog;
import Entities.Food;
import Entities.Girl;
import Entities.Vet;

public class Run {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Girl girl = new Girl();
        Food food = new Food();
        Vet vet = new Vet();

        girl.setName("Hanah");

        food.setTaste("yaky");

        dog.setName("Rex");
        dog.setAge(2);
        dog.setBreed("PUG");
        dog.setWeight(2);
        dog.setHealth(45);

        girl.rescueAnimal(dog);

        girl.feedAnimal(dog, food);

        System.out.println("Your dog food level is "+ dog.getWeight());

        dog.checkIfHappy();

        girl.giveMedication(dog);
        vet.giveMedication(dog);

        System.out.println(dog.getHealth());

        dog.checkIfHappy();


    }
}
