import java.util.Scanner;

class Complex {
    int real;
    int imag;

    Complex(int real, int imag) {
        this.real = real;
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();
        
        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        Complex c1 = new Complex(r1, i1);
        Complex c2 = new Complex(r2, i2);

        Complex result = c1.add(c2);

        System.out.println(result.real + " + " + result.imag + "i");

        sc.close();
    }
}