public class Pessoa
{

    protected String nome, cpf, email,telefone;

    public Pessoa(String nome, String cpf, String email, String telefone)
    {
        this.nome = nome;
        this.cpf = cpf;
        this.email = email;
        this.telefone = telefone;
    }

    void setNome(String name){
        this.nome = name;
    }

    void setCpf(String ncpf){
        this.cpf = ncpf;
    }

    void setEmail(String mail){
        this.email = mail;
    }

    void setTelefone(String tel){
        this.telefone = tel;
    }

    String getNome(){
        return this.nome;
    }

    String getCpf(){
        return this.cpf;
    }

    String getEmail(){
        return this.email;
    }

    String getTelefone(){
        return this.telefone;
    }
}