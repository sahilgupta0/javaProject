import java.util.Random;
import java.util.Scanner;
public class scissorPaperRock {

    static void loop(){

    
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        int cChoice = 1+rand.nextInt(3);
        System.out.println("Computer has choosen : ");

        

        System.out.println("Enter your choice : \n1.Sissor\n2.Paper \n3.Rock ");

        int pChoice = sc.nextInt();

        if(cChoice == pChoice){
            System.out.println("!!!Game is Draw!!!");
            
        }
        else if(cChoice==1){
            if(pChoice==2){
                System.out.println("Computer Win");
            }
            else if(pChoice==3){
                System.out.println("You win");
            }
            System.out.println("Computer had choosen : Scissor");
        }
        else if(cChoice==2){
            if(pChoice==3){
                System.out.println("Computer Win");
            }
            else if(pChoice==1){
                System.out.println("You win");
            }
            System.out.println("Computer had choosen : Paper");
        }
        else if(cChoice==3){
            if(pChoice==1){
                System.out.println("Computer Win");
            }
            else if(pChoice==2){
                System.out.println("You win");
            }
            System.out.println("Computer had choosen : Rock");
        }

        System.out.print("Do you wanna play again(y/n) : ");

        char dec = sc.next().charAt(0);
        if(dec=='y'){
            loop();
        }
    }
    public static void main(String[] args){
        
        
        loop();
    }
}
