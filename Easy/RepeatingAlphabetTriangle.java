// Repeating Alphabet Triangle Pattern
/*   n=5
   A
   B  B
   C  C  C
   D  D  D  D
   E  E  E  E  E

  */
import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    char ch='A';
    for(int i=1;i<=n;i++){
      for(int k=1;k<=i;k++){
          System.out.print(ch +" ");
      }
      ch++;
      System.out.println();
    }
  }
}
