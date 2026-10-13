
public class Ninja extends Warrior implements Stealthy {

private boolean canVanish;

public Ninja ( String name,String village, int age, String fightingStyle , String weapon , String skill , boolean canVanish){
 super(name, village,age,fightingStyle ,weapon ,skill);

    this.canVanish = canVanish;
}

    public boolean getCanVanish(){
        return canVanish;
    }

public void setCanVanish(boolean canVanish){
       this.canVanish = canVanish;

}

 
 public String toString(){
 return super.toString() + " and canVanish: " + canVanish;

}

@Override 
public String battleCry(){
    return getName()  + " shouts : attack ";
}

@Override 
public void sneak(){

    System.out.println( getName() + " crawls through the bushes and slips gently into the shadows. ");
}


}