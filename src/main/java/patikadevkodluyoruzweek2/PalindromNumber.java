package patikadevkodluyoruzweek2;

import com.sun.source.tree.WhileLoopTree;

public class PalindromNumber {


     static boolean isPalindromNumber(int number){
         int temp=number,reverseNumber=0,lastNumber;


         while (temp!=0){
             lastNumber=temp%10;//sayının son basamağını

             reverseNumber=(reverseNumber*10)+lastNumber;//
             System.out.println(reverseNumber);
             temp/=10;        }
         System.out.println(temp);
         return true;
     }

    public static void main(String[] args) {
        isPalindromNumber(145);

    }

}
