

//Swapping of two numbers by using Arthimetic Operation

// import java.util.*;
// public class Day9 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//          System.out.println("Before Swap : "+a+" "+b);
//         a=a+b;
//         b=a-b;
//         a=a-b;
//         System.out.print("After Swap : "+a+" "+b);
//     }
// }


// Output
// Enter the number: 10 20 
// Before Swap : 10 20
// After Swap : 20 10

//============================================================================================================================== 

//Swapping of two numbers by using Arthimetic Operation(XOR Operator)

// import java.util.*;
// public class Day9 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//          System.out.println("Before Swap : "+a+" "+b);
//         a=a^b;
//         b=a^b;
//         a=a^b;
//         System.out.print("After Swap : "+a+" "+b);
//     }
// }


// Output
// Enter the number: 10 20 
// Before Swap : 10 20
// After Swap : 20 10

//==============================================================================================================================


//Swapping of Array 

// import java.util.*;
// public class Day9 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         int i;
//         for(i=0;i<n;i++)
//             arr[i]=sc.nextInt();
//         for(i=0;i<n-1;i+=2){
//             int temp=arr[i];
//             arr[i]=arr[i+1];
//             arr[i+1] = temp;
//         }
//         for(i=0;i<n;i++)
//          System.out.print(arr[i]+" ");
//     }
   
// }


// Output
// Enter the number: 5
// 10 20 30 40 50
// 20 10 40 30 50 

//==============================================================================================================================


//Write a java program to move all the zeroes to the left and ones to the right 

// import java.util.*;
// public class Day9 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         int i,oc=0,zc=0;
//         for(i=0;i<n;i++){
//             arr[i]=sc.nextInt();
//             if(arr[i]==0)
//                 zc++;
//         }
//         for(i=0;i<zc;i++)
//             arr[i]=0;
        
//         for(i=zc;i<n;i++)
//             arr[i]=1;
//         for(i=0;i<n;i++)
//             System.out.print(arr[i]+" ");
//     }
// }


// Output
// Enter the number: 5
// 1 0 1 1 0
// 0 0 1 1 1 


//==============================================================================================================================

//Write a java program to move all the zeroes to the left and ones to the Middle and Twos to Right


// import java.util.*;
// public class Day9 {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the number: ");
//         int n=sc.nextInt();
//         int arr[] = new int[n];
//         int i,oc=0,zc=0;
//         for(i=0;i<n;i++){
//         arr[i]=sc.nextInt();
//             if(arr[i]==0)
//                 zc++;
//             else if(arr[i]==1)
//                 oc++;
            
//         }
//         for(i=0;i<zc;i++)
//             arr[i]=0;
//         for(i=zc;i<zc+oc;i++)
//             arr[i]=1;
//         for(i=zc+oc;i<n;i++)
//             arr[i]=2;
//         for(i=0;i<n;i++)
//             System.out.print(arr[i]+" ");
//     }}


// Output    
// Enter the number: 5
// 0 1 1 2 0
// 0 0 1 1 2

//==============================================================================================================================



// import java.util.*;

// public class Day9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter the number of elements: ");
//         int n = sc.nextInt();

//         int arr[] = new int[n];

//         System.out.println("Enter the array elements (sorted):");
//         for (int i = 0; i < n; i++) {
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the element to search: ");
//         int t = sc.nextInt();

//         int low = 0;
//         int high = n - 1;
//         int flag = 0;

//         while (low <= high) {
//             int mid = (low + high) / 2;

//             if (arr[mid] == t) {
//                 flag = 1;
//                 System.out.println("Present");
//                 break;
//             } else if (arr[mid] < t) {
//                 low = mid + 1;
//             } else {
//                 high = mid - 1;
//             }
//         }

//         if (flag == 0) {
//             System.out.println("Not Present");
//         }
//     }
// }



// Output
// Enter the number of elements: 5
// Enter the array elements (sorted):
// 10 20 30 40 50 
// Enter the element to search: 20
// Present