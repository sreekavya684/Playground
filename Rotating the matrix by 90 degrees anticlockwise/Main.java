import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
   Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int arr[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        arr[i][j]=in.nextInt();
      }
    }
    int transpose[][]=new int[c][r];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        transpose[j][i]=arr[i][j];
      }
    }
    for(int i=0;i<c;i++)
    {
      for(int j=0;j<r;j++)
      {
        //System.out.print(transpose[i][j]+ " ");
     }
       //System.out.println();
    }
    for(int i=r-1;i>=0;i--)
    {
      for(int j=0;j<c;j++)
      {
        System.out.print(transpose[i][j]+ " ");
     }
       System.out.println();
   
  
    }
        
    
  }
}