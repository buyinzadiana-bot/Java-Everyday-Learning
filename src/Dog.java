public class Dog extends ANIMALPolymorphism{
    private int breed;

    public void eat(){
        System.out.println("chomp chomp");
    }
//    overriding  parent class munch munch

    public void eat(int numberOfTimes) {
        for (int i = 0; i < numberOfTimes; i++) {
            System.out.println("chomp chomp");
        }
//        methord overloading
    }

    public int getBreed(){
        return breed;
    }

    public void setBreed(int breed){
        this.breed = breed;
    }
}
