package chapter10_object_oriented.ujian;

import java.util.Calendar;

 abstract class manusia {
    private String namalengkap;
    private int tahunlahir;

    manusia(String namalengkap, int tahunlahir) {
        this.namalengkap = namalengkap;
        this.tahunlahir = tahunlahir;
    }
    protected String getNamalengkap() {
        return namalengkap;
    }
    protected int getTahunlahir() {
        Calendar cal = Calendar.getInstance();
        int tahunsekarang = cal.get(Calendar.YEAR);
        return tahunsekarang-tahunlahir;
    }
    public abstract void menyapa();

}
abstract class poijo extends manusia{
    public poijo (String namalengkap, int tahunlahir) {
        super(namalengkap, tahunlahir);
    }
}
