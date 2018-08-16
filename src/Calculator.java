
	public class Calculator
	{
	// we are using '+' to add, '-' to subtract, small 'x' to multiply and '/' to divide.
	   public static void main(String[] args)
	   {
	       try
	       {
	       int num1=Integer.parseInt(args[0]);
	       String op=args[1];
	       int num2=Integer.parseInt(args[2]);
	      
	       if(op.equals("+"))
	           System.out.println("Result : "+(num1+num2));
	       else if(op.equals("x"))
	           System.out.println("Result : "+(num1*num2));
	       else if(op.equals("/"))
	       {
	           if(num2==0)
	           {
	               throw new IllegalArgumentException();
	           }
	           double result=(num1/num2);
	           System.out.println("Result : "+result);
	       }
	       else if(op.equals("-"))
	           System.out.println("Result : "+(num1-num2));
	       }
	       catch(NumberFormatException e)
	       {
	           System.out.println("Invalid Input");
	       }
	       catch(IllegalArgumentException e)
	       {
	           System.out.println("Division by zero is illegal");
	       }
	      
	   }

	}

