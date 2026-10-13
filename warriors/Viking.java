public class Viking extends Warrior {


    private boolean canDualwield;

    public Viking (String name,String village, int age, String fightingStyle , String weapon , String skill , boolean canDualwield){
    super( name, village , age , fightingStyle , weapon , skill );

    this.canDualwield = canDualwield;
 }


public boolean getCanDualwield(){

    return canDualwield;
}

public void setCanDualwield(boolean canDualwield){
 this.canDualwield = canDualwield;

}
@Override 
public String toString(){

   return super.toString() +   " canDualwield : " +  canDualwield ;
}
@Override 
public String battleCry(){
    return getName() + " shouts : for Valhalla ";
}

}