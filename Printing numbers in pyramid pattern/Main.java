import java.util.Scanner;
class Main{
	public static void main (String[] args){
    	 Scanner in=new Scanner(System.in);
       int n=in.nextInt();
      int num=0;
      for(int i=1;i<=n;i++)
      {
        for(int space=1;space<=n-i;space++)
        {
          System.out.print(" ");
        }
        for(int j=1;j<=i;j++)
        {
          num=num+1;
           System.out.print(num);
           System.out.print(" ");
        }
         System.out.print("\n");
    }  
    }
}