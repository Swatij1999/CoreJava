  class primeNumber
  {
    public static void main(String[]args)
	{
     int um,i,count=0;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter a number :");
     Num=s.nextInt();


      for(i=2;i<Num;i++)
      {
       if(Num%i==0)
       {
        count++;
        break;
       }
      }
      if(count==0)
      System.out.println(" It is prime number.");
      else
      System.out.println(" It is  not prime number.");
     }
   }

