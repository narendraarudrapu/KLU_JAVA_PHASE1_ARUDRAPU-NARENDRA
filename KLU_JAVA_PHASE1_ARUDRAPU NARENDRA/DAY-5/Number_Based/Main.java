// to find the how many number are prime Numbers


// import java.util.Scanner;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number: ");
//         int n = sc.nextInt();//8723
//         int d,count=0;
//         while(n!=0){
//             d=n%10;
//             if(d==2 || d==3|| d==5|| d==7)
//                 count+=1;
//             n=n/10;
//             }
//             System.out.print("The Numbers are : "+count);
//         }
//         }

//Output 

// Enter the Number: 
// 23456789
// The Numbers are : 4

//=================================================================================


//  Given Number is Perfect or Not 


// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int n= sc.nextInt();
//         int sum=0;
//         for(int i=1;i<=n/2;i++){
//             if(n%i==0){
//                 sum+=i;
//             }
//         }
//         if(sum==n){
//              System.out.println("YES");
//         }else {
//         System.out.println("No");
//     }
// }
// }


// Output
// Enter the Number: 28
// YES


//=================================================================================

// Strong Number 


// import java.util.*;
// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();

//         int temp = n;
//         int sum = 0;

//         while (temp != 0) {
//             int d = temp % 10;

//             int fact = 1;
//             for (int i = 1; i <= d; i++) {
//                 fact *= i;
//             }

//             sum += fact;
//             temp = temp / 10;
//         }

//         if (sum == n)
//             System.out.println("Strong Number");
//         else
//             System.out.println("Not a Strong Number");
//     }
// }



// Output
// Enter the Number: 145
// Strong Number

//=================================================================================

// import java.util.*;

// class Main {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();

//         int temp = n;
//         int count = 0;
//         int sum = 0;

//         while (temp != 0) {
//             count++;
//             temp = temp / 10;
//         }

//         temp = n;
//         while (temp != 0) {
//             int digit = temp % 10;
//             int power = 1;

//             for (int i = 1; i <= count; i++) {
//                 power *= digit;
//             }

//             sum += power;
//             temp = temp / 10;
//         }

//         if (sum == n)
//             System.out.println("Armstrong Number");
//         else
//             System.out.println("Not an Armstrong Number");
//     }
// }

// Output
// Enter the Number: 153
// Armstrong Number



//=================================================================================

// import java.util.*;

// public class Day6 {
//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();

//         int ans = 0, sr, rev = 0, srn;

//         sr = n * n;

       
//         while (n != 0) {
//             int d = n % 10;
//             rev = rev * 10 + d;
//             n = n / 10;
//         }

      
//         srn = rev * rev;

        
//         while (srn != 0) {
//             int d = srn % 10;
//             ans = ans * 10 + d;
//             srn = srn / 10;   
//         }

        
//         if (ans == sr)
//             System.out.println("Adam Number");
//         else
//             System.out.println("Not Adam Number");
//     }
// }

// Output
// Enter the Number: 12
// Adam Number

//=================================================================================


// import java.util.*;
// public class Day6{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number n1: ");
//         int n1=sc.nextInt();
//         int sum1=0,sum2=0;
//         System.out.print("Enter the Number n2: ");
//         int n2=sc.nextInt();   
//         for(int i=1;i<=n1/2;i++){
//             if(n1%i==0)
//                 sum1=sum1+i;
//             }
//             for(int i=1;i<=n2/2;i++)
//             {
//             if(n2%i==0)
//                 sum2=sum2+i;
//             }
//         if(n1==sum2 && n2==sum1)
//             System.out.print("Amicable Pair");
//         else 
//             System.out.print("Not a Amicable Pair");
       

//     }
// }

// Output
// Enter the Number n1: 220
// Enter the Number n2: 280
// Not a Amicable Pair

//=================================================================================

// import java.util.*;
// public class Day6{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
// int n = sc.nextInt();
// int sum = 0,e,d;
// int temp = n;
//     while(n!=0){
//         e=n;
//         d=n%10;
//         sum+=d;
//         n=n/10;
//     }
// if (n % sum == 0) {
//     System.out.println("Yes it is Harshad Number ");
// } else {
//     System.out.println("No it is not Harshad Number");
// }}}


// Output
// Enter the Number : 18
// Yes it is Harshad Number 

//=================================================================================

//Neon number 
// import java.util.*;
// public class Day6{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
// int n = sc.nextInt();
// int sum = 0,e,d;
// int temp = n;
//     while(n!=0){
//         e=n*n;
//         d=n%10;
//         sum+=d;
//         n=n/10;
//     }
// if (n % sum == 0) {
//     System.out.println("Yes it is Neon Number ");
// } else {
//     System.out.println("No it is not Neon Number");
// }}}

//     Output
// Enter the Number : 81
// Yes it is Neon Number 


//=================================================================================

 