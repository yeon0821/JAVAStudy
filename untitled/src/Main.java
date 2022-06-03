
// 두 수 비교
/*
import java.util.Scanner;
public class Main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int a = scanner.nextInt();
                int b = scanner.nextInt();

                if (a > b) {
                        System.out.println('>');
                }
                if(a < b){
                        System.out.println('<');
                }
                if(a == b){
                        System.out.println("==");
                }

        }
}

 */
//import java.util.Scanner;
// 주사위 세 개 굴리기
//public class Main {
 //       public static void main(String[] args) {

                //Scanner scanner = new Scanner(System.in);

                //int a = scanner.nextInt();
                //int b = scanner.nextInt();
               // int c = scanner.nextInt();

             //   if (a == b && a == c)
                        //  System.out.println(10000 + a * 1000);
                //} else if (a == b || a == c) {
              //          System.out.println(1000 + a * 100);
            //    } else if (b == c) {
          //              System.out.println(1000 + b * 100);
        //        } else {
      //                  System.out.print((Math.max(a, Math.max(b, c)) * 100));
    //            }
  //      }
//}



// 시간 입력
/*
import java.util.Scanner;
public class Main {
        public  static void main(String[] args){
                Scanner sc = new Scanner(System.in);


                int h = sc.nextInt();
                int m = sc.nextInt();
                int n = sc.nextInt();

                int a = h*60 + m + n;
                h = a/60;
                m = a%60;

                if (h>=24) {
                        h= h-24;
                }

                System.out.println(h + " "+ m);

        }
}
*/




//  A/B
/*
import java.util.Scanner;

public class Main {
        public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);

                int f = scanner.nextInt();
                int b = scanner.nextInt();

                Double c = Double.valueOf(f)/Double.valueOf(b);

                System.out.printf("%.9f",c);

        }
}
*/

// 곱셈
/*
import  java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc= new Scanner(System.in);

                int n =sc.nextInt();
                int m =sc.nextInt();

                System.out.println(n * (m % 10));
                System.out.println(n *(m % 100/10));
                System.out.println(n * (m / 100));
                System.out.println(n * m);



        }
}

*/

/*
import  java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a>b) && (a>c)) {
                System.out.println(Math.max(b, c));
            } else if ((b>a) && (b>c)) {
                System.out.println(Math.max(a, c));
            } else if ((c>a) && (c>b)) {
                System.out.println(Math.max(a, b));
            }
            sc.close();
        }
}

 */


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a + b);
    }
}

*/

/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        if(a >= 90 && a <= 100){
            System.out.println('A');
        }
        if(a >= 80 && a <= 89){
            System.out.println('B');
        }
        if(a >= 70 && a <= 79){
            System.out.println('C');
        }
        if(a >= 60 && a <= 69){
            System.out.println('D');
        }
        if(a >= 0 && a <= 59){

            System.out.println('F');
        }


    }
}
 */


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y =sc.nextInt();

        if(y%4==0) {
            if(y%400==0) System.out.println("1");
            else if(y%100==0) System.out.println("0");
            else System.out.println("1");
        }
        else System.out.println("0");
    }
}

 */


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a> 0){
            if(b > 0){
                System.out.println(1);
            }
            else {
                System.out.println(4);
            }
        }
        else {
            if(b > 0){
                System.out.println(2);

            }
            else {
                System.out.println(3);

            }
        }

    }
}
*/



/*
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
 */




/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 0; i < a; i++){
            int A = sc.nextInt();
            int B = sc.nextInt();

            System.out.println(A+B);
        }
    }
}
 */


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int sum = 0;

        for(int i = 1; i <= a; i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
 */



/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        for(int i = 1; i <= a; i++){
            System.out.println(i);

        }
    }
}
 */


/*
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int f = sc.nextInt();
        n = (n/100) * 100; // 마지막 두자리 00으로 바꾸기

        while (n % f != 0)// 나누어 떨어지는 수 찾기
            n++;
        n %= 100;

        if (n < 10) System.out.println("0"+ n);
        else System.out.println(n);
    }
}
 */

/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요");
        String str1 = scan.nextLine();

        System.out.println("사칙연산 기호중 하나를 입력하세요");
        String sc = scan.nextLine();

        System.out.println("두번째 숫자를 입력하세요");
        String str2 = scan.nextLine();

        float num1 = scan.nextFloat();
        float num2 = scan.nextFloat();
        float num3;



            if (sc.equals("+")) {
                num3 = num1 + num2;
            } else if (sc.equals("-")) {
                num3 = num1 - num2;
            } else if (sc.equals("/")) {
                num3 = num1 / num2;
            } else {
                num3 = num1 * num2;
            }

            System.out.println(str1 + sc + str2 + "=" + num3);
        }
    }


 */


/*
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true)
        {
            System.out.print("첫번째 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두번째 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();

            try {
                int result = num1/num2;
                System.out.println(num1+" / "+num2+" = "+result);
                break;
            } catch (ArithmeticException e){
                System.out.println("0으로 나눌수 없습니다.");

            }
        }

    }

}
 */



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






















