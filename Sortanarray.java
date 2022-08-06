import java.util.*;

public class Sortanarray {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      boolean flag=true;
      for(int i=0;i<a.length;i++){
        for(int j=0;j<a.length-1;j++){
          if(!(a[j]<a[j+1])){
            flag=false;
            break;
          }
        }
      }
      if(!flag){
        System.out.println("Array is not Sorted");
      }else{
        System.out.println("Array is sorted");
      }
  }
}