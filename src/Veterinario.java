
public class Veterinario extends Pessoa
{
    private String especialidade, numeroCfmv;

    public Veterinario(String nome, String cpf, String email, String telefone,String especialidade, String numeroCfmv)
    {
        super(nome, cpf, email, telefone);
        this.especialidade = especialidade;
        this.numeroCfmv = numeroCfmv;
    }

    void setEspecialidade(String espc){
        this.especialidade = espc;
    }

    void setNumeroCfmv(String cfmv){
        this.numeroCfmv = cfmv;
    }

    String getEspecialidade(){
        return this.especialidade;
    }

    String getNumeroCfmv(){
        return this.numeroCfmv;
    }
}