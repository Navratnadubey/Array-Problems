import java.util.*;

public class AlternateelememtsofArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int [n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      System.out.println("Alternate Number");
    for(int i=0;i<a.length;i=i+2){
      System.out.println(a[i]);
    }
    System.out.println("Alternate Number in Reverse Number");
    for(int i=a.length-1;i>=0;i=i-2){
      System.out.println(a[i]);
    }
  }
}