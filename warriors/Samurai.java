public class Samurai extends Warrior {


    private boolean has_Armour;


public Samurai(String name,String village, int age, String fightingStyle , String weapon , String skill , boolean has_Armour){
         super( name , village , age, fightingStyle , weapon , skill );

this.has_Armour = has_Armour;
}

public  boolean getHas_Armour(){
    return has_Armour;
}
public void setHas_Armour( boolean has_Armour){
this.has_Armour = has_Armour;

}

public String toString(){
    return super.toString() + " has Armour " + has_Armour;
}
    
@Override 
public String battleCry(){
    return getName() + " shouts: honour guides my blade! ";
}

}