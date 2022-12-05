class TechApti3{
  public static void main(String args[]){
   for(int row=1;row<=5;row++){
    for(int col=1;col<=5;col++){
     if(row==1||row==0||col==1||col==0||row==2 && col==2||row==3 && col==3||row==4 && col==4||row==5 && col==5){
     
      System.out.print("#");
	  }
	  else{
		System.out.print(" ");  
	 }
	}
	System.out.println();
 }
}
}
