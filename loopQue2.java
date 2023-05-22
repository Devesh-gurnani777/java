import java.util.*;
public class loopQue2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int mul = 0;
        for(int i=1;i<11;i++){
            mul = n * i;
            System.out.println(mul);
        }   
    }    
}
