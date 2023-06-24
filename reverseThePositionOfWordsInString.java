import java.util.Scanner;
public class reverseThePositionOfWordsInString {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        String input = sc.nextLine();
        String name[] = input.split(" ");
        
        int count=0;
        for(String i  : name){
            count+=1;
        }
        String store[]= new String[count];
        for(String i : name){
            count-=1;
            store[count]=i;
        }
        for(String i : store){
            System.out.print(i +" ");
        }
    }
}
