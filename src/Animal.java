public class Animal
{
    //Todo animal atendido na clínica deve
    //ser cadastrado como nome, raça, data de nascimento e tutor
    private String nome, raca;
    private String dataNascimento; //coloquei em string
    private Tutor tutor;

    public Animal(String nome, String raca, String dataNascimento, Tutor tutor)
    {
        this.nome = nome;
        this.raca = raca;
        this.tutor = tutor;
        this.dataNascimento =  dataNascimento;

    }

    Tutor getTutor(){
        return this.tutor;
    }

    void setTutor(Tutor dono){
        this.tutor = dono;
    }

    String getNome(){
        return this.nome;
    }

    String getRaca(){
        return this.raca;
    }

    String getDataNascimento(){
        return this.dataNascimento;
    }


    void setNome(String name){
        this.nome = name;
    }

    void setRaca(String animal){
        this.raca = animal;
    }

    void setDataNascimento(String data){
        this.dataNascimento = data;
    }
}