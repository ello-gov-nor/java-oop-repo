
public class Rat extends Animal {
    private boolean omnivore;

public Rat(String name, String species , int age , double weight , boolean omnivore ){
    super(name, species , age , weight);
    this.omnivore = omnivore;


}
 @Override 

 public void describe(){
    super.describe();
    String access  = omnivore
    ? "omnivore" : " vegan ";
    System.out.println(" Strictly " + access );
 }
    
}