import java.util.Scanner;

public class KlinikMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        fungsi antrian = new fungsi();
        Transaksi transaksi = new Transaksi(10);
        int pilihan;
        do {
            System.out.println("\n====== SISTEM ANTRIAN KLINIK ======");
            System.out.println("1. Tambah Pasien ke Antrian");
            System.out.println("2. Tampilkan Antrian Pasien");
            System.out.println("3. Layani Pasien");
            System.out.println("4. Cek Sisa Antrian");
            System.out.println("5. Tampilkan Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih: ");
            pilihan = sc.nextInt();
            sc.nextLine();
            switch (pilihan) {
                case 1:
                    System.out.print("Nama Pasien : ");
                    String nama = sc.nextLine();
                    System.out.print("NIK  : ");
                    String NIK = sc.nextLine();
                    System.out.print("Kendala  : ");
                    String Kendala = sc.nextLine();
                    pasien psn = new pasien(nama, NIK, Kendala);
                    antrian.addfirst(psn);
                    System.out.println(" Pasien Masuk Ke dalam Antrian");
                    break;
                case 2:
                    System.out.println("=== Antrian Pasien ===");
                    antrian.print();
                    break;
                case 3:
                    String namaDihapus = antrian.head.data.nama;
                    if (antrian.isEmpty()) {
                    System.out.println("Antrian kosong.");
                    } else {
                    System.out.println("Pasien " + namaDihapus+ " Dipanggil");
                    pasien pasienDilayani = antrian.removeLast();
                    System.out.print("ID Dokter: ");
                    String idDokter = sc.nextLine();
                    System.out.print("Nama Dokter: ");
                    String namaDokter = sc.nextLine();
                    System.out.print("Durasi Layanan (jam): ");
                    int durasi = sc.nextInt();
                    sc.nextLine();
                    dokter dok = new dokter(idDokter, namaDokter);
                    tranksaksilayanan t = new tranksaksilayanan(pasienDilayani.nama,dok.idDokter,dok.nama,durasi);
                    transaksi.enqueue(t);
                    System.out.println(">> Pasien telah dilayani,transaksi berhasil dicatat");
                    } 
                    break;
                case 4:
                    System.out.println("Jumlah pasien dalam antrian: " + antrian.size());
                    break;
                case 5:
                    transaksi.tampilkanTransaksi();
                    System.out.println(">> Pasien telah dilayani,transaksi berhasil dicatat");
                    break;
                case 0:
                    System.out.println("Terima kasih.");
                    break;
            }
        } while (pilihan != 0);
    }
}
