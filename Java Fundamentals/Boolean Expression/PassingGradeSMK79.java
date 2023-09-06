import java.util.Scanner;

/**
 * PassingGradeSMK79
 */
public class PassingGradeSMK79 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nilaiMTK, nilaiBhsIndo, nilaiBhsIng, nilaiIPA, nilai, avg;

        System.out.println("Masukkan nilai Ujian Matematika : ");
        nilaiMTK = input.nextInt();

        System.out.println("Masukkan nilai Ujian Bhs. Indonesia : ");
        nilaiBhsIndo = input.nextInt();

        System.out.println("Masukkan nilai Bhs.Inggris : ");
        nilaiBhsIng = input.nextInt();

        System.out.println("Masukan nilai Ujian IPA : ");
        nilaiIPA = input.nextInt();

        nilai = nilaiMTK + nilaiBhsIndo + nilaiBhsIng + nilaiIPA;
        avg = nilai / 4;

        System.out.println("Hasil dari Simulasi untuk Persyaratan Calon Siswa di SMK Padepokan 79 adalah sebagai berikut : ");
        System.out.println("========================================================");
        System.out.printf("Apakah anda memenuhi Syarat untuk Masuk ke SMK Padepokan 79 : %s \n", avg >= 73 );
        System.out.printf("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Sastra : %s \n", ((nilaiBhsIndo + nilaiBhsIng)/2) >= 75 );
        System.out.printf("Apakah anda memenuhi Syarat untuk Masuk ke Jurusan Teknik Komputer Jaringan : %s \n", nilaiMTK > 80 );
        System.out.println();
    }
}