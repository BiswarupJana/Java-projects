import static java.lang.Math.*;
public class Root{
    public static void main(String[] args) {
        int a =1, b=-7, c =12;
        if(a == 0)
        {
            System.out.println("Invalid");
            return;
        }
        int d = b*b -4*a*c;
        double sq_val= sqrt(abs(d)); 
        System.out.println("Roots are real and different \n"); 
        System.out.println((double)(-b +sq_val)/(2*a) +"\n");
        System.out.println((double)(-b -sq_val)/(2*a));
    }
}