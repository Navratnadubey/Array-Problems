import java.util.*;

public class greaterorlesserElement {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      Arrays.sort(a);
      System.out.println(Arrays.toString(a));
      System.out.println(a[0]);
      System.out.println(a[a.length-1]);
  }
}