import java.util.Scanner;

public class Bilet {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);



        double fiyat = 1, sonfiyat, mesafe, yas, tip;

        System.out.print("Mesafeyi giriniz ==> ");
        mesafe = input.nextDouble();

        System.out.print("Yasinizi giriniz ==> ");
        yas = input.nextDouble();

        System.out.println("\n1- Gidis\n2- Gidis donus\n");

        System.out.print("Gidis tipinizi tuslayiniz ==> ");
        tip = input.nextDouble();

        sonfiyat = fiyat * mesafe;

        if(mesafe > 0 && yas > 0 && (tip == 1 || tip == 2)) {

            if(yas <= 12) {

                sonfiyat = sonfiyat * 0.5;
            }

            else if(yas <= 20) {

                sonfiyat = sonfiyat * 0.9;

            }

            else if(yas >= 60) {

                sonfiyat = sonfiyat * 0.7;

            }

            if(tip ==2) {
                sonfiyat = sonfiyat * 0.8;
            }

            System.out.print("\nToplam tutariniz = " + sonfiyat);
        }

        else {
            System.out.println("\nGirilen degerlerde hata var!\n");
            System.out.print("Mesafe 0 dan buyuk olmalidir.\nYas 0 dan buyuk olmalidir.\nGidis tipi 1 veya 2 olmalidir.\nTam sayi girilmelidir.");
        }

        input.close();
    }

}