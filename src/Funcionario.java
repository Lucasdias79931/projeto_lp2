public class Funcionario extends Pessoa
{
    private TurnoTrabalho turnoTrabalho;
    private String funcao;

    public Funcionario(String funcao, String nome, String cpf, String email, String telefone, TurnoTrabalho turno){
        super(nome, cpf, email, telefone);
        this.turnoTrabalho = turno;
        this.funcao = funcao;
    }

    public TurnoTrabalho getTurnoTrabalho(){
        return turnoTrabalho;
    }

    public void setFuncao(String funcao){
        this.funcao = funcao;
    }

    public String getFuncao(){
        return funcao;
    }
}
