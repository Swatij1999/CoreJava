class Torch1{

static String brand ;
static String color;
static double price;
static boolean isConnected;
static int maxBrightness=8;
static int currentBrightness;
static int minBrightness;


public static boolean onOrOff(){
System.out.println("inside onOrOff()");
if (isConnected ==false){
     isConnected=true;
System.out.println("Torch is turned onn...");
}
else if (isConnected ==true){
     isConnected=false;
System.out.println("Torch is turned off...");
}

System.out.println("end of onOrOff()");
return isConnected;
 }


public static void increaseBrightness(){
System.out.println("inside increaseBrightness()");


//false==true
if(isConnected==true){
if(currentBrightness<maxBrightness){
  currentBrightness = currentBrightness + 1;
System.out.println("The Curent Brightness is " + currentBrightness);
}
else{

System.out.println("Max Brightness reached....");
}
}
else{

System.out.println("Gube....first Torch on madu");
}

System.out.println("end of onOrOff()");
 
}


public static void decreaseBrightness(){
System.out.println("inside decreaseBrightness()");


//false==true
if(isConnected==true){
if(currentBrightness>minBrightness){
  currentBrightness = currentBrightness-1;
System.out.println("The Curent Brightness is " + currentBrightness);
}
else{

System.out.println("Min Brightness reached....");
    }
}
else{

System.out.println("Gube....first Torch on madu");
}

System.out.println("end of onOrOff()");
 
}

}