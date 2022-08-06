import java.util.*;

public class StoreArrayElementinOtherArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      int b[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      for(int i=0;i<a.length;i++){
        b[i]=a[i];
      }
      System.out.println(Arrays.toString(b));
  }
}