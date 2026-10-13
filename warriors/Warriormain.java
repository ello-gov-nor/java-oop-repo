
public class Warriormain{
public static void main (String [] args)
{
Viking  v1 = new Viking( " Rollo ", " Birka ", 19 , " Shieldwall " , " axe " , " Surprise " , true );
Ninja   n1 = new Ninja("Kakashi ", " Leaf ", 25 , " Taijutsu " , " Kunai " , " Speed blitz " , true);
Samurai s1 = new Samurai( "Hanzo" , "Nayushi", 30 , "Kenjutsu" , "Katana" , "Martial arts", true);
Warrior anybody = new Ninja("Guy" , "leaf" , 27 , "taijutsu" , "nunchucks" , "InnerGates" , true);



System.out.println(v1.getName());
System.out.println(v1.getAge());
System.out.println(v1.getVillage());
System.out.println(v1.getFightingStyle());
System.out.println(v1.getWeapon());
System.out.println(v1.getSkill());

v1.setAge(20);

System.out.println(v1.getAge());

v1.setVillage("none village affiliated");
System.out.println(v1.getVillage());


System.out.println(anybody);
System.out.println(v1);
System.out.println(n1);
System.out.println(s1);
System.out.println(v1.battleCry());
System.out.println(s1.battleCry());
System.out.println(n1.battleCry());
System.out.println(anybody.toString());
System.out.println(anybody.canVanish);
System.out.println(anybody.battleCry());

n1.sneak();

anybody.sneak();

}

}