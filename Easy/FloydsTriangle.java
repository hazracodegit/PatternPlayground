// Floyd's Triangle Number Pattern
/*      n=5
        1  
        2   3
        4   5    6
        7   8    9   10
        11  12   13  14   15

  */
import java.util.*;
public class FloydsTriangle{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x=1;
    for(int i=1;i<=n;i++){
      for(int k=1;k<=i;k++){
          System.out.print(x++ +" ");
      }
    
      System.out.println();
    }
  }
}
