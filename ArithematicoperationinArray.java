import java.util.*;

public class ArithematicoperationinArray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int sum=0;
      int prod=1;
      int dif=0;
      int div=1;
      int modulo=1;
      for(int i=0;i<a.length;i++){
        sum=sum+a[i];
        prod=prod*a[i];
        dif=dif-a[i];
        div=a[i]/div;
        
      }
      System.out.println(sum);
      System.out.println(prod);
      System.out.println(dif);
      System.out.println(div);
      
  }
}