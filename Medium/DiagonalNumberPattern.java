// Diagonal Number Pattern

/*         n=5
     1             1
         2     2
            3
         4     4
     5             5

  */
import java.util.*;
public class DiagonalNumberPattern{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    for(int i=1;i<=n;i++){
     for(int j=1;j<=n;j++){
         if (i==j||(j==n-i+1))
         System.out.print(i+" ");
         else
         System.out.print(" ");
     }
      System.out.println();
    }
  }
}
