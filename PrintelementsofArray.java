import java.util.*;

public class PrintelementsofArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      System.out.println("Elements in proper fom");
      for(int i=0;i<a.length;i++){
        System.out.println(a[i]);
      }
      System.out.println("Elements in Reverse");
      for(int i=a.length-1;i>=0;i--){
        System.out.println(a[i]);
      }
  }
}