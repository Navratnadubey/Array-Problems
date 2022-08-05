import java.util.*;

public class countEvenpairinArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int [n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int count=0;
      for(int i=0;i<a.length;i++){
         if((a[i]%2==0)){
            count++;
          }
      }
      System.out.println(count);
  }
}