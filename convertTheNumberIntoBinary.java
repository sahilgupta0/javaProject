import java.util.Scanner;

public class convertTheNumberIntoBinary {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[32];
        System.out.println("Enter the number : ");
        int num = sc.nextInt(), count=0;
        for(int i = 0; num>0; i++){
            int temp = num%2;
            arr[i]=temp;
            num = (num-temp)/2;
            count +=1;
        }
        for(int i = count-1; i>=0; i--){
            System.out.print(arr[i]);
        }
    }
}
