/*base 1 pattern 55555 pattern

import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<n;col++)
        System.out.print("*");
        
    }
}
}*/
            // Output 
            // 5
            // *****
            // *****
            // *****
            // *****
            // ******

//---------------------------------------------------------------------------------            
            
//Base 2            
/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
        
    }
}
}*/
            //Output
            // 5
            // *
            // **
            // ***
            // ****
            // *****


//---------------------------------------------------------------------------------               
            
//Base 3           
/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<n-row;col++)
        System.out.print("*");
        
    }
}
}*/

            //Output
            // 5
            // *****
            // ****
            // ***
            // **
            // *
            
//---------------------------------------------------------------------------------              
            
//Base 4            
/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<2*row-1;col++)
        System.out.print("*");
        
    }
}
}  */   
                //Output
                // 5
                
                // *
                // ***
                // *****
                // *******
                

//---------------------------------------------------------------------------------   



//Base 5 pattern  

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<n;col++)
        System.out.print("*");
        
    }
}
}*/
            // Output
            // 5
            //     *****
            //   *****
            //   *****
            //  *****
            // *****
            
//---------------------------------------------------------------------------------

//Base 6 pattern 

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<=row-1;col++)
        System.out.print(" ");
        for(col=0;col<n;col++)
        System.out.print("*");
        
    }
}
}*/

                //Output
                // 5
                // *****
                //  *****
                //   *****
                //   *****
                //     *****
                
//---------------------------------------------------------------------------------

//Base 7 pattern

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<=row;col++)
        System.out.print("*");
    }
}
}*/

            // Output
            // 5
            // *    *
            // **   **
            // ***  ***
            // **** ****
            // **********

//---------------------------------------------------------------------------------

//base 8 pattern

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<=row;col++)
        System.out.print("*");
    }
}
}
*/

                // Output
                // 5
                // *        *
                // **      **
                // ***    ***
                // ****  ****
                // **********


//---------------------------------------------------------------------------------

//Base 9 

/*import java.util.Scanner;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    
    for(row=0;row<n-1;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
    } 
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<n-row;col++)
        System.out.print("*");}
}
}*/

                // Output
                // 5
                // *
                // **
                // ***
                // ****
                // *****
                // ****
                // ***
                // **
                // *

//---------------------------------------------------------------------------------


//Butterfly 

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n-1;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");
        for(col=0;col<=row;col++)
        System.out.print("*");
    }
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<n-row;col++)
        System.out.print("*");
        for(col=0;col<row;col++)
        System.out.print(" ");
        for(col=0;col<row;col++)
        System.out.print(" ");
        for(col=0;col<n-row;col++)
        System.out.print("*");
    }   
}
}
*/
            //Output
            // 5
            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********
            // ****  ****
            // ***    ***
            // **      **
            // *        *

//---------------------------------------------------------------------------------

/*import java.util.*;
class Main{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int col,row;
    int n = sc.nextInt();
    for(row=0;row<n-1;row++,System.out.println()){
        for(col=0;col<n-row;col++)
        System.out.print("*");
        for(col=0;col<=row-1;col++)
        System.out.print(" ");  
         for(col=0;col<=row-1;col++)
        System.out.print(" ");  
        for(col=0;col<n-row;col++)
        System.out.print("*");
        
    }
    for(row=0;row<n;row++,System.out.println()){
        for(col=0;col<=row;col++)
        System.out.print("*");
        for(col=0;col<n-row-1;col++)
        System.out.print(" ");  
         for(col=0;col<n-row-1;col++)
        System.out.print(" ");  
        for(col=0;col<=row;col++)
        System.out.print("*");}
}
}*/

            //Ouput
            // 5
            // **********
            // ****  ****
            // ***    ***
            // **      **
            // *        *
            // **      **
            // ***    ***
            // ****  ****
            // **********
//---------------------------------------------------------------------------------

// Numbers Pattern 

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col,row;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            System.out.print(row+1);
        }
    }
}
*/
                //Output 
                // 5
                // 11111
                // 22222
                // 33333
                // 44444
                // 55555


//---------------------------------------------------------------------------------

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col,row;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<n;col++)
            System.out.print(col+1);
        }
    }
}
*/

                // Output
                // 5
                // 12345
                // 12345
                // 12345
                // 12345
                // 12345


//---------------------------------------------------------------------------------

/*import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int col,row;
        for(row=0;row<n;row++,System.out.println()){
            for(col=0;col<=row;col++)
            System.out.print(row+1);
        }
    }
}*/
                    // Output
                    // 5
                    // 1
                    // 22
                    // 333
                    // 4444
                    // 55555

//---------------------------------------------------------------------------------


/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n - row; col++) {
                System.out.print(col + 1);
            }
            System.out.println();
        }
    }
}*/

                    // Output
                    // 5
                    // 12345
                    // 1234
                    // 123
                    // 12
                    // 1


//---------------------------------------------------------------------------------

/*import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num =1;
        int col,row;
        for (row = 0; row <= n; row++) {
            for (col = 0; col <row; col++) {
                System.out.print(num + " ");
                num++;
            }
            System.out.println();
        }
    }
}*/

                    // Output
                    // 5
                    // 1 
                    // 2 3 
                    // 4 5 6 
                    // 7 8 9 10 
                    // 11 12 13 14 15 
//---------------------------------------------------------------------------------



/*import java.util.*;
class Main
{
    public static void main (String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int col,row,c=1;
    for(row=0;row<n;row++,System.out.println())
    {
        for(col=0;col<n;col++)
        System.out.printf("%02d ",c++);
  }
    }
}*/

//Output
// 01 02 03 04 05 
// 06 07 08 09 10 
// 11 12 13 14 15 
// 16 17 18 19 20 
// 21 22 23 24 25 
//---------------------------------------------------------------------------------

/*import java.util.*;
class Main
{
    public static void main (String[] args) {
    Scanner obj=new Scanner(System.in);
    int n=obj.nextInt();
    int col,row,c=0;
    for(row=0;row<n;row++,System.out.println())
    {
       if(row%2==0)
       c=1;
       if(row%2!=0)
       c=2;
       for(col=0;col<=row;col++)
       {
           System.out.print(c+" ");
            c+=2;
           
       }
    }
    }
}*/

// Output
// 5
// 1 
// 2 4 
// 1 3 5 
// 2 4 6 8 
// 1 3 5 7 9 

//---------------------------------------------------------------------------------


