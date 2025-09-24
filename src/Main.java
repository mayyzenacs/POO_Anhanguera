abstract class operacaoMatematica {
    public abstract double calcular(double a, double b) throws Exception;
}

class Soma extends operacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        return a + b;
    }

}
class Divisao extends operacaoMatematica {
    @Override
    public double calcular(double a, double b) {
        if (b == 0) {

        }
    }
}
class DivisaoPorZeroException extends Exception {
    public divisaoPorZeroExcepetion() {
        super("Não é possivel dividir por 0")
    }
}