package lab15.sict.must.edu.mn;

public class Division {
    public double divide(double a, double b) {
        if (Double.compare(b, 0.0) == 0) {
            throw new IllegalArgumentException("Cannot divide by zero (b = " + b + ")");
        }
        return a / b;
    }
}
