public class Mahasiswa extends Orang {
    // Atribut khusus Mahasiswa
    private String nim;
    private String prodi;
    private double ipk;

    // Constructor Subclass memanggil super(...) di baris pertama
    public Mahasiswa(String id, String nama, String tanggalLahir, String nim, String prodi, double ipk) {
        super(id, nama, tanggalLahir);
        this.nim = nim;
        this.prodi = prodi;
        this.ipk = ipk;
    }

    // Meng-override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() milik parent (Orang)
        System.out.println("NIM           : " + nim);
        System.out.println("Prodi         : " + prodi);
        System.out.println("IPK           : " + ipk);
    }
}