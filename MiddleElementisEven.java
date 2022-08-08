import java.util.*;

public class MiddleElementisEven {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      if(a[a.length/2]%2==0 || a[a.length/2]>a.length){
        System.out.println("Found");
      }else{
        System.out.println("Not found");
      }
  }
}