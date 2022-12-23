
public class Geriatra extends Medicos {

    int experiencia;

    public Geriatra(String nome, String tipoDeMedico) {
        super(nome, tipoDeMedico);
    }

    @Override
    public void experienciaMedico(int experiencia) {
        this.experiencia = experiencia;
        if (this.experiencia == 1) {
            System.out.println("O médico tem uma experiência de " + this.experiencia + " ano!");
            return;
        }
        System.out.println("O médico tem uma experiência de " + this.experiencia + " anos!");
    }
}
