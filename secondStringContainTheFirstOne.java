import java.util.Scanner;

public class secondStringContainTheFirstOne {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the String1 : ");
        String st1 = sc.nextLine();
        System.out.println("\nEnter the String2 : ");
        String st2 = sc.nextLine();

    //     if(st2.contains(st1)){
    //         System.out.println("String2 contains String1 ");
    //     }                                                                // By using the inbuilt method
    //     else{
    //         System.out.println("Don't contain");
    //     }
        boolean contain = false;
        

        for(int i=0; i<st2.length(); i++){
            if(st2.charAt(i)==st1.charAt(0)){
                for(int j=0; j<st1.length();j++){
                    if(st2.charAt(i+j)== (st1.charAt(j))){
                        contain = true;
                    }
                    else{
                        contain = false;
                        break;
                    }
                }
                if(contain==true){
                    break;
                }
            }
        }
        if(contain==true){
            System.out.println("contain");
        }
        else System.out.println("not contain ");
    }
}
