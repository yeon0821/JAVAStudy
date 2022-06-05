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
//단어의 개수
import java.util.Scanner;
import java.util.StringTokenizer;
public class Main {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);

        String S = sc.nextLine();

        StringTokenizer st = new StringTokenizer(S, " ");
        System.out.println(st.countTokens());
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

```java
// 45분 전
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();

        if (M < 45) {
            H--;
            M = 60 - (45 - M);
            if(H < 0){
            H = 23;

        }
        System.out.println(H + " " + M);
    }
    else {
            System.out.println(H + " "+ (M - 45));
        }


    }
}
```

```java
//배수와 약수
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        while (true){
            int first = sc.nextInt();
            int second = sc.nextInt();


            if(first == 0 && second == 0) break;

            if (second % first == 0){
                System.out.println("factor");
            }
            else if(first % second == 0){
                System.out.println("multiple");
            }
            else {
                System.out.println("neither");
            }

        }


    }

}
```

```java
//피보나치 수열 -1
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int F1 =0, F2 = 1, F3 = 1;

        for(int i = 2; i <= n; i++)
        {
            F3 = F1 + F2;
            F1 = F2;
            F2 = F3;
        }
        System.out.println(F3);
    }
}
/*
피보나치 수열은 0과 1로 시작하며 바로 앞의 두 피보나치수의 합이 다음 피보나치수가 된다.
즉,첫번째항과 두번째항의 합이 세번째 항이되고, 두번째항과 세번째항의 합이 네번째항이 된다.
수식으로 표현하면 f(n)=f(n-2)+f(n-1)인데 재귀함수로 풀면 중복계산되어 시간이 많이 걸리므로 반복을 이용해서 풀수 있다.
/*
```

```java
//피보나치 수열 -5
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println(fibo(a));
    }

    public static int fibo(int n){
        if (n <= 1)
            return n;
        else
            return fibo(n-2) + fibo(n - 1);
    }
}
```
