import java.util.ArrayList;

//O tutor deve ter um cadastro com nome,
//cpf, email, telefone de contato e endereço. 
//Desta forma, um tutor pode ter vários animais sob
//sua responsabilidade

public class Tutor extends Pessoa
{
    /*Atributos*/
    private String endereco;
    private ArrayList<Animal> animais;

    /*Construtor*/
    public Tutor(String nome, String cpf, String email, String telefone, String endereco){
        super(nome, cpf, email, telefone);
        this.endereco = endereco;
        animais = new ArrayList<Animal>();
    }

    public String getEndereco(){
        return this.endereco;
    }

    public void setEndereco(String end){
        this.endereco = end;
    }

    public void adicionarAnimal(Animal animal) {
        animais.add(animal);
    }

    public ArrayList<Animal> getAnimais() {
        return animais;
    }

}