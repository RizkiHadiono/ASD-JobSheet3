public class DataDosen11 {

    public static void dataSemuaDosen(Dosen11[] arrayOfDosen) {
        System.out.println("\nData Semua Dosen:");
        for (Dosen11 d : arrayOfDosen) {
            d.tampilkanInfo();
        }
    }
    public static void jumlahDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int pria = 0, wanita = 0;
        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) pria++;
            else wanita++;
        }
        System.out.println("\nJumlah Dosen Pria   : " + pria);
        System.out.println("Jumlah Dosen Wanita : " + wanita);
    }
    public static void rerataUsiaDosenPerJenisKelamin(Dosen11[] arrayOfDosen) {
        int totalPria = 0, totalWanita = 0, jmlPria = 0, jmlWanita = 0;
        for (Dosen11 d : arrayOfDosen) {
            if (d.jenisKelamin) {
                totalPria += d.usia;
                jmlPria++;
            } else {
                totalWanita += d.usia;
                jmlWanita++;
            }
        }
        System.out.println("\nRata-rata Usia Dosen Pria   : " + (jmlPria > 0 ? (totalPria / jmlPria) : 0));
        System.out.println("Rata-rata Usia Dosen Wanita : " + (jmlWanita > 0 ? (totalWanita / jmlWanita) : 0));
    }
    public static void infoDosenPalingTua(Dosen11[] arrayOfDosen) {
        Dosen11 tertua = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia > tertua.usia) {
                tertua = d;
            }
        }
        System.out.println("\nDosen Paling Tua:");
        tertua.tampilkanInfo();
    }
    public static void infoDosenPalingMuda(Dosen11[] arrayOfDosen) {
        Dosen11 termuda = arrayOfDosen[0];
        for (Dosen11 d : arrayOfDosen) {
            if (d.usia < termuda.usia) {
                termuda = d;
            }
        }
        System.out.println("\nDosen Paling Muda:");
        termuda.tampilkanInfo();
    }
}