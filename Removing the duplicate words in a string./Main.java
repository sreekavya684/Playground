import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    String str=in.nextLine();
    String[] words=str.split(" ");
    for(int i=0;i<words.length;i++)
    {
 
  
      for(int j=0;j<words.length;j++)
      {
        if(words[i].equals(words[j]))
        {
          if(i!=j)
           words[i]="";
      }
    }
   }
      for(int i=0;i<words.length;i++)
      {
        if(words[i]!="")
        {
    System.out.print(words[i]+ " ");
    }

    }
    }
}