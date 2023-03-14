package chapter10_object_oriented.ujian;

public class Hewani {
    public  Hewani () {

        System.out.println("Hewan mamalia");
    }
}
class Kucingu extends Hewani {
    public Kucingu () {

        super ();
        System.out.println("kucing bersuara meong");
    }
}
class main1 {
    public static void main(String[] args) {

        Hewani hewan = new Hewani();
        System.out.println("apakah hewan is-a objek -> " + (hewan instanceof Object));
        System.out.println("apakah hewan is-a Hewan -> " + (hewan instanceof Hewani));
        System.out.println("apakah hewan is-a Kucing -> " + (hewan instanceof Kucingu));
        System.out.println("--------------------------");
        Kucingu kucing = new Kucingu();
        System.out.println("apakah hewan is-a objek -> " + (kucing instanceof Object));
        System.out.println("apakah hewan is-a Hewan -> " + (kucing instanceof Hewani));
        System.out.println("apakah hewan is-a Kucing -> " + (kucing instanceof Kucingu));
    }
}
