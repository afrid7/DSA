import java.util.*;
public class Ugly_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the PrimeFacter value");
        int num = sc.nextInt();
        int flag=0;
        while(num>1){
            if(num%2==0){
                num=num/2;
            }
            else if(num%3==0){
                num=num/3;
            }
            else if(num%5==0){
                num=num/5;
            }
            else{
                System.out.println("not a ugly number");
                flag = 1;
                break;
            }
            if(flag==0){
                System.out.println("It is a ugly number");
            }
        }
        
    }
    
}
