
public class ExecutaComandos {

    public static void main(String[] args) {
        Dentista dentista = new Dentista("Marcus", "Dentista");
        dentista.experienciaMedico(1);
        dentista.setSalario(2000.0);
        System.out.println("O salário do médico " + dentista.getNome() + " é de R$ " + dentista.getSalario());
        System.out.println("------------------");
        Dermatologista dermatologista = new Dermatologista("Jonatas", "Dermatologista");
        dermatologista.experienciaMedico(8);
        dermatologista.setSalario(5000);
        System.out.println("O salário do médico " + dermatologista.getNome() + " é de R$ " + dermatologista.getSalario());
        System.out.println("------------------");
        Geriatra geriatria = new Geriatra("Vinicius", "Geriatria");
        geriatria.experienciaMedico(1);
        geriatria.setSalario(2500);
        System.out.println("O salário do médico " + geriatria.getNome() + " é de R$ " + geriatria.getSalario());
        System.out.println("------------------");
    }
}
