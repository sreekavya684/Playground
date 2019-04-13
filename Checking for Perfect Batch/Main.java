import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++){
    arr[i]=in.nextInt();
    }
    perfect_batch(arr,n);
  }
  public static void perfect_batch(int arr[],int n)
  {
    boolean is_perfect_batch=true;
   int sum=arr[0]+arr[1]+arr[2];
    for(int i=3;i<=n-1;i=i+3){
      int curr_sum=arr[i]+arr[i+1]+arr[i+2];
      if(curr_sum!=sum){
        is_perfect_batch=false;
      }
    }
    if( is_perfect_batch==true){
    System.out.println("Perfect Batch");
    }
      else{
    System.out.println("Not a Perfect Batch");
      }
  }
}