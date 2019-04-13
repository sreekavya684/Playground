import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String res="";
      String temp[]=str.split(" ");
      int a=temp.length-1;
      for(int i=a;i>=0;i--)
      {
        res=res+temp[i]+" ";
      }
      System.out.println(res);
    }
}