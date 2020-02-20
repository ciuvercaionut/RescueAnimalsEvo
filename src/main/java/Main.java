public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Girl girl = new Girl();
        Food food = new Food();
        food.setTaste("yaky");

        dog.setName("Rex");
        dog.setAge(2);
        dog.setBreed("PUG");
        dog.setFoodLvl(78);
        dog.setHealth(45);

        girl.feedAnimal(dog, food);

        System.out.println("Your dog food level is "+ dog.getFoodLvl());

        dog.checkIfHappy();

        dog.setFoodLvl(8);

        dog.checkIfHappy();


    }
}
