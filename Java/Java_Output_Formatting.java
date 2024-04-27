import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
            Scanner output=new Scanner(System.in);
            System.out.println("================================");
            
            for(int i=0;i<3;i++){
                String str = output.next();
                int digit = output.nextInt();
                System.out.print(str);
                for(int j = 0; j < 15-str.length();j++){
                    System.out.print(" ");
                }
                
                if(digit < 10) System.out.println("00"+digit);
                else if(digit < 100) System.out.println("0"+digit);
                else System.out.println(digit);
            }
            System.out.println("================================");
    }
} 

