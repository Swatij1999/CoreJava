class LargestNum{
 public static void main(String[] args){
   int a[]={14,45,65,70,80};
   int max=a[0];
    for(int i = 0; i<a.length;i++){
    if(a[i]>max){
     max=a[i];
      
     }
	 System.out.println(max);
    }
   }
 }