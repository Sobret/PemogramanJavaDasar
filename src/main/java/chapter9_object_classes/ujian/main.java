package chapter9_object_classes.ujian;

public class main {
    public static void main(String[] args){

        pegawai Pegawai = new pegawai();
        manager Manager = new manager();
        kasir Kasir = new kasir();
        koki Koki = new koki();
        pelayan Pelayan = new pelayan();
        satpam Satpam = new satpam();

        Manager.nama = "Usuf";
        Manager.id_pegawai = 111;
        Manager.gaji = "10 Juta";

        Kasir.nama = "Edi";
        Kasir.id_pegawai = 222;
        Kasir.gaji = "3 Juta";

        Koki.nama = "Kusoy";
        Koki.id_pegawai = 333;
        Koki.gaji = "3,5 Juta";

        Pelayan.nama = "Amin";
        Pelayan.id_pegawai = 444;
        Pelayan.gaji = "2 Juta";

        Satpam.nama = "Anang";
        Satpam.id_pegawai = 555;
        Satpam.gaji = "1,5 Juta";

        Pegawai.menampilkan();
        Manager.menampilkan();
        Manager.tugas();
        Kasir.menampilkan();
        Kasir.tugas();
        Koki.menampilkan();
        Koki.tugas();
        Pelayan.menampilkan();
        Pelayan.tugas();
        Satpam.menampilkan();
        Satpam.tugas();
    }
}

