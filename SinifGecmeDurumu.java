package KosulluIfadelerveKodBlokları;

import java.util.Scanner;

public class SinifGecmeDurumu {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matematik, fizik, turkce, kimya, muzik;

        System.out.print("Matematik notunuzu giriniz: ");
        matematik = input.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = input.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = input.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = input.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = input.nextInt();

        double total = 0.0;
        int i = 0;

        if (matematik >= 0 && matematik <= 100) {
            total += matematik;
            i++;
        }
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            i++;
        }
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            i++;
        }
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            i++;
        }
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            i++;
        }
        System.out.println("Ortalamanız: " + (total / i));

        if (total / i < 55) {
            System.out.println("Sınıfta kaldınız.");
        } else {
            System.out.println("Sınıfı geçtiniz.");
        }

/*
        double ort = (matematik + fizik + turkce + kimya + muzik) / 5.0;

        System.out.println("Not Ortalamanız: " + ort);

        if(ort<55){
            System.out.println("Sınıfta kaldınız.");
        }else{
            System.out.println("Sınıfı geçtiniz.");

 */

    }
}

