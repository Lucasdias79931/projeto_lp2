//ideia
public enum turnoTrabalho {
    MANHA, TARDE, NOITE
}
public class Funcionario extends Pessoa
{
    private turnoTrabalho turnoTrabalho;

    public Funcionario(String nome, String cpf, String email, String telefone)
    {
        super(nome, cpf, email, telefone);
        this.turnoTrabalho = turno;
    }

    public turnoTrabalho getTurnoTrabalho() {
        return turnoTrabalho;
    }

    public void setTurnoTrabalho(turnoTrabalho turnoTrabalho) {
        this.turnoTrabalho = turnoTrabalho;
    }

}