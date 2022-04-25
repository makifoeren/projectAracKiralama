import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaBilgileriClass {

    static List<AracKiralama> aracTalebiList = new ArrayList<>();
    static Scanner scan = new Scanner(System.in);
    static int toplamGun;

    public static void aracTalep() {

        System.out.print("Lutfen teslim alacaginiz gunu giriniz: (Ornek : 19.12) ");
        String alisGunu = scan.next();

        System.out.print("Lutfen teslim alacaginiz saati giriniz: (Ornek : 19.00) ");
        double alisSaati = scan.nextDouble();

        System.out.print("Lutfen teslim edeceginiz gunu giriniz: (Ornek : 22.12) ");
        String teslimGunu = scan.next();

        System.out.print("Lutfen teslim edeceginiz saati giriniz: (Ornek : 19.00) ");
        double teslimSaati = scan.nextDouble();

        String aGun = alisGunu.substring(0, 2); //12.04
        int intAGunu = Integer.parseInt(aGun);

        String aAy = teslimGunu.substring(3); //12.04
        int intAAy = Integer.parseInt(aAy);

        System.out.println("Alis tarihi: " + intAGunu + "." + intAAy);


        String vGun = teslimGunu.substring(0, 2); //12.04
        int intVGunu = Integer.parseInt(vGun);

        String vAy = teslimGunu.substring(3); //12.04
        int intVAy = Integer.parseInt(vAy);

        System.out.println("Teslim tarihi: " + intVGunu + "." + intVAy);

        if (intAAy > intVAy) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        } else if (intAGunu > intVGunu) {
            System.out.println("Tarih i yanlis girdiniz...");
            aracTalep();
        }

        toplamGun = ((intVAy - intAAy) * 30 + (intVGunu - intAGunu));
        System.out.println("Araci kiraladiginiz toplam gun sayisi :" + toplamGun);

    }

    public static void getAraba(String marka, String model, String yakitTipi, String vites, Integer gunlukUcret) {

    }

    public static void arabalar() throws InterruptedException {

        AracKiralama opelBenzinliManuel = new AracKiralama("Opel", "Vectra", "Benzin", "Manuel", 100);
        AracKiralama opelDizelManuel = new AracKiralama("Opel", "Vectra", "Dizel", "Manuel", 150);
        AracKiralama opelBenzinliOtomatik = new AracKiralama("Opel", "Astra", "Benzin", "Otomatik", 180);
        AracKiralama opelDizelOtomatik = new AracKiralama("Opel", "Astra", "Dizel", "Otomatik", 200);
        AracKiralama fordDizelOtomatik = new AracKiralama("Ford", "Fiesta", "Dizel", "Otomatik", 185);
        AracKiralama fordBenzinManuel = new AracKiralama("Ford", "Focus", "Benzin", "Manuel", 200);
        AracKiralama hondaDizelOtomatik = new AracKiralama("Honda", "Jazz", "Dizel", "Otomatik", 190);
        AracKiralama hondaBenzinManuel = new AracKiralama("Honda", "Jazz", "Benzin", "Manuel", 180);


        aracTalebiList.add(opelBenzinliManuel);
        aracTalebiList.add(opelDizelManuel);
        aracTalebiList.add(opelBenzinliOtomatik);
        aracTalebiList.add(opelDizelOtomatik);
        aracTalebiList.add(fordDizelOtomatik);
        aracTalebiList.add(fordBenzinManuel);
        aracTalebiList.add(hondaDizelOtomatik);
        aracTalebiList.add(hondaBenzinManuel);

        System.out.println("\n Lutfen talep ettiginiz aracin numarasini giriniz : \n1 : Opel Benzin Manuel " +
                "\n2 : Opel Dizel Manuel \n3 : Opel Benzinli Otomatik \n4 : Opel Dizel otomatik" +
                "\n5 : Ford Dizel Otomatik" + "\n6 : Ford Benzin Manuel\n7 : Honda Dizel Otomatik" +
                "\n8 : Honda Benzinli Manuel \n9 : Cikis ");


        int secim = 0;

        while (true) {

            try {
                secim = scan.nextInt();
                if (secim <= 0 || secim > 9) {
                    throw new ArithmeticException();
                } else break;
            } catch (ArithmeticException e) {
                System.out.println("Tercihleriniz 1 ile 9 arasi olmali...");
            } catch (Exception e) {
                String str = scan.nextLine();
                System.out.println("Lutfen numerik veri giriniz....");
            }
        }
        switch (secim) {
            case 1:

                getAraba("Opel", "Vectra", "Benzin", "Manuel", 100);

                ArabaBilgileriClass.aracTalep();

                int odeme1 = toplamGun * 100;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme1);

                Methods.islemeDevamDongusu();

                break;

            case 2:

                getAraba("Opel", "Vectra", "Dizel", "Manuel", 150);

                ArabaBilgileriClass.aracTalep();

                int odeme2 = toplamGun * 150;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme2);

                Methods.islemeDevamDongusu();

                break;

            case 3:

                getAraba("Opel", "Astra", "Benzin", "Otomatik", 180);

                ArabaBilgileriClass.aracTalep();

                int odeme3 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme3);

                Methods.islemeDevamDongusu();

                break;

            case 4:

                getAraba("Opel", "Astra", "Dizel", "Otomatik", 200);

                ArabaBilgileriClass.aracTalep();

                int odeme4 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme4);

                Methods.islemeDevamDongusu();

                break;

            case 5:

                getAraba("Ford", "Fiesta", "Dizel", "Otomatik", 185);

                ArabaBilgileriClass.aracTalep();

                int odeme5 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme5);

                Methods.islemeDevamDongusu();

                break;

            case 6:

                getAraba("Ford", "Focus", "Benzin", "Manuel", 200);

                ArabaBilgileriClass.aracTalep();

                int odeme6 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme6);

                Methods.islemeDevamDongusu();

                break;

            case 7:

                getAraba("Honda", "Jazz", "Dizel", "Otomatik", 190);

                ArabaBilgileriClass.aracTalep();

                int odeme7 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme7);

                Methods.islemeDevamDongusu();

                break;

            case 8:

                getAraba("Honda", "Jazz", "Benzin", "Manuel", 180);

                ArabaBilgileriClass.aracTalep();

                int odeme8 = toplamGun * 180;
                System.out.println("Odeyeceginiz toplam ucret : " + odeme8);

                Methods.islemeDevamDongusu();

                break;


            case 9:
                Methods.cikis1();

                break;

            default:

                System.out.println("Hatali veri giridiniz...");

                Methods.islemeDevamDongusu();

        }

    }

}
