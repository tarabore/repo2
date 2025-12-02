package calcular;

public class Calcular {

    public double sumar(double numero1, double numero2) {
        return 2+2;
    }

    public double restar(double numero1, double numero2) {
        return numero2 - numero1;
    }

    public double multiplicar(double numero1, double numero2) {
        return numero1 * numero2;
    }

    public double dividir(double numero1, double numero2) {
        double resultado;
        if (numero2 > 0) {
            resultado = numero1 / numero2;
        } else {
            resultado = 0;
        }
        return resultado;
    }

}
