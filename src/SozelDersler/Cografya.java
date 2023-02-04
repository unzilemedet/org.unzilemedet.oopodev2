package SozelDersler;


import Ders.Dersler;

public class Cografya extends SozelDersler{
    private String kullanilanMetaryaller;

    public Cografya(String konu, String kullanilanMetaryaller, int sinif, Dersler dersler, String projeOdevi) {
        super(konu, sinif, dersler, projeOdevi);
        this.kullanilanMetaryaller=kullanilanMetaryaller;
    }

    public String getKullanilanMetaryaller() {
        return kullanilanMetaryaller;
    }

    public void setKullanilanMetaryaller(String kullanilanMetaryaller) {
        this.kullanilanMetaryaller = kullanilanMetaryaller;
    }


    @Override
    public String toString() {
        return "Cografya[kullanilanMetaryaller=" + kullanilanMetaryaller + "]"+super.toString();
    }

}
