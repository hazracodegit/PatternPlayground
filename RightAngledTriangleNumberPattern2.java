import java.util.*;
public class RightAngledTriangleNumberPattern{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=0;i<n;i++){
      int x=n-i;
      for(int j=0;j<=i;j++){
        System.out.print(x);
        x++;
      }
      System.out.println();
    }
  }
}



/*         Output :
          n=5

            5
            4    5
            3    4    5
            2    3    4    5
            1    2    3    4    5


  */
