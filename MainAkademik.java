public class MainAkademik {
    public static void main(String[] args) {
        // Membuat 1 objek Dosen
        Dosen dosen1 = new Dosen("D001", "Dr. Ahmad, M.Kom.", "15 Agustus 1980", "0415088001", "Pemrograman Berbasis Objek");

        // Membuat 1 objek Mahasiswa
        Mahasiswa mhs1 = new Mahasiswa("M001", "Syifa Fauziah", "01 Agustus 2006", "221110001", "Sistem Informasi", 3.85);

        // Menampilkan informasi Dosen
        System.out.println("=== DATA DOSEN ===");
        dosen1.tampilkanInfo();
        System.out.println();

        // Menampilkan informasi Mahasiswa
        System.out.println("=== DATA MAHASISWA ===");
        mhs1.tampilkanInfo();
    }
}