public class Main {
    public static void main(String[] args) {

////        Inheritance = when one class inherits the attribute and methods from another class
////        child parent relationship
//        Warrior hero =new Warrior ();
//        hero.name = "Diana";
//        hero.attacks();
//        hero.move();

        ANIMALPolymorphism myAnimal = new ANIMALPolymorphism();
        myAnimal.eat();
        Dog myDog = new Dog();
        myDog.eat();
        Cat myCat = new Cat();
        myCat.eat();

    }
}