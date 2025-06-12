package Lab9;

public class Calculator {
    int add(int a, int b) {
        return a + b;
    }
    double add(double a,double b){
        return a + b;
    }
    int add(int a,int b,int c){
        return a + b + c;
    }
}
class Te{
    public static void main (String[]args){
        Calculator calc = new Calculator();
        System.out.println(calc.add(1,2));
        System.out.println(calc.add(1.5,2.7));
        System.out.println(calc.add(1,2,3));
    }
}

