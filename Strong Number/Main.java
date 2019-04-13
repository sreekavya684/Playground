import java.util.Scanner;
class Main{
	public static void main (String[] args){
      int i, originalNum, lastDigit, sum;
    int fact;
	  Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      


    /* Copy the value of num to a temporary variable */
    originalNum = num;

    sum = 0;

    /* Find sum of factorial of digits */
    while(num > 0)
    {

        /* Get last digit of num */
        lastDigit = num % 10;

        /* Find factorial of last digit */
        fact = 1;
        for(i=1; i<=lastDigit; i++)
        {
            fact = fact * i;
        }

        /* Add factorial to sum */
        sum = sum + fact;

        num = num / 10;
    }

    /* Check Strong number condition */
    if(sum == originalNum)
    {
        System.out.println("Yes");
    }
    else
    {
        System.out.println("No");
    }
    }
}