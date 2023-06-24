import java.util.Scanner;

public class addNumToArrayAndReturnTheNewNumberInArray {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr ={9,9,9,9};
        int sum=0;
        for(int i : arr){
            sum = (sum*10)+i;
        }
        System.out.println(sum);
        System.out.println("Enter the number that uh wanna add : ");
        int num = sc.nextInt();

        sum+=num;

        
    }   
}
