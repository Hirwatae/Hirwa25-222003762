
    
//Define a classs with a method to add two numbers
class Adder {
    public int add(int num1,int num2){
return num1+num2;
    }

    
}
public class Grp2objct {
    public static void main(String[] args) {
        //Create an instance of the Adder class
        Adder myAdder=new Adder();
        //Use the add method to add two numbers
        int result=myAdder.add(5,3);
        System.out.println("Result:"+result);//output:
    
    }

}
  

