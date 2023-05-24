package patikadevkodluyoruzweek2;

import java.util.Scanner;

public class RecurciveMethod {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int num, pow;
        System.out.println("Bir Taban sayısı giriniz.");
        num = scan.nextInt();
        System.out.println("Üs olacak sayıyı giriniz :");
        pow = scan.nextInt();

        System.out.println(usAl(num, pow) + " " + "\n");
    }

    public static int usAl(int num, int pow) { //Recursive fonksiyon- Metot

        if (num == 1 || pow == 0) { //Metot-Fonksiyon çağrılmasını durduracak şart.
            return 1;
        }
        return num * usAl(num, pow - 1);//fonksiyon-Metot her kendini çağırdığında taban olarak belirlenen sayı
                                            // ile  tabanı çarpacak ve bir azalacak
    }
}
