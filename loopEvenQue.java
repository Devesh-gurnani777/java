import java.util.*;
public class loopEvenQue {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        //int even = 0;
        for(int i=1;i<=n;i++){
            if(i % 2==0)
            System.out.println(i);
        }
    }
}