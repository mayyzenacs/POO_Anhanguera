abstract class Pessoa {
    protected String nome;
    protected int idade;
    protected String endereco;


    public Pessoa(String nome, int idade, String endereco) {
        this.nome = nome;
    }
    public abstract void CalcularSalario();
}

class Aluno extends Pessoa {
    private int Matricula;
    public Aluno(String nome, int idade, String endereco, int Matricula) {
        super(nome, idade, endereco);
        this.Matricula = Matricula;
    }

    @Override
    public void CalcularSalario() {
        int[] arr = {300,600,1200,4500,600};
        try {
            // System.out.println(nome + " Calculando salario");
            System.out.println(arr[10]);
            throw new ArrayIndexOutOfBoundsException("fora do index");

        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println(nome + " Finalizando salario");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Lucas", 24, "Limoeiro", 4523);
        aluno1.CalcularSalario();
    }
}
