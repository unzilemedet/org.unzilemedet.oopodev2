package Ders;

public abstract class Ders1 {

    private String konu;
    private  int dersSaati;
    private Dersler dersler;

    public Ders1(String konu, int dersSaati, Dersler dersler) {
        this.konu = konu;
        this.dersSaati = dersSaati;
        this.dersler = dersler;
    }

    public String getKonu() {
        return konu;
    }

    public void setKonu(String konu) {
        this.konu = konu;
    }

    public int getDersSaati() {
        return dersSaati;
    }

    public void setDersSaati(int dersSaati) {
        this.dersSaati = dersSaati;
    }

    public Dersler getDersler() {
        return dersler;
    }

    public void setDersler(Dersler dersler) {
        this.dersler = dersler;
    }

    public abstract int getSinif();

    public abstract void setSinif(int sinif);

    public abstract int getKonuSayisi();

    public abstract void setKonuSayisi(int konuSayisi);

    @Override
    public String toString() {
        return "Ders1[konu=" + konu + ", dersSaati=" + dersSaati + ", dersler=" + dersler + "]";
    }



}
