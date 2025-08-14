
import java.util.Scanner;
public class Calculator{
    public static void main(String args[]){
        login();
    }
    static void login(){
        String username="alsdad";
        String password="sdasdd";
        Scanner sc=new Scanner(System.in);
        System.out.println("enterthe username");
        String username1=sc.nextLine();
        System.out.println("enter the password");
        String password1=sc.nextLine();
        if(username=="alsdad" && password=="sdasdd"){
            System.out.println("the username and password are same you can continue");
        }
        else{
            System.out.println("error please do it again");
        }
        char operator=sc.next().charAt(0);
        int a=5;
        int b=6;
        int result;
        switch( operator){
            case '+':
                result=a+b;
                System.out.println("sum of a and b"+result);
                break;
            case '-':
                result=a-b;
                System.out.println("sub of a and b"+result);
                break;
            case '*':
                result=a*b;
                System.out.println("mul of a and b"+result);
                break;
            case '%':
                result=a%b;
                System.out.println("mod of a and b"+result);
                break;
            case '/':
                result=a/b;
                System.out.println("div of a and b"+result);
                break;
            default:
                System.out.println("try again");
        }
    }
}

