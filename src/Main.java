import java.util.Scanner;
public class MainFilm {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        DDLFilm dll = new DDLFilm();
        int pilih;
        do {
            System.out.println("\nDATA FILM LAYAR LEBAR");
            System.out.println("==================================");
            System.out.println("1. Tambah Data Awal");
            System.out.println("2. Tambah Data Akhir");
            System.out.println("3. Tambah Data Index Tertentu");
            System.out.println("4. Hapus Data Pertama");
            System.out.println("5. Hapus Data Terakhir");
            System.out.println("6. Hapus Data Tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari ID Film");
            System.out.println("9. Urut Data Rating Film-DESC");
            System.out.println("10. Keluar");
            System.out.println("==================================");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            switch (pilih) {
                case 1 : 
                    Film14 f = inputFilm(sc);
                    dll.addFirst(f);
                    break;
                case 2 : 
                    f = inputFilm(sc);
                    dll.addLast(f);
                    break;
                case 3 : 
                    System.out.print("Masukkan posisi index: ");
                    int idx = sc.nextInt();
                    f = inputFilm(sc);
                    dll.add(f, idx);
                    break;
                case 4 : dll.removeFirst(); break;
                case 5 : dll.removeLast(); break;
                case 6 : 
                    System.out.print("Masukkan index yang akan dihapus: ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    break;
                case 7 : dll.print(); break;
                case 8 : 
                    System.out.print("Masukkan ID Film: ");
                    int id = sc.nextInt();
                    Film14 result = dll.cariId(id);
                    if (result != null) {
                        System.out.println("Film ditemukan:\n Judul Film: " + result.judul + "\tRating: " +result.rating + "\t" + "ID "+result.id);
                    } else {
                        System.out.println("Film dengan ID tersebut tidak ditemukan.");}break;
                case 9 : 
                    dll.urutrating();
                    System.out.println("Film berhasil diurutkan berdasarkan rating (descending).");
                    break;
                case 10 : System.out.println("Terima kasih!"); break;
                default : System.out.println("Pilihan tidak valid.");}
        } while (pilih != 10);}
    private static Film14 inputFilm(Scanner sc) {
        System.out.print("ID Film: ");
        int id = sc.nextInt(); sc.nextLine();
        System.out.print("Judul Film: ");
        String judul = sc.nextLine();
        System.out.print("Rating Film: ");
        double rating = sc.nextDouble();
        return new Film14(id, judul, rating);}}
