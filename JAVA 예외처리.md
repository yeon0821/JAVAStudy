# JAVA 예외처리

- 에러 : 컴퓨터 하드웨어의 오동작 또는 고장으로 인해 응용프로그램 실행 오류가 발생하는 것

- 예외 : 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해 발생하는 프로그램 오류

  xxxxxxxxxx //피보나치 수열 -5import java.util.Scanner;public class Main {    public static void main(String[] args){        Scanner sc = new Scanner(System.in);​        int a = sc.nextInt();        System.out.println(fibo(a));    }​    public static int fibo(int n){        if (n <= 1)            return n;        else            return fibo(n-2) + fibo(n - 1);    }}java

→ 예외가 발생하면 프로그램은 곧바로 종료된다. 하지만, 예외처리를 통해 정상 실행 상태가 유지되도록 할 수 있다.



### 일반 예외(Exception)

- 컴파일 시 예외 처리 코드 검사 → 강제적으로 예외 처리 코드 작성 요구

### 실행 예외(Runtime Exception)

- 컴파일 시 예외 처리 코드 검사 X → 예외 처리 코드를 개발자의 경험을 바탕으로 작성

### 일반 예외(Exception)

- 컴파일 시 예외 처리 코드 검사 → 강제적으로 예외 처리 코드 작성 요구

### 실행 예외(Runtime Exception)

- 컴파일 시 예외 처리 코드 검사 X → 예외 처리 코드를 개발자의 경험을 바탕으로 작성

## 실행 예외(Runtime Exception)

- 개발자가 실행 예외에 대해 예외 처리 코드를 넣지 않았을 경우, 해당 예외가 발생하면 프로그램은 곧바로 종료된다.

```java
1. NullPointerException // 널값을 가진 객체를 참조하려고 하는 경우
2. ArrayIndexOutOfBoundsException // 인덱스의 크기가 초과한 경우
3. NumberFormatException // 숫자 형식 오류
4. ClassCastException // 객체의 형을 변환하는데 객체 타입 변환이 적절하지 않을때
```

### 예외 처리 코드

```java
try { //예외 발생 가능 코드

} catch(Exception1 e | Exception1_1 e) { //멀티 catch : 여러 개의 예외 중 하나만 발생해도 catch

} catch(Exception2 e) { //다중 catch : 단 하나의 catch 블록만 실행됨. 하위 예외클래스부터 나열하는 것이 기본.

} finally { //항상 실행

}
```
