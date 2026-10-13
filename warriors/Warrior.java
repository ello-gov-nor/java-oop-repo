
public  abstract class Warrior{


    private String   name;
    private String   fightingStyle;
    private int      age;
    private String    village;
    private boolean    isAlive = true ;  
    private String   weapon;
    private String   skill;


  
            public Warrior( String name,String village, int age, String fightingStyle , String weapon , String skill){

            this.name = name;
            this.village = village;
            this.age  = age;
            this.fightingStyle = fightingStyle;
            this.weapon = weapon;
            this.skill  = skill;
        }

        
    public String getName(){
        return name;
    }

    public String getVillage(){
        return village;
    }

    public int getAge(){
        return age;
    }
    
    public String getFightingStyle(){
        return fightingStyle;
    }
    
    public String getWeapon(){
        return weapon;
    }
    
    public String getSkill(){
        return skill;
    }

    public void setVillage(String village){
       this.village = village;

    }
    
      public void setAge(int age){
        this .age = age;
    }
    
    public void setIsAlive( boolean isAlive){
     this.isAlive = isAlive;

    }
 
    public boolean getIsAlive(){
        return isAlive;
    } 
    
public abstract String battleCry();

    @Override
    public String toString(){
return name + " is a  " +  age   + "  year old " +  village + " warrior who uses " + fightingStyle + " as well as a " + weapon + " equipped with " + skill ;

    } 

   }


























