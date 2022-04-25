import java.util.Scanner;

public class MusteruBilgileriClass {

    static Scanner scan=new Scanner(System.in);

    public static void musteriBilgisi() throws InterruptedException {

        System.out.print("Lutfen adinizi ve soyadinizi giriniz : ");
        String kimlik = scan.nextLine();

        System.out.print("Lutfen ID nizi giriniz : ");
        String ID = scan.nextLine();

        System.out.print("Lutfen telefon numarasi : ");
        String tlf = scan.nextLine();


        odemeBilgileri();
    }

    public static void odemeBilgileri() throws InterruptedException {
        System.out.print("Lutfen kart numaranizi giriniz : ");
        String kNo = scan.nextLine();

        int kartNoSayisi = 12;

        if (kartNoSayisi != kNo.length()) {
            System.out.println("Yanlis giris yaptiniz lutfen tekrar deneyiniz...");
            odemeBilgileri();

        } else if (kartNoSayisi == kNo.length()) {
            Thread.sleep(300);
            System.out.print("Odemeniz basari ile gerceklestirildi iyi gunler : ");

            Methods.cikis1();

        } else {

        }

    }

}
