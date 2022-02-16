import java.util.ArrayList;
import java.util.List;

public class Calistir {


    public static void main(String[] args) {


       //Generics  <>


        //Polymorphism---> Subclass'ın objesini , süper class'ın  değişkenine atamak
        //ArrayList<Ogrenci> ogrenciListe = new ArrayList();


        List<Ogrenci> ogrenciListe = new ArrayList();

        Ogrenci ogr1 = new Ogrenci(1,"ibrahim","tatlıses");
        Ogrenci ogr2 = new Ogrenci(2,"ferdi","tayfur");
        Ogrenci ogr3 = new Ogrenci(3,"müslüm","gürses");
        Ogrenci ogr4 = new Ogrenci(4,"orhan","gencebay");

        ogrenciListe.add(ogr1);
        ogrenciListe.add(ogr2);
        ogrenciListe.add(ogr3);
        ogrenciListe.add(ogr4);

        System.out.println(ogrenciListe.size());




        Ogrenci deneme = ogrenciListe.get(3);

        System.out.println(deneme.getAd());

        for (int i = 0; i <ogrenciListe.size() ; i++) {

            Ogrenci yeniOgr = ogrenciListe.get(i);
            System.out.println(yeniOgr.getNo()+" "+yeniOgr.getAd()+" "+yeniOgr.getSoyad());

        }






    }
}
