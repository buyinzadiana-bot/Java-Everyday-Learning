public class ANIMALPolymorphism {
    private String name;
    private String color;

    public void eat(){
        System.out.println("Munch");
    }
    public String getName(){
        return name;
    }
    public String setName(String name){
        this.name = name;
    }
}
