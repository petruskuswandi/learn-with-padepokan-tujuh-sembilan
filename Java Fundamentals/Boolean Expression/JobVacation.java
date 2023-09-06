import java.util.Scanner;

/**
 * JobVacation
 */
public class JobVacation {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name, gender, graduate;
        int age, experience;
        double appearance;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2;
        boolean isPassingAdmin, isPassingKoor;

        System.out.println("Selamat datang di PT. Secret Semut 79");
        System.out.printf("=====================================\n\n");
        System.out.println("Silahkan input Data Anda");
        System.out.println("Nama : ");
        name = input.next();

        System.out.println("Umur : ");
        age = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        gender = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        graduate = input.next();

        System.out.println("Pengalaman : ");
        experience = input.nextInt();

        System.out.println("Penampilan : ");
        appearance = input.nextDouble();

        // Pengecekan data untuk persyaratan Koordinator
        /*
            1. Persyaratan Coordinator

            Pria 
            Umur minimal 21 tahun dan maksimal 30 tahun.
            Lulusan SMK/D3
            Memiliki pengalaman minimal 2 Tahun

            Atau

            Pria
            Umur 30 tahun keatas
            Lulusan S1
            Memiliki pengalaman minimal 5 Tahun.
        */

        reqKoor1 = (gender.equalsIgnoreCase("Pria")) && (age >= 21 && age <= 30) && 
        (graduate.equalsIgnoreCase("SMK") || graduate.equalsIgnoreCase("D3") && (experience >= 2));

        reqKoor2 = (gender.equalsIgnoreCase("Pria")) && (age >= 30) && (graduate.equalsIgnoreCase("S1")) && (experience >= 5);

        isPassingKoor = reqKoor1 || reqKoor2;

        // Persyaratan data untuk Persyaratan Admin
        /*
            2. Persyaratan Admin:
            
            Wanita
            Umur minimal 20 tahun dan maksimal 25 tahun
            Lulusan D3
            Memiliki Penampilan yang Menarik atau Pengalaman minimal 1 Tahun.

            Atau 

            Wanita
            Umur diatas 25 tahun.
            Lulusan S1.
            Memiliki Penampilan yang menarik.
            Memiliki Pengalaman minimal 3 Tahun.
        */

        reqAdmin1 = (gender.equalsIgnoreCase("Wanita")) && (age >= 20 && age <= 25) && 
        (graduate.equalsIgnoreCase("D3")) && (appearance>= 8.5 || experience>=3);

        reqAdmin2 = (gender.equalsIgnoreCase("Wanita")) && (age >= 25) && 
        (graduate.equalsIgnoreCase("S1") && (experience >= 3));

        isPassingAdmin = reqAdmin1 || reqAdmin2;

        System.out.println();
        System.out.println(name + ", Terima kasih sudah mengikuti Lowongan Kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah hasil dari Rekrutment untuk Koordinator dan Admin : ");
        System.out.println("Hasil Kelulusan untuk Koordinator : " + isPassingKoor);
        System.out.println("Hasil Kelulusan untuk Admin : " + isPassingAdmin);
        System.out.println();

    }
}