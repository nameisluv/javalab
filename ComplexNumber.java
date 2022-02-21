import java.util.Scanner;

public class ComplexNumber {
    int real, img;

    ComplexNumber(int real, int img) {
        this.real = real;
        this.img = img;
    }

    public static void main(String args[]) {
        Scanner sr = new Scanner(System.in);
        System.out.println("enter real and imiganiry part of the first expression");
        int real = sr.nextInt();
        int img = sr.nextInt();
        ComplexNumber c1 = new ComplexNumber(real, img);
        System.out.println("enter real and imiganiry part of the second expression");
        int real1 = sr.nextInt();
        int img1 = sr.nextInt();
        ComplexNumber c2 = new ComplexNumber(real1, img1);
        ComplexNumber temp = sum(c1, c2);
        System.out.println("sum is : " + temp.real + "+" + temp.img + "i");
        temp = sub(c1, c2);
        System.out.println("difference is : " + temp.real + "+" + temp.img + "i");
        temp = mul(c1, c2);
        System.out.println("product is : " + temp.real + "+" + temp.img + "i");
    }

    public static ComplexNumber sum(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real + c2.real;
        temp.img = c1.img + c2.img;
        return temp;
    }

    public static ComplexNumber sub(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real - c2.real;
        temp.img = c1.img - c2.img;
        return temp;
    }

    public static ComplexNumber mul(ComplexNumber c1, ComplexNumber c2) {
        ComplexNumber temp = new ComplexNumber(0, 0);
        temp.real = c1.real * c2.real - (c1.img * c2.img);
        temp.img = c1.img * c2.real + (c1.real * c2.img);
        return temp;
    }
}
