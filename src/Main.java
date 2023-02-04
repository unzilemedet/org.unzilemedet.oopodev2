import Ders.DersTipi;
import Ders.Dersler;
import SayisalDersler.Fizik;
import SayisalDersler.Matematik;
import SozelDersler.Cografya;
import SozelDersler.Tarih;

public class Main {

    public static void main(String[] args) {
        Dersler dersler1 = new Dersler("Matematik",101, DersTipi.sayisal);
        Matematik matematik1 = new Matematik("Integral", 16,3,dersler1,"Unzile");
        System.out.println(matematik1);

        Dersler dersler2 =new Dersler("Fizik",103,DersTipi.sayisal);
        Fizik fizik= new Fizik("İş, Güç ve Enerji",10,100,dersler2,"Fulya Kuş" );
        System.out.println(fizik);



        Dersler dersler3= new Dersler("Tarih",105,DersTipi.sözel);
        Tarih tarih = new Tarih("Değişim Çağında Avrupa ve Osmanlı",11,dersler3,"Uluslararası İlişkilerde Denge Stratejisi",50);
        System.out.println(tarih);


        Dersler dersler4 = new Dersler("Cografya",108,DersTipi.sözel);
        Cografya cografya= new Cografya("Harita Bilgisi","Harita",12,dersler4,"Dünyanın Şekli ve Hareketleri.");
        System.out.println(cografya);


    }}