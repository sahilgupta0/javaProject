import java.util.Scanner;


public class checkTheInputAndStringToInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Input : ");
        String input1 = sc.next();
        boolean flag = true;
        // System.out.println(input1);

        for(int i=0; i <input1.length(); i++){
            char a = input1.charAt(i);
            if(Character.isUpperCase(a)){
                flag = false;
            }
            else if(Character.isLowerCase(a)){
                flag = false;
                
            }
            else if(Character.isDigit(a)){
                flag = true;
            }
            // println(input1[i]);
        }

        if(flag==true){
            System.out.println("the input is digit");
            int input2 = Integer.parseInt(input1);
            System.out.println(((Object) input2).getClass().getSimpleName());

        }

        else System.out.println("the input is not digit");

        
        System.out.println(((Object) input1).getClass().getSimpleName());        
    }
}
                                            