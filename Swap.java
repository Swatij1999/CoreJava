class Swap
{
  public static void main(String args[])
  {
     System.out.println("enter value of x and y");
	 int x=10;
	 int y=20;
	 System.out.println("before swapping number:"+x +" "+y);
	 //swapping
	 x=x+y;
	 y=x-y;
	 x=x-y;
	 	 System.out.println("After swapping number:"+x +" "+y);

   }



}