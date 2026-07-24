
// L Pattern
/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            if(col==0||row==n-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
    }
}*/

                    // Output
                    // 5
                    // *    
                    // *    
                    // *    
                    // *    
                    // *****
//-----------------------------------------------------------------------------------

//Box pattern

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            if(col==0||col==n-1||row==0||row==n-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
    }
}*/

                    // Output
                    // 5
                    // *****
                    // *   *
                    // *   *
                    // *   *
                    // *****


//-----------------------------------------------------------------------------------

// X Pattern

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            if(col==row||col+row==n-1)
            System.out.print("*");
            else
            System.out.print(" ");
        }
    }
}*/

                    // Output
                    // 5
                    // *   *
                    //  * * 
                    //   *  
                    //  * * 
                    // *   *


//-----------------------------------------------------------------------------------

//N Pattern 

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            if(col==0||col==n-1||row==col)
            System.out.print("*");
            else
            System.out.print(" ");
        }
    }
}*/

// Output
// 5 
// *   *
// **  *
// * * *
// *  **
// *   *

//-----------------------------------------------------------------------------------

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row,col;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            if((row+col)%2==0)
            System.out.print("1");
            else
            System.out.print("0");
            
        }
    }
}*/

// Output
// 5
// 10101
// 01010
// 10101
// 01010
// 10101


//-----------------------------------------------------------------------------------

// import java.util.*;
// class Main{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int row,col;
//         for(row=0;row<n;row++,System.out.println()){
//             for(col=0;col<n;col++)
//             if(row==0||row==n-1||row+col==n-1)
//             System.out.print("Z");
//             else
//             System.out.print(" ");
            
//         }
//     }
// }


                    //Output
                    // 5
                    // zzzzz
                    //   z 
                    //   z  
                    //  z   
                    // zzzzz

//-----------------------------------------------------------------------------------

// write a java program to find the given no of digits in a Number 


// import java.util.*;
// class Day5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int c = 0;
//         while(n!=0){
//             n=n/10;
//             c++;
//         }
//         System.out.print("No of the digits in the number : " + c);
//     }
// }

                // // Output
                // // 8734
                // // No of the digits in the number : 4

//-----------------------------------------------------------------------------------

// Write a java Program to reverse the Given Number 

// import java.util.*;
// class Day5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int d,ans=0;
//         while(n!=0){
//             d=n%10;
//             ans = ans*10+d;
//             n=n/10;
            
//         }
//         System.out.print("Reverse of the given number  is  : " + ans);
//     }
// }


                // Output
                // 7213
                // Reverse of the given number 0 is  : 3127

//-----------------------------------------------------------------------------------

// write a java program to add some of given numbers 


// import java.util.*;
// class Day5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the Number: ");
//         long n = sc.nextLong();
//         long d,sum=0;
//         while(n!=0){
//             d=n%10;
//             sum=sum+d;
//             n=n/10;
//         }
//         System.out.print("The Number is : " + sum);

//     }
// }

                    // Output
                    // Enter the Number: 
                    // 123456
                    // The Number is : 21

//-----------------------------------------------------------------------------------
// write a java program to find the given number is palindrome or not 


//  import java.util.*;
// class Day5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int temp = n;
//         int d,ans=0;
//         while(n!=0){
//             d=n%10;
//             ans = ans*10+d;
//             n=n/10;
//         }
//         if(ans==temp){
//              System.out.print("It is a palindrome ");
//     } else {
//         System.out.print("It is not a palindrome");
//     }
// }
// }

// Output
// 1234
// It is not a palindrome


//-----------------------------------------------------------------------------------


// import java.util.*;
// class Day5 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int s = sc.nextInt();
//         int e = sc.nextInt();
//         int c,i,j;
//         for(i=s;i<=e;i++){
//             c=0;
//             for(j=2;j<=i;j++){
//                 if(i%j==0){
//                     c++;
//                     break;
//                 }
//             }
//             if(c==0)
//                 System.out.print(i+" ");
//         }

//     }
// }


//-----------------------------------------------------------------------------------

