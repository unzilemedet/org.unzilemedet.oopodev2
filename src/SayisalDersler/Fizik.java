package SayisalDersler;

import Ders.Dersler;

public class Fizik extends SayisalDersler {
    private int konuSayisi;

    public Fizik(String konu, int konuSayisi, int dersSaati, Dersler dersler, String ogretmen) {
        super(konu, dersSaati, dersler, ogretmen);
        this.konuSayisi=konuSayisi;
    }

    @Override
    public int getSinif() {
        return 0;
    }

    @Override
    public void setSinif(int sinif) {

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
        return "Fizik[konuSayisi=" + konuSayisi + "]"+super.toString();
    }
}
