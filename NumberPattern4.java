import java.util.*;
public class NumberPattern4{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
      for(int j=1;j<=n;j++){
        if (i==j)
        System.out.print(i+" ");
        else
        System.out.print(0+" ");
      }
      System.out.println();
    }
  }
}




/*          Output :
       n=5


         1 0 0 0 0
         0 2 0 0 0
         0 0 3 0 0
         0 0 0 4 0
         0 0 0 0 5


  */
