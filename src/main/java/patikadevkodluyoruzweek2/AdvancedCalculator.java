package patikadevkodluyoruzweek2;

import java.util.Scanner;

public class AdvancedCalculator {


    static  int sum(int a, int b){//toplama işlemi için düzennelen method
        int result=a+b;
        System.out.println("Toplam: " + result);
        return result;
    }
    static int minus(int a, int b){//Çıkarma işlemi işlemi için düzennelen method
        int result=a-b;
        System.out.println("Çıkarma: " + result);
        return result;
    }
    static int times(int a, int b){
        int result =a*b;
        System.out.println("Çarpma: " + result);
        return result;
    }
    static  int divided(int a, int b){
        if(b==0){
            System.out.println("İkinci sayı 0'dan farklı olmalıdır.");
            return 0;
        }
        int result=a/b;
        System.out.println("Bölme: " + result);
        return result;
    }
    static  int power(int a, int b){
        int result = 1;
        for (int i = 1; i <=b; i++) {
          result *= a;
        }
        System.out.println("Üs Alma : " + result);
        return result;
    }
    static int mod(int a, int b){
      int result=a % b;
        System.out.println("Mod Alma: " + result);
      return result;
    }
    static void rectangleCalc(int a, int b){
        int cevre=2*(a+b);
        int alan=a*b;
        System.out.println("Çevresi: " +  cevre);
        System.out.println("Alanı: " + alan);
    }
    static int faktoriel(int a,int b) {

        for (int i = 1; i <= b; i++) {
            a *= i;
        }
        System.out.println("Sonuç : " + a);
        return a;
    }

    public static void main(String[] args) {

    Scanner scan=new Scanner(System.in);
    int select;

        String menu = "1- Toplama İşlemi\n"
                +"--------------------------\n"
                + "2- Çıkarma İşlemi\n"
                +"--------------------------\n"
                + "3- Çarpma İşlemi\n"
                +"--------------------------\n"
                + "4- Bölme işlemi\n"
                +"--------------------------\n"
                + "5- Üslü Sayı Hesaplama\n"
                +"--------------------------\n"
                + "6- Faktoriyel Hesaplama\n"
                +"--------------------------\n"
                + "7- Mod Alma\n"
                +"--------------------------\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı\n"
                +"--------------------------\n"
                + "0- Çıkış Yap";

        while (true) {
            System.out.println(menu);
            System.out.print("Bir işlem seçiniz: ");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            System.out.print("İlk Sayı: ");
            int a = scan.nextInt();
            System.out.print("İkinci Sayı: ");
            int b = scan.nextInt();

            switch (select) {
                case 1:
                    sum(a, b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                     power(a,b);
                    break;
                case 6:
                    faktoriel(a,b);
                    break;
                case 7:
                     mod(a,b);
                     break;
                case 8:
                    rectangleCalc(a,b);
                    break;
                default:
                    System.out.println("Geçersiz bir işlem girdiniz. ");

            }
        }
        System.out.println("Güle güle");
    }
}





