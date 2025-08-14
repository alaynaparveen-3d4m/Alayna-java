import java.util.Scanner;
public class Neon{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number");
        int num =sc.nextInt();
        int dubble=num*num;
        System.out.println("square of two is:"+dubble);
        int sum=0,rem;
        while(dubble!=0){
            rem=dubble%10;
            sum=sum+rem;
            dubble=dubble/10;
        }
        if (num == sum) {
            System.out.println("it is a neon number:"+sum);
        }
        else{
            System.out.println("do it again");
        }

    }
}

