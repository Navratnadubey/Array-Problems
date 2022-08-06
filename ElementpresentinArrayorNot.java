import java.util.*;

public class ElementpresentinArrayorNot {
    public static void main(String[] args) {
      Scanner input=new Scanner(System.in);
      int n=input.nextInt();
      int a[]=new int[n];
      for(int i=0;i<a.length;i++){
        a[i]=input.nextInt();
      }
      int index=-1;
      int terget=input.nextInt();
      boolean flag=false;
      for(int i=0;i<a.length;i++){
        if(a[i]==terget){
          index=i;
          flag=true;
        }
      }
      System.out.println(index);
      System.out.println(flag);
  }
}