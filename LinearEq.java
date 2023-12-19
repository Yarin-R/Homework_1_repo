package HW01;
// class declaration
public class LinearEq {
    // main(string[]) - the entry point of a Java program.
    // args - args contains the supplied command-line
    // arguments as an array of String objects.
    public static void main(String[] args){
        // a,b,c - the first, the second and the third user-inputs' values.
        // each converted from string to double.
        double a = Double.parseDouble(args[0]);
        double b = Double.parseDouble(args[1]);
        double c = Double.parseDouble(args[2]);
        // reversing the linear equasion of the form a*x+b=c to
        // calculate the value of x.
        double x = (c - b) / a;
        // printing the results exactly as the PDF states.
        System.out.println(a + " * x + " + b + " = " + c);
        System.out.println("X = " + x);
    }
}
