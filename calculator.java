import java.util.*;
public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        String c = sc.next();
        int b = sc.nextInt();
        int add = a + b;
        int sub = a - b;
        int div = a / b;
        int mul = a * b;
        int modulo = a % b;
        switch(c){
            case "+":
            System.out.println(add);
            break;
            case "-":
            System.out.println(sub);
            break;
            case "/":
            System.out.println(div);
            break;
            case "*":
            System.out.println(mul);
            break;
            case "%":
            System.out.println(modulo);
            break;
            default:
            System.out.println("kuch bi salee");
        }
    }
}
