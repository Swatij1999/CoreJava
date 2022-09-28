class WashingMachine{

static String brand ;
static String color;
static double price;
static boolean isConnected;

public static boolean onOrOff(){
System.out.println("inside onOrOff()");
if (isConnected ==false){
     isConnected=true;
System.out.println("WashingMachine is turned onn...");
}
if (isConnected ==true){
     isConnected=false;
System.out.println("WashingMachine is turned off...");
}

System.out.println("end of onOrOff()");
return isConnected;
 }
}

