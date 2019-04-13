import java.util.Scanner;
class Main
{
 
    	public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
      arr[i]=in.nextInt();
    }
          int count = 1, max = 1;

for (int i = 1; i < arr.length; i++) {
    if (arr[i] >= arr[i-1]) {
        count++;
    } else {
        count = 0;
    }

    if (count > max) {
        max = count;
    }
}

System.out.println(max);
    }
}