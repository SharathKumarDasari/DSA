import java.util.Scanner;
class Addition{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int sum=(a^b);
        int carry=(a&b);
        carry=carry<<1;
        while(carry!=0){
            a=sum;
            b=carry;
            sum=(a^b);
            carry=(a&b);
            carry=carry<<1;
            
        }
        System.out.print(sum);
    }
}