public class Vet {

    private String name;



    public void giveMedication(Animal animal){
        System.out.println("Animal got his medicine");
        animal.setHealth(animal.getHealth() + 20);
    }
}
