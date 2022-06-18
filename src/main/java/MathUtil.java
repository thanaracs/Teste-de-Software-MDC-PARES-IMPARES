public class MathUtil {
    public static double mdc(double a, double b){
        //P1 E P2
        if (b > 0 && a % b == 0)
            return b; //alt + enter para refatorar

        //P3
        if( b == 0)
            return Math.abs(a); //abs == valor absoluno
             //return a * -1;



        return -1;
    }
}
