package Bridge;

/** "ConcreteImplementor"  1/2 */
class DrawingAPI1 implements DrawingAPI {
   public void drawCircle(double x, double y, double radius) {
        System.out.printf("API1.circle at %f:%f radius %f\n", x, y, radius);
   }
   public void printHello(){
	   System.out.println("Hello World 1");
   }
}
 
/** "ConcreteImplementor" 2/2 */
class DrawingAPI2 implements DrawingAPI {
   public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
   }
   public void printHello(){
	   System.out.println("Hello World 2");
   }
}
