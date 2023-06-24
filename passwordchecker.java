import java.util.Scanner;

public class passwordchecker {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the password : ");    
        String password = sc.next();
        int i = 0;
        boolean upperCase = false, lowerCase=false, digit = false, specialCase=false;

        for(; i<password.length(); i++){
            char a = password.charAt(i);
            if(Character.isLowerCase(a)){ 
                lowerCase=true;
            }
            else if(Character.isUpperCase(a)){
                upperCase = true;
            }
            else if(Character.isDigit(a)){
                digit = true;
            }
            else{
                specialCase = true;
            }
        }

        if(upperCase==true&&lowerCase==true&&specialCase==true&&digit==true){
            System.out.println("The is strong\n\n");
        }
        else {
            System.out.println("The password is not strong");
            if(upperCase == false){
                System.out.print("UpperCase ");
            }
            if(lowerCase== false){
                System.out.print("LowerCase ");
            }
            if(specialCase== false){
                System.out.print("Special Character ");
            }
            if(true){
                System.out.print(" are missing");
            }
        }



    }
}
