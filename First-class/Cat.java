public class Cat extends Animal {
    private boolean indoorOnly;

public Cat(String name, String species , int age , double weight , boolean indoorOnly){
    super(name, species , age , weight);
    this.indoorOnly = indoorOnly;


}
 @Override 

 public void describe(){
    super.describe();
    String access  = indoorOnly
    ? "indoor-only" : " outdoor access";
    System.out.println("Living" + access );
 }
    
}