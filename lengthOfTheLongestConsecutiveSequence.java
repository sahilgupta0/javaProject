
import java.util.Scanner;

public class lengthOfTheLongestConsecutiveSequence{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the total no. of items in list : ");    //Taking size of an array
        int size = sc.nextInt();
        System.out.println("Enter the number in 45 6 64 32 formate");       
        int[] arr = new int[size];
        int count=1, temp=0;
        for(int i = 0 ; i <size; i++){                                      //Taking the input
            arr[i] = sc.nextInt();
        }
        
        for( int i=0 ; i<size-1; i++){
            if(arr[i+1]>=arr[i]){
                count +=1;
                if(count>temp){
                    temp = count;
                }
            }
            else{
                count =0;
            }

        }

        System.out.println(temp +" element");
    }
}