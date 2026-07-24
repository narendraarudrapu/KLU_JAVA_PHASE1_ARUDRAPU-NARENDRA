/*import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius: ");
        Float radius = sc.nextFloat();
        Float area = (float)3.14 * radius * radius;
        System.out.printf("%.2f", area);
    }
}
*/
//========================================================================================================


/*import java.util.*;
class Main{
    public static void main(String[] args){
        if(!false)
            System.out.print("ice");
            System.out.print("cream");
        else
        System.out.print("icecream");
        }

    }*/

//========================================================================================================

/*import java.util.Scanner;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the n:");
        int n = sc.nextInt();
        if(n%2 == 0){
            System.out.print("Divisible by 2");
        }
        else {
            
            System.out.print("Not Divisible by 3 and remainder is 2");
        }
    }
}*/


//========================================================================================================


/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a >= 0 && a <= 34) {
            System.out.println("Fail");
        } else if (a >= 35 && a <= 60) {
            System.out.println("Average");
        } else if (a >= 61 && a <= 80) {
            System.out.println("Good");
        } else if (a >= 81 && a <= 100) {
            System.out.println("Excellent");
        } else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}*/

//========================================================================================================


/*import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } 
        else if (a == b || b == c || a == c) {
            System.out.println("Isosceles triangle");
        } 
        else {
            System.out.println("Scalene triangle");
        }

        sc.close();
    }
}*/

//========================================================================================================


/*import java.util.Scanner;
class Main{
    public static void main(String[] args){
        if (System.out.printf("My Name is Nagendra") == null) {
        
            
        }
    }
}*/

//========================================================================================================


/*import java.io.*;
 import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int i = 1;
        for(;i<=5;i++){
            System.out.print(i+" ");
        }
    }
}*/


//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int i;
        for(;i<=10;i++){
            System.out.print(i+" ");
        }
    }
}*/
//output : Main.java:111: error: variable i might not have been initialized
        //for(;i<=10;i++){
             
//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int i;
        for(i=1;;i++){
            System.out.print(i+" ");
        }
    }
}*/
// Output : numbers from  1 to infinite will be printed as output 

//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
    public static void main(String[] args){
        int i;
        for(i=1;;){
            System.out.print(i+" ");
        }
    }
}
*/

// Output : 1 will be printed infinite times
//========================================================================================================




/*import java.io.*;
import java.util.Scanner;
class Main{
    static int i;
    public static void main(String[] args){
        
        for(;;){
            System.out.print(i+" ");
        }
    }
}*/

// Output : 0 is printed Infinite Times 

//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
   
    public static void main(String[] args){
        int i = 10;
        for(;i>0;i--){
            System.out.print(i+" ");
        }
    }
}*/

// Output : 10 9 8 7 6 5 4 3 2 1 

//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
   
    public static void main(String[] args){
        int i;
        for(i=2;i>3;i--){
            System.out.print(i);
        }
    }
}*/

//Output : No Output


//========================================================================================================


/*import java.io.*;
import java.util.Scanner;
class Main{
   
    public static void main(String[] args){
        int i=1;
        for(;i<=10;i++);
            System.out.print(i);
        
    }
}

*/
//Output : 11

//========================================================================================================


/*java program to find the sum of n natural numbers */

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
        }
        System.out.print("sum of "+n+" Natural Numbers: " + sum);
    }
}*/

//sum of 25 Natural Numbers: 325

//========================================================================================================


//java program to find the factors of given Numbers


/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the n: ");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            if(n%i==0){
        
        System.out.print(i+ " ");
        }
    }
}
}*/
//Output
      //     Enter the n: 25
     //       1 5 25   
      
//========================================================================================================

//Factorial  od the number addition 

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.print("The Factorial of the number "+n+":  " + fact );
    }
}*/

//Output: 
            //Enter the number: 27
            //The Factorial of the number 27:  1484783616


//========================================================================================================

        
/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();
        int t = sc.nextInt();
        int i;
        for(i=1;i<=n;i++)
        System.out.printf("%02d * %02d = %02d\n",i,t,i*t);
    }
} */       
     /* Output 
        Enter the number: 5
        15
        01 * 15 = 15
        02 * 15 = 30
        03 * 15 = 45
        04 * 15 = 60
        05 * 15 = 75*/
        
//========================================================================================================
    

//Given Number is Prime Number or Not 


// import java.util.Scanner;
// class Day3 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int n = sc.nextInt();
//         int i, c = 0;
        
//         for (i = 2; i <= n / 2; i++) {
//             if (n % i == 0) {
//                 c++;
//             }
//         } 
//         if (n <= 1 || c > 0) {
//             System.out.print("Not a prime Number");
//         } else {
//             System.out.print("It is a Prime Number");
//         }
//     }
// }


// Output
// Enter the number : 25
// Not a prime Number

//========================================================================================================

        
        