public class Dog extends ANIMALPolymorphism{
    private int breed;

    public void eat(){
//        System.out.println("chomp chomp"); overriding  parent class munch
    }

    public int getBreed(){
        return breed;
    }

    public void setBreed(int breed){
        this.breed = breed;
    }
}
