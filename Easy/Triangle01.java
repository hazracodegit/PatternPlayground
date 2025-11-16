// Alternate 0-1 Triangle Pattern
/*    n=5
  1
  0   1
  1   0   1
  0   1   0   1
  1   0   1   0   1

  */
import java.util.*;
public class Triangle01{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
   
    for(int i=1;i<=n;i++){
      for(int k=1;k<=i;k++){
          if ((i+k)%2==0)
          System.out.print(1+" ");
          else
          System.out.print(0+" ");
      }
    
      System.out.println();
    }
  }
}
  
