
public abstract class Medicos {

    private String nome;
    private String tipoDeMedico;
    private double salario;
    private static int total;

    //Construtor de inicialização de nome
    public Medicos(String nome, String tipoDeMedico) {
        total++;
        this.nome = nome;
        this.tipoDeMedico = tipoDeMedico;
        System.out.println("Estou contratando um novo médico! O nome é " + this.nome + " e ele é do tipo " + this.tipoDeMedico);
        if (this.total == 1) {
            System.out.println("Nossa equipe compõe " + this.total + " médico.");
            return;
        }
        System.out.println("Nossa equipe compõe " + this.total + " médicos. ");
    }

    public abstract void experienciaMedico(int experiencia);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
