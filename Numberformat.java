import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner; 
import java.util.regex.*;
public class Numberformat
{
   public static void currencyFormat(Double d)
   {
      Double currencyAmount = d ;//new Double(d)
      Locale[] currentLocale = {Locale.US,Locale.getDefault(),Locale.FRANCE,Locale.CHINA/*Locale.INDIA*/};
      for(int i=0;i<currentLocale.length;i++)
      {
      NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance(currentLocale[i]);
      System.out.println(currentLocale[i].getDisplayName()+":"+currencyFormatter.format(currencyAmount));
      }
   }
   public static void main(String... s)
   {
	   Scanner ob=new Scanner(System.in);
	   try{
	   double d=ob.nextDouble();
	   Pattern pattern = Pattern.compile(".*\\D.*");
	   if(pattern.matcher(String.valueOf(d)).matches())
	  		 currencyFormat(new Double(d));
	   else
		   System.out.println("Enter a valid number");
	   }
	   catch(java.util.InputMismatchException e)
	   {
		   System.out.println("Enter a valid input...number is expected");
	   }
   }

}


