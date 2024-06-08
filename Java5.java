// To print the famous Fibonacci series, no. of terms given by the user.



import java.util.*;
public class newz{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        int n1=0,n2=1,n3=0;
        for(int i = 1;i<=n;i++){
            if(i==1){
                System.out.print(n1+" ");
            }
           else if(i==2){
                System.out.print(n2+" ");
            }else {
             n3=n1+n2;
             n1=n2;
             n2=n3;
            System.out.print(n2+" ");
            }
            }
        }
}