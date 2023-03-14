package chapter9_object_classes.latihan;

import chapter11_inheri_polymorphism.exercise.Student;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Employee note = new Employee();

        System.out.print("Masukan jumlah siswa: ");
        String[] siswa = new String[input.nextInt()];

        for (int i = 0; i < siswa.length; i++)
            System.out.println("Masukan nama siswa ke" + (i + 1) + ": ");

        System.out.print("Masukan Id              : ");
        Long id = input.nextLong();
        note.setId(id);

        System.out.print("Masukan Name            : ");
        String name = input.next();
        note.setName(name);

        System.out.print("Masukan address         : ");
        String anddress = input.next();
        note.setAddress(anddress);

        System.out.print("Masukan Age             : ");
        int age = input.nextInt();
        note.setAge(age);

        System.out.print("Masukan BasicSalary     : ");
        double basicsalary = input.nextDouble();
        note.setBasicsalary(basicsalary);

        System.out.print("Masukan PresentegSalary : ");
        double presentegbonussalary = input.nextDouble();
        note.setPresentegbonudsalary(presentegbonussalary);

        System.out.print("Masukan TotalSalary     : ");
        double totalsalary = input.nextDouble();
        note.setTotalsalary(totalsalary);

        System.out.print("Data Student");
        System.out.print("Masukan Id              : " );
        System.out.print("Masukan Name            : " );
        System.out.print("Masukan address         : " );
        System.out.print("Masukan Age             : " );
        System.out.print("Masukan BasicSalary     : " );
        System.out.print("Masukan PresentegSalary : " );
        System.out.print("Masukan TotalSalary     : " );
        System.out.print("==================================");
        

    }
}
