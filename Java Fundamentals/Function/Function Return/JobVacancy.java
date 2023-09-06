import java.util.Scanner;

public class JobVacancy {
    public static void main(String[] args) {
        //Deklarasi variable yang diperlukan
        int umur, pengalaman;
        double penampilan;
        String lulusan, nama, jenisKelamin, posisi, hasil;
        boolean reqKoor1, reqKoor2, reqAdmin1, reqAdmin2, reqAdmin3, reqSpv1, reqSpv2;
        boolean isPassing;

        Scanner input = new Scanner(System.in);

        System.out.println("Selamat datang di PT. Secret Semut 79");
        System.out.println("======================================\n");

        System.out.println("Silahkan Input Data Anda : \n");

        System.out.println("Nama : ");
        nama = input.next();

        System.out.println("Umur : ");
        umur = input.nextInt();

        System.out.println("Jenis Kelamin (Pria/Wanita) : ");
        jenisKelamin = input.next();

        System.out.println("Lulusan (SMK/D3/S1) : ");
        lulusan = input.next();

        System.out.println("Pengalaman (Tahun) : ");
        pengalaman = input.nextInt();

        System.out.println("Penampilan (1 s.d 10) : ");
        penampilan = input.nextDouble();

        System.out.println("Posisi yang Dilamar (SPV, Admin, atau Koodinator) : ");
        posisi = input.next();

        if (posisi.equalsIgnoreCase("Koordinator")) {
            isPassing = validateKoordinator(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else if (posisi.equalsIgnoreCase("Admin")) {
            isPassing = validateAdmin(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else if (posisi.equalsIgnoreCase("SPV")) {
            isPassing = validateSPV(umur, jenisKelamin, lulusan, pengalaman, penampilan);
        } else {
            isPassing = false;
        }

        if (isPassing) {
            hasil = "Selamat, " + nama + ".\nAnda memenuhi syarat sebagai " + posisi + ". Dan akan masuk ke Tahap Selanjutnya.";
        } else {
            hasil = "Maaf, " + nama + ".\nAnda Tidak memenuhi syarat sebagai " + posisi + ". Dan Tidak akan masuk ke Tahap Selanjutnya.";
        }

        printResult(nama, hasil, posisi);
    }

    public static boolean validateKoordinator(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        boolean reqKoor1, reqKoor2, result;

        reqKoor1 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 21 && umur <= 30 && (lulusan.equalsIgnoreCase("SMK") || lulusan.equalsIgnoreCase("D3")) && pengalaman >= 2;
        reqKoor2 = jenisKelamin.equalsIgnoreCase("Pria") && umur > 30 && lulusan.equalsIgnoreCase("S1") && pengalaman >= 5;

        if (reqKoor1 || reqKoor2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static boolean validateAdmin(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan) {
        boolean reqAdmin1, reqAdmin2, reqAdmin3, result;

        reqAdmin1 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 20 && umur <= 25 && lulusan.equalsIgnoreCase("D3") && (penampilan >= 8.5 || pengalaman >= 1);
        reqAdmin2 = jenisKelamin.equalsIgnoreCase("Wanita") && umur >= 25 && lulusan.equalsIgnoreCase("S1") && penampilan >= 8.5 && pengalaman >= 3;
        reqAdmin3 = jenisKelamin.equalsIgnoreCase("Pria") && umur >= 20 && umur <= 30 && penampilan >= 8.5 && (lulusan.equalsIgnoreCase("D3") || lulusan.equalsIgnoreCase("S1")) && pengalaman >= 2;

        if (reqAdmin1 || reqAdmin2 || reqAdmin3) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static boolean validateSPV(int umur, String jenisKelamin, String lulusan, int pengalaman, double penampilan){
        boolean reqSpv1, reqSpv2, result;
        reqSpv1 = umur >= 23 && umur <= 30 && lulusan.equalsIgnoreCase("S1") && pengalaman > 1;
        reqSpv2 = umur >= 25 && umur <= 35 && lulusan.equalsIgnoreCase("D3") && pengalaman > 4;

        if (reqSpv1 || reqSpv2) {
            result = true;
        } else {
            result = false;
        }

        return result;
    }

    public static void printResult(String nama, String hasil, String posisi){
        System.out.println();
        System.out.println(nama + ", Terima Kasih Sudah mengikuti Lowongan Kerja di PT. Secret Semut 79.\n");
        System.out.println("Berikut adalah Hasil dari Rekrutmen untuk Posisi " + posisi + " :");
        System.out.println(hasil);
    }
}