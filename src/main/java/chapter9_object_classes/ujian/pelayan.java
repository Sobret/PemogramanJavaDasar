package chapter9_object_classes.ujian;

public class pelayan extends  pegawai{
    @Override

    public void menampilkan()
    {
        System.out.println("Nama       : " + nama);

        System.out.println("Id Pegawai : "+id_pegawai);

        System.out.println("Gaji       : "+gaji);
    }
    public void tugas(){

        System.out.println("Tugas      : Melayani dan Menyajikan pesanan pembeli");

        System.out.println("---------------------------------------------------");
    }
}

