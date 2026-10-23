public class Orang {
    // Atribut protected agar dapat diakses oleh subclass
    protected String id;
    protected String nama;
    protected String tanggalLahir;

    // Constructor Superclass
    public Orang(String id, String nama, String tanggalLahir) {
        this.id = id;
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
    }

    // Method umum yang akan di-override di subclass
    public void tampilkanInfo() {
        System.out.println("ID            : " + id);
        System.out.println("Nama          : " + nama);
        System.out.println("Tanggal Lahir : " + tanggalLahir);
    }
}