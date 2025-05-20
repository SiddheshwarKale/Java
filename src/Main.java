import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        18-may-2025
        Scanner sc=new Scanner(System.in);
//
//        System.out.println("1.Addition +");

//        System.out.println("2.subtraction -");
//        System.out.println("3.Multiplication *");
//        System.out.println("4.Division /");
//        System.out.println("5.Modulo %");
//
//        int button=sc.nextInt();
//
//        System.out.println("Enter First Number");
//        int a=sc.nextInt();
//        System.out.println("Enter Second Number");
//        int b=sc.nextInt();
//
//        switch (button){
//            case 1:
//                System.out.println(a+b);
//                break;
//            case 2:
//                System.out.println(a-b);
//                break;
//            case 3:
//                System.out.println(a*b);
//                break;
//            case 4:
//                System.out.println(a/b);
//                break;
//            case 5:
//                System.out.println(a%b);
//                break;
//            default:
//                System.out.println("Error");
//
//        }

//EX.2: Ask the user to enter the number of the month & print the name of the month.
//        for ex.-for '1'print 'january','2' print 'februry' & so on.

//        int Choice= sc.nextInt();
//
//        switch (Choice){
//            case 1:
//                System.out.println("January");
//                break;
//
//            case 2:
//                System.out.println("february");
//                break;
//            case 3:
//                System.out.println("march");
//                break;
//            case 4:
//                System.out.println("april");
//                break;
//            case 5:
//                System.out.println("may");
//                break;
//            case 6:
//                System.out.println("JUN");
//                break;
//            case 7:
//                System.out.println("july");
//                break;
//            case 8:
//                System.out.println("august");
//                break;
//            case 9:
//                System.out.println("september");
//                break;
//            case 10:
//                System.out.println("octomber");
//                break;
//            case 11:
//                System.out.println("navember");
//                break;
//            case 12:
//                System.out.println("december");
//                break;
//
//        }

//        19-may-2025
//        LOOPS


//        for (int i=1;i<=10;i++){
//            System.out.println(i);
//        }


//        While Loop
//        int i=0;
//        while (i<=10)
//        {
//            System.out.println(i);
//            i++;
//        }


//        do while loop
//        int i=0;
//        do{
//            System.out.println("Hello" +i);
//            i++;
//        } while(i<=10);

//        Que;- print the number of first n natural numbers./

//        int n=sc.nextInt();
//        int sum=0;
//        for(int i=1;i<=n;i++)
//        {
//            sum=sum+i;
//        }
//        System.out.println(sum);


//        que:-2  Print The table of a num input by the user.

//        int n=sc.nextInt();
//        for(int i=1;i<=10;i++){
//            System.out.println(n*i);
//        }

//        que;-3 Print all even Number till n.
//        int n=sc.nextInt();
//        for (int i=0;i<=n;i++){
//            System.out.println(i%2==0);
//        }
//        for ( ; ; ){
//            System.out.println("Sidd Kale");
//        }

//        20-may-2025
//   print the pattern  #solid rectangal
//        *****
//        *****
//        *****
//        *****
//

//    Q.2    print the pattern    #hollow rectangel
//        *****
//        *   *
//        *   *
//        *****

//        int n=4;
//        int m=5;
//
//        for( int i=1;i<=n;i++){
//            for(int j=1;j<=m;j++){
//                if(i == 1||j == 1||i == n||j == m){
//                    System.out.print("*");
//                }else {
//                    System.out.print(" ");
//                }
//            }
//            System.out.println();
//        }

//        Q3  Print the pattern   # half pyramid
//        *
//        **
//        ***
//        ****

//        int n =4;
//        for(int i=1;i<=n;i++){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Q4 Print the pattern   #inverted half pyramid.
//        ****
//        ***
//        **
//        *

//        int n =4;
//        for(int i=n;i>=1;i--){
//            for (int j=1;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

//        Q5 print the patern     #inverted half pyramid (Roteded by 180 deg)

        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("*");

            }
            System.out.println();
        }






    }
}