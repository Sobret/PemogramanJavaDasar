package chapter10_object_oriented.ujian;

 class Hero {
     String name;

 //methode
     void display(){
         System.out.println("nama : " + this.name);
     }
}
class HeroSuperman extends Hero{
}
public class Main {
    public static void main(String[] args) {
        Hero hero1 = new Hero();
        hero1.name = "usuf";
        hero1.display();

        HeroSuperman hero2 = new HeroSuperman();
        hero2.name = "edi";
        hero2.display();

    }

}
