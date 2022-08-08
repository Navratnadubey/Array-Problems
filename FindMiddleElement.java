import java.util.*;

public class FindMiddleElement {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int b=a.length/2;
      System.out.println(a[b]);
  }
}