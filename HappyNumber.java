import java.util.Scanner;
public class HappyNumber {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input value");
        int n=sc.nextInt();
        int r,sum=0;
        while(true){
            while(n!=0){
                r=n%10;
                sum=sum+(r*r);
                n=n/10;
            }
            if(sum<=9){
                break;
            }
            else{
                n=sum;
                sum=0;
            }
        }
            if(sum==1 || sum==7){
                System.out.print("Happy number");
            }
            else{
                System.out.print("Not a Happy number");

             }

    }
}


