package exercise9;

public class Ellipse {
  Point Anfangspoint;
  double a;
  double b;

  public Ellipse(){
   Anfangspoint = new Point(0, 0);
   a = 1;
   b = 1;
  }
  public Ellipse(Point Anfangspoint, double a, double b) {
        this.Anfangspoint = new Point(Anfangspoint);
        this.a = a;
        this.b = b;
    }

  public Ellipse(Ellipse otherEllipse){
      Anfangspoint = new Point(otherEllipse.Anfangspoint);
      a = otherEllipse.a;
      b = otherEllipse.b;
    }
    
  public boolean isValid(){
     return a > 0 && b > 0;
      }

  public void initialize(){
    do{
      System.out.println("Start point: ");
      Anfangspoint.initialize();
      System.out.println("Enter height: ");
      a = Utils.INPUT.nextDouble();
      System.out.println("Enter width : ");
      b = Utils.INPUT.nextDouble();
    }while(!isValid());
  }

  public double calculatePerimeter(){
    double sum = Math.PI*Math.abs(3*(a + b) - Math.sqrt((3*a + b)*(a + 3*b)));
    return sum;
  }  

  public double calculateArea(){
    double sum = Math.PI*a*b;
    return sum;
  }

  public String getType() {
    if(a == b){
      return "Circle";
    }else{
      return "Ellipse";
    }

  }

  public String toString(){

    return String.format("%s-[%s,%s], %s, P=%s, A=%s", Anfangspoint, a, b, getType(), calculatePerimeter(), calculateArea() );

  }

  public boolean equals(Ellipse otherEllipse){
    boolean sameHeight = Utils.equals(a, otherEllipse.a);
    boolean sameWidth = Utils.equals(b, otherEllipse.b);
    boolean reversedHeight = Utils.equals(a, otherEllipse.b);
    boolean reversedWidth = Utils.equals(b, otherEllipse.a);
    return (sameHeight&&sameWidth) || (reversedHeight&&reversedWidth);
  } 
  
}
