package Ders;

public class Dersler {
    private String dersAdi;
    private int dersKodu ;

    private DersTipi dersTipi;


    public Dersler(String dersAdi, int dersKodu, DersTipi dersTipi) {
        this.dersAdi =  dersAdi;
        this.dersKodu = dersKodu;
        this.dersTipi = dersTipi;
    }




    public String getDersAdi() {
        return dersAdi;
    }

    public void setDersAdi(String dersAdi) {
        this.dersAdi = dersAdi;
    }

    public int getDersKodu() {
        return dersKodu;
    }

    public void setDersKodu(int dersKodu) {
        this.dersKodu = dersKodu;
    }

    public DersTipi getDersTipi() {
        return dersTipi;
    }

    public void setDersTipi(DersTipi dersTipi) {
        this.dersTipi = dersTipi;
    }

    @Override
    public String toString() {
        return "Dersler{" +
                "dersAdi='" + dersAdi + '\'' +
                ", dersKodu=" + dersKodu +
                ", dersTipi=" + dersTipi +
                '}';
    }
}
