package Atividade2;
import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite dois números: ");
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            if (a < 0 || b < 0) {
                throw new NumeroNegativoException();
            } else if (a == 0 || b == 0) {
                throw new ArithmeticException("Não existe divisão por ZERO");
            } else {
                double divisao = (double) a / b;
                System.out.println("Resultado: " + divisao);
            }
        } catch (NumeroNegativoException e) {
            System.out.println(e.getMessage());
        } catch (InputMismatchException er) {
            System.out.println("digite uma entrada válida");
        } catch (ArithmeticException err) {
            System.out.println(err.getMessage());
        } finally {
            input.close();
            System.out.println("Programa finalizado");
        }
    }
}
class NumeroNegativoException extends RuntimeException{
    public NumeroNegativoException(){
        super("Não é possível realizar divisão com números NEGATIVOS");
    }
}
