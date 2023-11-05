public class Simple {

    public double methodsimpleinterest(double p, double r, double t){

return(p*r/100*t);
}
public static void main (String[]arg){

    Simple objct= new Simple();
    double p = 100000; double r =5; double t =5;
    double result=objct.methodsimpleinterest(p, r, t);
    // Program printing the value of Simple interest
    System.out.println("simple Interestis:"+result);

}
    }
    

