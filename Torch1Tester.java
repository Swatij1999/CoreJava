class Torch1Tester{

public static void main(String Tor[]){

Torch1.brand="LED" ;
Torch1.color="WIGHT";
Torch1.price=20000;


System.out.println("main method started");
Torch1.onOrOff();
Torch1.increaseBrightness();
Torch1.increaseBrightness();
Torch1.decreaseBrightness();



System.out.println(Torch1.brand);
System.out.println(Torch1.color);
System.out.println(Torch1.price);

System.out.println("main method ended");
 }
}