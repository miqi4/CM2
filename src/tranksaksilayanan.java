public class tranksaksilayanan {
    String namaPasien;
    String idDokter;
    String namaDokter;
    int durasilayanan;
    int biaya,hasil;
    tranksaksilayanan(String namaPasien, String idDokter, String namaDokter, int durasilayanan) {
        this.namaPasien = namaPasien;
        this.idDokter = idDokter;
        this.namaDokter = namaDokter;
        this.durasilayanan = durasilayanan;
        this.biaya = hitunglayanan();
    }
    int hitunglayanan(){
        biaya = 50000;
        hasil = durasilayanan * biaya;
        return hasil;
    }
    public void tampilkanTx() {
        System.out.println("Nama Pasien: " + namaPasien);
        System.out.println("Durasi Layanan: " + durasilayanan + " jam");
        System.out.println("Biaya Layanan: Rp " + biaya);
        System.out.println("----------------------------");
    }
}
