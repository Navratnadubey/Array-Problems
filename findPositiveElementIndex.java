import java.util.*;

public class findPositiveElementIndex {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int index=-1;
      for(int i=0;i<a.length;i++){
        if(a[i]>0){
          index=i;
          break;
        }
      }
      System.out.println(index);
  }
}