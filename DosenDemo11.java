import java.util.Scanner;
public class DosenDemo11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = sc.nextInt();
        sc.nextLine();
        
        Dosen11[] daftarDosen = new Dosen11[jumlah];

        for(int i = 0; i < jumlah; i++) {
            System.out.println("Masukkan Data Dosen ke-" + (i + 1));
            System.out.print("Kode            : ");
            String kode = sc.nextLine();
            System.out.print("Nama            : ");
            String nama = sc.nextLine();
            System.out.print("Jenis Kelamin (L/P): ");
            String jk = sc.nextLine();
            Boolean jenisKelamin = jk.equalsIgnoreCase("L");
            System.out.print("Usia            : ");
            int usia = sc.nextInt();
            sc.nextLine();
            System.out.println("--------------------------------");
            
            daftarDosen[i] = new Dosen11(kode, nama, jenisKelamin, usia);
        }
        DataDosen11.dataSemuaDosen(daftarDosen);
        DataDosen11.jumlahDosenPerJenisKelamin(daftarDosen);
        DataDosen11.rerataUsiaDosenPerJenisKelamin(daftarDosen);
        DataDosen11.infoDosenPalingTua(daftarDosen);
        DataDosen11.infoDosenPalingMuda(daftarDosen);
    }
}
