import java.util.Scanner;
class Main{ 
  public static void main(String args[]) 
  { 
    Scanner in=new Scanner(System.in);
    int r=in.nextInt();
    int c=in.nextInt();
    int matrix1[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix1[i][j]=in.nextInt();
      }
      }
    int matrix2[][]=new int[r][c];
    for(int i=0;i<r;i++)
    {
      for(int j=0;j<c;j++)
      {
        matrix2[i][j]=in.nextInt();
      }
    }
    int sub[][] = new int[r][c];
    for(int i = 0; i <= sub.length - 1; i++){
      for(int j = 0; j <= sub[i].length - 1; j++)
      {
        sub[i][j] = matrix1[i][j] - matrix2[i][j];
      }
    }
    for(int i = 0; i <= matrix1.length - 1; i++){
      for(int j = 0; j <= matrix2[i].length - 1; j++)
      {
        System.out.print(sub[i][j] + " ");
      }
      System.out.println();
  }
  }
}