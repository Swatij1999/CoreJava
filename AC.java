class AC{

static String brand ;
static String color;
static double price;
static boolean isConnected;
static int maxVolume=8;
static int currentVolume;
static int minVolume;


public static boolean onOrOff(){
System.out.println("inside onOrOff()");
if (isConnected ==false){
     isConnected=true;
System.out.println("AC is turned onn...");
}
else if (isConnected ==true){
     isConnected=false;
System.out.println("AC is turned off...");
}

System.out.println("end of onOrOff()");
return isConnected;
 }


public static void increaseVolume(){
System.out.println("inside increaseVolume()");


//false==true
if(isConnected==true){
if(currentVolume<maxVolume){
  currentVolume = currentVolume + 1;
System.out.println("The Curent Volume is " + currentVolume);
}
else{

System.out.println("Max Volume reached....");
}
}
else{

System.out.println("Gube....first AC on madu");
}

System.out.println("end of onOrOff()");
 
}


public static void decreaseVolume(){
System.out.println("inside decreaseVolume()");


//false==true
if(isConnected==true){
if(currentVolume>minVolume){
  currentVolume = currentVolume-1;
System.out.println("The Curent Volume is " + currentVolume);
}
else{

System.out.println("Min Volume reached....");
    }
}
else{

System.out.println("Gube....first Ac on madu");
}

System.out.println("end of onOrOff()");
 
}

}