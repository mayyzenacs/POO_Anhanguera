abstract class OperacaoMatematica {
    public abstract double calcular(double a, double b) throws Exception;
}

class Soma extends OperacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

}
class Divisao extends OperacaoMatematica {
    @Override
    public double calcular(double a, double b) throws DivisaoPorZeroException {
        if (b == 0) {
            throw new DivisaoPorZeroException();
        }
        return a / b;
    }
}
class DivisaoPorZeroException extends Exception {
    public DivisaoPorZeroException() {
        super("Não é possível dividir por zero.");
    }
}

public class Main {
    public static void main(String[] args) {
        OperacaoMatematica soma = new Soma();
        OperacaoMatematica divisao = new Divisao();
        try {
            System.out.println("Soma resultado: " + soma.calcular(15,20));
            System.out.println("Divisão resultado: " + divisao.calcular(15,0));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}