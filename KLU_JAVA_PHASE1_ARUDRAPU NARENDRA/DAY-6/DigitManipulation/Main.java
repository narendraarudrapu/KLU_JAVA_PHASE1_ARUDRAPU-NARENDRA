// Method With No Arguments and No return Type
// import java.util.*;
// public class Day7 {
//     public static void main(String[] args){
//         pow();
//     }
//     static void pow(){
//         int a,b,ans=0;
//         Scanner sc = new Scanner(System.in);
//         a=sc.nextInt();
//         b=sc.nextInt();
//         int pow=1;
//         while(b!=0){
//             pow=pow*a;
//             b--;
//         }
//         System.out.print(pow);
//     }
// }


// Output
// 5 3
// 125


// ========================================================================================================



//  import java.util.*;
// public class Day7 {
//     public static void main(String[] args){
//         perfectsquare();
//     }
//     static void perfectsquare(){
//         Scanner sc = new Scanner(System.in);
//         int n=sc.nextInt();
//         int flag=0;
//         for(int i=1;i<=n/2;i++){
//             if(i*i==n){
//                 System.out.print("Perfect Square");
//                 flag=1;
//                 break;
//             }
           
//         }
//         if(flag==0)
//                 System.out.print("Not a perfect Number");
//         }
        
//     }


// Output
//     81
// Perfect Square


// ========================================================================================================


// import java.util.*;
// class Day7{
//     public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the Number: ");
//         int n= sc.nextInt();
//         automorphic(n);
//     }
//     static void automorphic(int num){
//         int temp=num;
//         int sq=num*num;
//         int c=0;
//         while(num!=0){
//             num=num/10;
//             c++;
//         }
//         int val=(int)Math.pow(10,c);

//         if(sq%val==temp)
//             System.out.print("Automorphic Number");
//         else 
//             System.out.print("Not Automorphic Number");
    
//     }
// }

// Output
// Enter the Number: 625
// Automorphic Number

// ========================================================================================================

// Method with no argument with return type
// a specific digit count in the given number 

/*Syntax: 
returntype methodname(){
    //method definition;
    return result;
}
public static void main(String[] args){
    datatype result = methodname();//method calling
}*/



// import java.util.*;
// class Day7{y
//     public static void main(String[] args){
//         int ans=occurence();
//         System.out.print("the count value is "+ ans);
//     }
//     static int occurence(){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number: ");
//         int n=sc.nextInt();
//         int dig=sc.nextInt();
//         int c=0;
//         while(n!=0){
//            int d=n%10;
//             if(d==dig)
//             c++;
//             n=n/10;
//         }
//         return c;
//     }
// }


// Output
// Enter the Number: 1888 8
// the count value is 3

// ========================================================================================================

// Method with argument with return tyoe 

// syntax; 

// returntype methodname(datatyoe variablename){
//     //method definiton;
//     return result;
// }
// publilc static void main(String[] args){
//     datatype result = methodname(variablename);//method calling 
// }

// ========================================================================================================

// write a java program to check the given number power of 2 or not by using method with argument with return type 


// import java.util.*;

// class Day7 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the Number: ");
//         int n = sc.nextInt();

//         int ans = Powerof2(n);

//         if (ans == 1)
//             System.out.println("Power of 2");
//         else
//             System.out.println("Not a Power of 2");
//     }

//     static int Powerof2(int num) {
//         if (num <= 0)
//             return 0;

//         while (num % 2 == 0) {
//             num = num / 2;
//         }

//         if (num == 1)
//             return 1;
//         else
//             return 0;
//     }
// }

// Output
// Enter the Number: 16
// Power of 2

// ========================================================================================================


// Example 1 : 
// Input : num = 526;
// Output : true
// Explanation: Reverse num to get 625 then reverse the 625 to get 526 which is equals to num.


//  Answer 


// import java.util.*;
// class Day7{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n= sc.nextInt();
//         int ans = doublerev(n);
//         if(ans==n)
//             System.out.print("True");
//         else {
//             System.out.print("False");
//         }
        
//     }
//     static int doublerev(int n){
//         int d,rev1=0,rev2=0;
//         while(n!=0){
//             d=n%10;
//             rev1=rev1*10+d;
//             n=n/10;
//         }
//         while(rev1!=0){
//             d=rev1%10;
//             rev2=rev2*10+d;
//             rev1=rev1/10;
//         }
//         return(rev2);
//     }
// }


// Output:
// Enter the number: 526
// True

//========================================================================================================
// Example 2 :

// Input : num=1800
// Output : false
// Explanation : Reverse num to get 81,then reverse 81 to get 18 ,which does not equal num

// Answer 
//========================================================================================================


 