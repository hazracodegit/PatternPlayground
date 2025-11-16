// Alphabet Triangle Pattern
/*     n=5
      A
      A   B
      A   B   C
      A   B   C   D
      A   B   C   D   E

  */
import java.util.*;
public class AlphabetTriangle{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    for(int i=1;i<=n;i++){
        char ch='A';
      for(int k=1;k<=i;k++){
          System.out.print(ch++ +" ");
      }
      System.out.println();
    }
  }
}
