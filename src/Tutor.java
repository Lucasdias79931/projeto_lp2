import java.util.ArrayList;

//O tutor deve ter um cadastro com nome,
//cpf, email, telefone de contato e endereço. 
//Desta forma, um tutor pode ter vários animais sob
//sua responsabilidade

public class Tutor extends Pessoa
{
    private String endereco;
    private ArrayList<Animal> animais;

    public Tutor(String nome, String cpf, String email, String telefone, String endereco){
        super(nome, cpf, email, telefone);
        this.endereco = endereco;
        animais = new ArrayList<Animal>();
    }

    String getEndereco(){
        return this.endereco;
    }

    void setEndereco(String end){
        this.endereco = end;
    }
}