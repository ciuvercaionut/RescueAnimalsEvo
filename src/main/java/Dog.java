public class Dog  extends Animal{

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }






    public void giveLove(){
        System.out.println("Love you");
    }

    public void fear(){
        System.out.println("frightened");
    }

    public void checkIfHappy(){
        if(getFoodLvl() > 50){
            System.out.println("Happy dog");
        } else if(getFoodLvl() < 10) {
            System.out.println("your dog is starving man");
        }    else
        {
            System.out.println("Sad dog");
        }
    }
}
