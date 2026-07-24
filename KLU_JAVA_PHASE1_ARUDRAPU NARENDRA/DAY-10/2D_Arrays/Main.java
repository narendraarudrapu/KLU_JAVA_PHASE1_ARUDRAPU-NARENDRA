
// Write a java program for 2D array 


// import java.util.*;
// public class Day10 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the Matrix: ");
//         int r=sc.nextInt();
//         int c= sc.nextInt();
//         int arr[][] = new int[r][c];
//         System.out.print("Enter the elements of the Matrix: ");
//         int i,j;
//         for(i=0;i<r;i++){
//             for(j=0;j<c;j++)
//                 arr[i][j]=sc.nextInt();

//         }
//         for(i=0;i<r;i++,System.out.println())
//         {
//             for(j=0;j<c;j++){
//                 System.out.print(arr[i][j]+ " ");
//             }
//         }
//     }
// }


// Output
// Enter the size of the Matrix: 2 2
// Enter the elements of the Matrix: 10 20 30 40 
// 10 20 
// 30 40 


//==========================================================================================



// import java.util.*;
// public class Day10 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the Matrix: ");
//         int r=sc.nextInt();
//         int c= sc.nextInt();
//         int arr[][] = new int[r][c];
//         System.out.print("Enter the elements of the Matrix: ");
//         int i,j;
//         int sum=0;
//         for(i=0;i<r;i++){
//             for(j=0;j<c;j++){
//                 arr[i][j]=sc.nextInt();
//                 sum=sum+arr[i][j];
                
//             }

//         }
//         System.out.print(sum+" ");
//     }
// }



// Output
// Enter the size of the Matrix: 2 2
// Enter the elements of the Matrix: 10 20 30 40
// 100 


//==========================================================================================

// import java.util.*;
// public class Day10 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the size of the Matrix: ");
//         int n=sc.nextInt();

//         int arr[][] = new int[n][n];
//         int i,j;
//         for(i=0;i<n;i++){
//             for(j=0;j<n;j++){
//                 arr[i][j]=sc.nextInt();
//             }
//         }
//         System.out.println("Primary Diagonal Element: ");
//         for(i=0;i<n;i++){
//             System.out.println(arr[i][i]);
//         }
//         System.out.println("Secondary Diagonal Elements: ");
//             System.out.println();
//             for(i=0;i<n;i++)
//                 System.out.println(arr[i][n-1-i]+" ");
        
//     }}


// Output
// Enter the size of the Matrix: 3
// 10 20 30 40 50 60 70 80 90
// Primary Diagonal Element: 
// 10
// 50
// 90
// Secondary Diagonal Elements: 

// 30 
// 50 
// 70 


//==========================================================================================


// Inbuilt Functions 


// import java.util.*;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         System.out.println(s);
//     }
// }


// Output
// Enter the String: Benny
// Benny


//==========================================================================================


// import java.util.*;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc =new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         System.out.println(s.length());
//     }
// }



// Output
// Enter the String: Benny
// 5


//==========================================================================================
 


// Write a java program to find the length of the string without Inbuilt Function

// import java.util.*;
// public class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         int count=0;
//         String s=sc.nextLine();
//         for(char c:s.toCharArray())
//             count++;
//         System.out.print("The count is : "+count);

//     }
// }



// Output
// Enter the String: Nagendra 
// The count is : 8

//==========================================================================================


//write a java program to count no.of words in the given string 

// import java.util.*;
// public class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         int space=0;
//         String s=sc.nextLine();
//         for(char c:s.toCharArray())
//         {
//             if(c==' ')
//                 space++;
//         }
//         System.out.print(space+1);

//     }
// }


// Output
// Enter the String: slow and steady wins the race
// 6

//==========================================================================================



 //Write a java program to reverse the given string 


//  import java.util.*;
// public class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         String rev="";
//         int i;
//         for(i=s.length()-1;i>=0;i--)
//             rev=rev+s.charAt(i);
//         System.out.print(rev);
// }}

// Output
// Enter the String: cse
// esc


//==========================================================================================


//Write a java program to counts the no.of vowels int he given string 

// import java.util.Scanner;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         int count=0;
//         for(char c:s.toCharArray())
//         {
//             if(c=='A'||c=='E'||c=='I'||c=='O'||c=='U'||c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
//                 count++;
//         }
//         System.out.print(count);
//     }
// }

// Output
// Enter the String: Apple
// 2


//==========================================================================================

// wrirte a java program to change the string to lowercase 


// import java.util.Scanner;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         for(char c:s.toCharArray())
//         {
//             c=(char)(c+32);
//             System.out.print(c);
//         }
//         }}


// Output
// Enter the String: Nagendra
// n

//==========================================================================================


// wrirte a java program to change the string to Uppercase 


// import java.util.Scanner;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         for(char c:s.toCharArray())
//         {
//             c=(char)(c-32);
//             System.out.print(c);
//         }
//         }}



// Output
// Enter the String: Nagendra
// .AGENDRA



//==========================================================================================


// write a java program to count the no.of special charcater in a given String 



// import java.util.Scanner;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         int count=0;
//         for(char c:s.toCharArray()){
//             if((c>='A' && c<='Z')||(c>='a' && c<='b')||(c>='0' && c<='9'))
//                 count++;
//         }
//         System.out.print(count);
//     }}


// Output
// Enter the String: Password@123#$
// 5


//==========================================================================================


//write a java program to googel the given string


// import java.util.*;
// class Day10{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String s=sc.nextLine();
//         int count=0;
//         for(char c:s.toCharArray()){
//             if(c>='A' && c<='Z')
//                 c=(char)(c+32);
//             else if(c>='a' && c<='z')
//                 c=(char)(c-32);
//             System.out.print(c);
// }}}


// Output
// Enter the String: classROOM
// CLASSroom


//==========================================================================================


// write a java program that given string is palindrome or not

// import java.util.*;

// class Day5 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the String: ");
//         String str = sc.nextLine();
//         String rev = "";

//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }

//         if (str.equals(rev)) {
//             System.out.println("It is a palindrome");
//         } else {
//             System.out.println("It is not a palindrome");
//         }
//     }
// }


// Output
// Enter the String: MOM
// It is a palindrome