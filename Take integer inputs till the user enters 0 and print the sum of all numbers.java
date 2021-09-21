import java.util.Scanner;

public class Abs {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int sum=0;
        while(sum<=n){
            for (int i = 0; i <n ; i++) {
                sum=sum+i;
                sum++;



            }
            System.out.println(sum);
            if(n==0){
                break;

            }


        }
    }
}