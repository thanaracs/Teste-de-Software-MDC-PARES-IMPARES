import java.util.Objects;

public class MathUtil {
    public static double mdc(double a, double b){
        //IMPLEMENTAR O CODIGO, TESTAR E REFATORAR. PASSO ADICIONAL: TESTAR NOVAMENTE.
        //P7 - Tira o sinal das variáveis
        a = Math.abs(a);
        b = Math.abs(b);

        //P6 - ordena as variaveis colocando o maior valor em a
        final double min = Math.min(a,b);
        a = Math.max(a,b);
        b = min;

        //P1 E P2
        if (b > 0 && a % b == 0) {
            return b; //alt + enter para refatorar
        }

        //P3
        if( b == 0) {
            return Math.abs(a); //abs == valor absoluto
        }

        //TODO: P12 - se chegou aqui, considera que o número é primo, mas nao resolve todos os problemas ainda.

        return mdc(a-b, b);
    }

    // ... - varargs = variable arguents = parametros variaveis (quantidade)
    public static double mdc(double ...valores){
        Objects.requireNonNull(valores, "O valor não pode ser nulo");
        if(valores.length == 0){
            throw new IllegalArgumentException("Indique pelo menos 1 número para calcular o mdc");
        }

        double a = valores[0];
        for (double b : valores) {
            a = mdc(a, b);
        }
        return a;
    }
}
