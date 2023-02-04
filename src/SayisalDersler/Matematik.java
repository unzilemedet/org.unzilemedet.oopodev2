package SayisalDersler;

import Ders.Dersler;

public class Matematik extends SayisalDersler  {
    private int sinavSayisi;

    public Matematik(String konu, int dersSaati, int sinavSayisi, Dersler dersler, String ogretmen) {
        super(konu, dersSaati, dersler, ogretmen);
        this.sinavSayisi=sinavSayisi;
    }


    public int getSinavSayisi() {
        return sinavSayisi;
    }

    public void setSinavSayisi(int sinavSayisi) {
        this.sinavSayisi = sinavSayisi;
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
        return "Matematik[sinavSayisi=" + sinavSayisi + "]"+super.toString();
    }


}
