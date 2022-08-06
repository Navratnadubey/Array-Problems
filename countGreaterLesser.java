import java.util.*;

public class countGreaterLesser {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int count=0;
      int count1=0;
      int target=input.nextInt();
      for(int i=0;i<a.length;i++){
        if(a[i]>target){
           count++;
        }
        if(a[i]<target){
          count1++;
        }
      }
      System.out.println(count);
      System.out.println(count1++);
  }
}