class Fibonacci{
 public static void main(String[] args){
  int num=5;
  int secNum=1;
  int firNum=0;
  int nxtNum=0;
  for(int i= 0; i<num;i++){
    nxtNum=firNum+secNum;
	firNum=secNum;
	secNum=nxtNum;
	}
	System.out.println(nxtNum);
	}
}