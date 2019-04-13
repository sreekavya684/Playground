import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
          int n=in.nextInt();
          int lastdigit=n%10;
          int firstdigit=n;
      while(n>=10){
        n=n/10;
      }
      firstdigit=n;
      int sum=firstdigit+lastdigit;
      System.out.println(sum);
	}
}