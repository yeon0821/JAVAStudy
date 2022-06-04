```java
// 별 찍기 - 2
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            for(int j = 1; j < a-i; j++) {
                System.out.print(" ");
            }
            for(int k = 0; k < i+1; k++)
                System.out.print("*");
            System.out.println("");
        }
    }

}

```

```java
//자바 계산기 - 예외처리
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        String sign;
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번쨰 값 : ");
        a = sc.nextInt();

        System.out.println("두번째 값 : ");
        b = sc.nextInt();

        System.out.println("부호(+, -, *, /) : ");
        sign = sc.next();

        if(sign.equals("+")) {
            System.out.println(a+"+"+b+"="+(a+b));
        }
        else if(sign.equals("-")) {
            System.out.println(a+"-"+b+"="+(a-b));
        }
        else if(sign.equals("*")) {
            System.out.println(a+"*"+b+"="+(a*b));
        }
        else if(sign.equals("/")) {
            try{
                System.out.println(a+"/"+b+"="+(a/b));
            }
            catch (ArithmeticException e){
                System.out.println("오류");
            }
        }
        else {
            System.out.println("알수없는 연산자입니다 ... ");
        }

    }

}
```

```java
//X보다 작은수
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int tn = sc.nextInt();
            if (tn < a) {
                System.out.print(tn + " ");

            }
        }
    }
}
```