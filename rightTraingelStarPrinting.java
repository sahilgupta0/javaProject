import java.util.Scanner;

public class rightTraingelStarPrinting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of row : ");
        int input = sc.nextInt();

        for(int i=0; i<input; i++){
            int start = input-1-i;
            for(int j=0; j<input; j++){
                if(j>=start){
                    System.out.print("*");
                }
                else System.out.print("-");

            }
            System.out.println("\n");
        }

    }    
}
