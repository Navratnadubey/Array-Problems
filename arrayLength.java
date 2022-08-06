import java.util.*;

public class arrayLength {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
    int n=input.nextInt();
    int a[]=new int[n];
    for(int i=0;i<a.length;i++){
      a[i]=input.nextInt();
    }
    System.out.println(a.length);
    boolean flag=true;
    if(a.length%2!=0){
      flag=false;
    }
    System.out.println(flag);
  }
}