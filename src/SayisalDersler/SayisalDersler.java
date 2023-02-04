package SayisalDersler;

import Ders.Ders1;
import Ders.Dersler;

public abstract class  SayisalDersler extends Ders1 {
    private String ogretmen;
    private int dersSaati;

    public SayisalDersler(String konu, int dersSaati, Dersler dersler, String ogretmen) {
        super(konu, dersSaati, dersler);
        this.dersSaati=dersSaati;
        this.ogretmen=ogretmen;
    }


    public String getOgretmen() {
        return ogretmen;
    }

    public void setOgretmen(String ogretmen) {
        this.ogretmen = ogretmen;
    }

    @Override
    public int getDersSaati() {
        return dersSaati;
    }

    @Override
    public void setDersSaati(int dersSaati) {
        this.dersSaati = dersSaati;
    }

    @Override
    public String toString() {
        return "SayisalDersler [ogretmen=" + ogretmen + ", dersSaati=" + dersSaati + "]"+super.toString();
    }

}
