package SozelDersler;

import Ders.Dersler;

public class Tarih extends SozelDersler {

    private int projeGecmeNotu;


    public Tarih(String konu, int sinif, Dersler dersler, String projeOdevi,int projeGecmeNotu) {
        super(konu, sinif, dersler, projeOdevi);
        this.projeGecmeNotu=projeGecmeNotu;
    }

    public int getProjeGecmeNotu() {
        return projeGecmeNotu;
    }

    public void setProjeGecmeNotu(int projeGecmeNotu) {
        this.projeGecmeNotu = projeGecmeNotu;
    }
    @Override
    public String toString() {
        return "Tarih[projeGecmeNotu=" + projeGecmeNotu + "]"+super.toString();
    }

}
