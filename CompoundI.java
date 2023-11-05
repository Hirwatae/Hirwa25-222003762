/**
 * Sample3
 */
public class CompoundI{

public 
 double product(double p, double r, double t, double n) {
    return p* (Math.pow((1+r/1200),n*t));
}
}
    class Main{
    public static void main(String[] args){
         CompoundI myCompoundI =new CompoundI();
//double p=500000; double r=18/100; double t=3; double n=12;
double result =myCompoundI.product(500000,18,3,12);

System.out.println("Compound I:"+result);   
    
}
}
