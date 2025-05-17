import java.time.LocalDate;

public class Vacina {
    private String nome;
    private LocalDate data_vencimento;
    private double preco;

    public Vacina(String nome, LocalDate data_vencimento, double preco){
        this.data_vencimento = data_vencimento;
        this.nome = nome;
        this.preco = preco;
    }
}
