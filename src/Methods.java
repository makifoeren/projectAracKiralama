import java.util.Scanner;

public class Methods {

    static Scanner scan=new Scanner(System.in);

    public static void islemeDevamDongusu() {

        System.out.println("Isleme devam etmek istiyorsaniz E bitirmek istiyorsaniz H yaziniz...");
        char ch = scan.next().toUpperCase().charAt(0);

        if (ch == 'E') {
           MusteruBilgileriClass.musteriBilgisi();

        } else if (ch == 'H') {
            ArabaBilgileriClass.arabalar();

        } else {

        }
    }

    public static void cikis1() {

        System.out.println("Tesekkur ederiz.. Yine bekleriz... Hayirli yolculuklar");

    }
}
