import java.util.*;
public class ifelseif {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if(a==b){
            System.out.println("Tum barabar ho baccha");
        }
        else if(a>b){
            System.out.println("a b ka baap hai");
        }
        else{
            System.out.println("b a ka baap hai");
        }
    }
}
