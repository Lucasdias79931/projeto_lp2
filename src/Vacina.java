import java.time.LocalDate;

public class Vacina {
    private String nome;
    private LocalDate data_vencimento;
    private double preco;

    public Vacina(String nome, LocalDate data_vencimento, double preco) {
        this.nome = nome;
        this.data_vencimento = data_vencimento;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(LocalDate data_vencimento) {
        this.data_vencimento = data_vencimento;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
