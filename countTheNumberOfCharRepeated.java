
import java.util.Scanner;
public class countTheNumberOfCharRepeated
{
    public static void main(String []args)
    {   
        Scanner sc = new Scanner(System.in);
        int j, count=0;
        String list = "abcdefghijklmnopqrstuvwxyz";

        System.out.println("Enter the Input : ");
        String input  = sc.nextLine();
        for(int i=0; i<26;i++){
            char ch1 = list.charAt(i);
            for(j = 0; j<input.length(); j++ ){
                char ch2 = input.charAt(j);
                if(ch1==ch2){
                    count +=1;
                }


            }
            if(count>1){
                System.out.println(ch1 +" : "+ count);
            }
            count =0;
        }
    }
};
