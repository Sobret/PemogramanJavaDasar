package chapter10_object_oriented.ujian;

 abstract class Hewan {
     protected abstract void munculSuara();
 }

class Kucing extends Hewan {

    @Override
    protected void munculSuara() {
        System.out.println("Suara Kucing: Meow...meow..meow.");
    }
}
class Burung extends Hewan {

    @Override
    protected void munculSuara() {
        System.out.println("Suara Burung: Cit...cit..cit.");
    }
}
 class Tampil {

    public static void main (String[] args) {
        Hewan kucing = new Kucing();
        kucing.munculSuara();

        Hewan burung = new Burung();
        burung.munculSuara();
    }

}


