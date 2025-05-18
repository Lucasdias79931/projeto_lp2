import java.time.LocalDate;

public class Animal
{
    /*Atributos*/
    //Todo animal atendido na clínica deve
    //ser cadastrado como nome, raça, data de nascimento e tutor
    private String nome, raca;
    private LocalDate dataNascimento; //coloquei em string
    private Tutor tutor;

    /*Construtor*/
    public Animal(String nome, String raca, LocalDate dataNascimento, Tutor tutor)
    {
        this.nome = nome;
        this.raca = raca;
        this.tutor = tutor;
        this.dataNascimento =  dataNascimento;

    }

    public Tutor getTutor(){
        return this.tutor;
    }

    public void setTutor(Tutor dono){
        this.tutor = dono;
    }

    public String getNome(){
        return this.nome;
    }

    void setNome(String name){
        this.nome = name;
    }

    public String getRaca(){
        return this.raca;
    }

    void setRaca(String animal){
        this.raca = animal;
    }

    public LocalDate getDataNascimento(){
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate data){
        this.dataNascimento = data;
    }
}