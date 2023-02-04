package SozelDersler;


import Ders.Ders1;
import Ders.Dersler;

public class SozelDersler extends Ders1 {
    private String projeOdevi ;
    private int sinif;




    public SozelDersler(String konu, int sinif, Dersler dersler,String projeOdevi) {
        super(konu, sinif, dersler);
        this.sinif=sinif;
        this.projeOdevi=projeOdevi;
    }

    public String getOgretmen() {
        return projeOdevi;
    }

    public void setProjeOdevi(String projeOdevi) {
        this.projeOdevi = projeOdevi;
    }

    @Override
    public int getSinif() {
        return sinif;
    }

    @Override
    public void setSinif(int sinif) {
        this.sinif = sinif;
    }

    @Override
    public int getKonuSayisi() {
        return 0;
    }

    @Override
    public void setKonuSayisi(int konuSayisi) {

    }

    @Override
    public String toString() {
        return "SozelDersler[Proje Odevi=" + projeOdevi+ + '\'' +
                ", Sinif" +
                "=" + sinif+"]"+super.toString();
    }
}
