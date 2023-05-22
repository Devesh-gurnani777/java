import java.util.*;
public class loopinPrim {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
              System.out.print("not prim");
              break;
            }
            else {
              System.out.print("PRIM");  
              break; 
            }
        }
    }
}
