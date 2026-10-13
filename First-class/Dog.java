

public class Dog extends Animal {
    
    private String breed;
// fields and methods from animal
// name, species , age ,weight
// get(),  set weight() , describe(),


public Dog(String name , String species , int age , double weight , String breed)
{
    super(name , species , age , weight);
    this.breed = breed;
}
//overriding
@Override 
public void describe(){
    super.describe();
    System.out.println("Breed:" + breed) ;
}
}



