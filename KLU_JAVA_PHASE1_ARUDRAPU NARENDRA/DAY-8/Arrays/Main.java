//Write a java program to print to get array elements from the user

// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the NUmbers: ");
//         int n=sc.nextInt();
//         int arr[]= new int[n];
//         for(int i=0;i<n;i++)
//         arr[i] = sc.nextInt();
//         for(int i=0;i<n;i++)
//         System.out.print(arr[i] + " ");
//     }
// }


// Output
// Enter the NUmbers: 5
// 10 40 30 20 50 
// 10 40 30 20 50



//==========================================================================================

// write a java program to find the sum of array elements

// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Numbers: ");
//         int n=sc.nextInt();
//         int sum=0;
//         int arr[]= new int[n];
//         for(int i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//              sum=sum+arr[i];
//         }
//         System.out.print(sum);

//     }
//     }


// Output
// Enter the Numbers: 5 
// 10 20 30 40 50
// 150

//==========================================================================================

// write a java program to count the number of odd and even elements in the given array 


// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Numbers: ");
//         int n=sc.nextInt();
//         int i,OC=0,EC=0;
//         int arr[]= new int[n];
//         for(i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//                 if(arr[i]%2==0)
//                     EC++;
//                 else 
//                     OC++;
//             }
//                 System.out.println("No of ODD Elements: "+OC);
//                 System.out.print("No of EVEN Elements: "+EC);
                
//         }}


// Output: 
// Enter the Numbers: 5
// 3 11 4 12 8
// No of ODD Elements: 2
// No of EVEN Elements: 3


//==========================================================================================

//write a java program to print the following constraints 
//i.)To find the average array elements which must be divisible by 3 and even number to print output with two decimal points


// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Numbers: ");
//         int n=sc.nextInt();
//         int i,sum=0,c=0;
//         int arr[]= new int[n];
//         for(i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//             if((arr[i]%3==0)&&  (arr[i]%2==0)){
//                     sum = sum+ arr[i];
//                     c++;
//         }
//     }
//     float avg =(float)(sum/c);
//     System.out.printf("%.2f",avg);
// }
// }


// Output
// Enter the Numbers: 5 
// 6 12 26 5 18
// 12.00


//==========================================================================================




//
// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Numbers: ");
//         int n=sc.nextInt();
//         int i;
//         int arr[]=new int[n];
//         for(i=0;i<n;i++)
//             arr[i]=sc.nextInt();
//         int ind = sc.nextInt();
//         int val = sc.nextInt();
//         arr[ind]=val;
//         for(i=0;i<n;i++)
//             System.out.print(arr[i]+ " ");
            
//         }
//     }


// Output
// Enter the Numbers: 5
// 10 20 40 50 60 
// 2
// 30
// 10 20 30 50 60 


//==========================================================================================

// Searching Techmique


// import java.util.*;
// public class Day8 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the NUmbers: ");
//         int n=sc.nextInt();
//         int i,flag=0;
//         int arr[]= new int[n];
//         for(i=0;i<n;i++)
//             arr[i]=sc.nextInt();
//             int s=sc.nextInt();
//             for(i=0;i<n;i++){
//                 if(arr[i]==s){
//                     System.out.print("present");
//                     flag=1;
//                     break;
//                 }
//             }
//             if(flag==0)
//                 System.out.print("Not present");

//         }
// }


// Output
// Enter the NUmbers: 5
// 10 20 30 40 50 
// 50
// present


//==========================================================================================

// write a java program to reverse the given array

// import java.util.*;

// public class Day8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

    
//         int start = 0, end = n - 1;
//         while (start < end) {
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;
//             start++;
//             end--;
//         }

//         System.out.println("Reversed Array:");
//         for (int i = 0; i < n; i++) {
//             System.out.print(arr[i] + " ");
//         }
//     }
// }



// or


// import java.util.*;

// public class Day8 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the size of the array: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the array elements:");
//         for (int i = 0; i < n; i++) 
//             arr[i] = sc.nextInt();
//             for(int i=n-1;i>=0;i--)
//                 System.out.print(arr[i]+ " ");
        // }}



// Output
// Enter the size of the array: 5
// Enter the array elements:
// 10 20 30 40 50
// 50 40 30 20 10 