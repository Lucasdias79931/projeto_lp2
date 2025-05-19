import java.util.ArrayList;



public class Tutor extends Pessoa
{

    private String endereco;
    private ArrayList<Animal> animais;


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