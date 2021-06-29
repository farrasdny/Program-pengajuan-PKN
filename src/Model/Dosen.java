package Model;

public class Dosen {
    private int jumlahMahasiswa;
    private String waktu;
    private String ruangan;

    public Dosen(int jumlahMahasiswa, String waktu, String ruangan) {
        this.jumlahMahasiswa = jumlahMahasiswa;
        this.waktu = waktu;
        this.ruangan = ruangan;
    }

    public int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public void setJumlahMahasiswa(int jumlahMahasiswa) {
        this.jumlahMahasiswa = jumlahMahasiswa;
    }

    public String getWaktu() {
        return waktu;
    }

    public void setWaktu(String waktu) {
        this.waktu = waktu;
    }

    public String getRuangan() {
        return ruangan;
    }

    public void setRuangan(String ruangan) {
        this.ruangan = ruangan;
    }


}