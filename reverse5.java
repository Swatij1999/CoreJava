 class reverse5 {
	public static void main(String[]args) {
		String name="java programming";
		System.out.println(name);
		
		for(int i = 0;i<name.length();i++) {
			System.out.print(" "+name.charAt(i));
		}
		
		for(int i=name.length()-1; i>=0; i--){
			System.out.print(" "+name.charAt(i));
		}
  //counting a given char
			int count=0;
			int count1=0;
			for(int i=0; i<name.length();i++) {
				if(name.charAt(i)=='a') {
					count+=1;
			}else {
				count1+=1;
			}
		}
		System.out.println("count:"+count);
		System.out.println("count1:"+count1);
		
		int count2=0;
		String str="Good Learning";
		for(char ch:str.toCharArray()) {
			if(ch=='0') {
				count2+=1;
			}
			//System.out.print(ch+" ");
		}
		System.out.println("count:"+count2);

	}

}
