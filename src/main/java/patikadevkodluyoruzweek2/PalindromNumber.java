package patikadevkodluyoruzweek2;


import java.util.Scanner;

public class PalindromNumber {


     static int isPalindromNumber(int number){
         int temp=number,reverseNumber=0,lastNumber;//variables declaration

         while (temp!=0){
             lastNumber=temp%10;//sayının son basamağı
             reverseNumber=(reverseNumber*10)+lastNumber;
             temp/=10;
         }
         if(number==reverseNumber){
             System.out.println(" Palindrom Number:" + reverseNumber);
         }else{
             System.out.println("Not Palindrom Number:"+ reverseNumber);
         }

         return reverseNumber;
     }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Bu uygulama Palindrom Sayı bulma\n" +
                           "uygulamasıdır lütfen bir tamsayı giriniz: ");
        int number=input.nextInt();
        isPalindromNumber(number);//method call

    }

}
