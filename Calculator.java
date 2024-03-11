public class Calculator extends extended_calculator{
    int op1, op2;
    
    Calculator(int op1, int op2) {
        this.op1 = op1;
        this.op2 = op2;
    }
    
    int add(int op1, int op2) {
        return (op1 + op2);
    }
    
    int sub(int op1, int op2) {
        return (op1 - op2);
    }
    
    int Multi(int op1, int op2) {
        return (op1 * op2);
    }
    
    int Divide(int op1, int op2) {
        return (op1 / op2);
    }
    
    public static void main(String args[]) {
        Calculator c = new Calculator(4, 2);
        System.out.println("Addition :" + c.add(c.op1, c.op2)); 
        System.out.println("Subtraction :" + c.sub(c.op1, c.op2)); 
        System.out.println("Multiplication:" + c.Multi(c.op1, c.op2)); 
        System.out.println("Division :" + c.Divide(c.op1, c.op2)); 
        System.out.println("Sqaure :" + c.Square(c.op1)); 
        System.out.println("Cube :" + c.Cube(c.op1)); 
    }
}
