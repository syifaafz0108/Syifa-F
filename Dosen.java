public class Dosen extends Orang {
    // Atribut khusus Dosen
    private String nidn;
    private String matakuliah;

    // Constructor Subclass memanggil super(...) di baris pertama
    public Dosen(String id, String nama, String tanggalLahir, String nidn, String matakuliah) {
        super(id, nama, tanggalLahir);
        this.nidn = nidn;
        this.matakuliah = matakuliah;
    }

    // Meng-override method tampilkanInfo()
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); // Memanggil tampilkanInfo() milik parent (Orang)
        System.out.println("NIDN          : " + nidn);
        System.out.println("Mata Kuliah   : " + matakuliah);
    }
}