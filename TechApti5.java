class TechApti5{
  public static void main(String args[]){
   for(int row=1;row<=5;row++){
    for(int col=1;col<=5;col++){
     if(row==0||row==0||col==0||col==0||row==2&&col==4||row==2 && col==2||row==2 && col==6||row==3 && col==3||row==3&&col==5 ||row==4 && col==4||row==5 && col==3||row==5&&col==3||row==5&&col==5||row==6&&col==2||row==6&&col==1){
     
      System.out.print("@");
	  }
	  else{
		System.out.print(" ");  
	 }
	}
	System.out.println();
 }
}
}


