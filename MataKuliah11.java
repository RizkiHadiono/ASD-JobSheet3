import java.util.Scanner;
public class MataKuliah11 {
    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;
    public String dummy;

    public MataKuliah11(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;

    }
    
    public void tambahData() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Kode       : ");
            kode = sc.nextLine();
            System.out.print("Nama       : ");
            nama = sc.nextLine();
            System.out.print("Sks        : ");
            dummy = sc.nextLine();
            sks = Integer.parseInt(dummy);
            System.out.print("Jumlah Jam : ");
            dummy = sc.nextLine();
            jumlahJam = Integer.parseInt(dummy);
            System.out.println("------------------------");
    }
    public void cetakInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Sks : " + sks);
        System.out.println("Jumlah Jam : " + jumlahJam);
    }
}
