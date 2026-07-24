
//Tail Recursion


// import java.util.*;

// public class Day12 {
//     static void fun(int n) {
//         if (n > 0) {
//             System.out.println(n);
//             fun(n - 1);
//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();

//         fun(n);
//     }
// }


// Output
// Enter the Number: 5
// 5
// 4
// 3
// 2
// 1


//==========================================================================================

//Head Recursion

// import java.util.*;

// public class Day12 {
//     static void fun(int n) {
//         if (n > 0) {
//             fun(n - 1);
//             System.out.print(n);
//             System.out.println(n+1);
            
//         }
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();
//         fun(n);
//     }
// }


// Output
// Enter the Number: 3
// 12
// 23
// 34


//==========================================================================================


//Linear Recursion

// import java.util.*;
// class Main{
//     static int fact(int n){
//         if(n==0||n==1)
//             return 1;
//         return n*fact(n-1);
//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int n=sc.nextInt();
//         int ans=fact(n);
//         System.out.println(ans);

//     }
// }


// Output
// Enter the Number: 5
// 120


//==========================================================================================


//Nested Recursion


// import java.util.*;

// class Main {

//     static int fun(int n) {
//         if (n > 100)
//             return n - 10;
//         return fun(fun(n + 11));
//     }

//     public static void main(String[] args) {
//         int ans = fun(98);
//         System.out.print(ans);
//     }
// }


// Output
// 91


//==========================================================================================
