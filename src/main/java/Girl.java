public class Girl {

    private String name;
    private int age;


    public void rescueAnimal(){
        System.out.println("I've rescued an animal");
    }

    public void feedAnimal(Animal animal, Food food){

        if(food.getTaste().equalsIgnoreCase("good")){
            animal.setFoodLvl(animal.getFoodLvl() + 10);
            animal.setHealth(animal.getHealth() + 5);
        }else{
            animal.setFoodLvl(animal.getFoodLvl() + 6);
            animal.setHealth(animal.getHealth() + 2);
        }

    }

    public void giveMedication(Animal animal){
        System.out.println("Animal got his medicine");
        animal.setHealth(animal.getHealth() + 6);
    }
}
