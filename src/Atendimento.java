import java.time.LocalDate;

public class Atendimento {
    protected LocalDate dataHora;
    protected Animal animal;
    protected String tipoAtendimento;
    protected double preco;

    public Atendimento(LocalDate dataHora, Animal animal, String tipoAtendimento, double preco) {
        this.dataHora = dataHora;
        this.animal = animal;
        this.tipoAtendimento = tipoAtendimento;
        this.preco = preco;
    }

    public LocalDate getDataHora() { return dataHora; }
    public Animal getAnimal() { return animal; }
    public String getTipoAtendimento() { return tipoAtendimento; }
    public double getPreco() { return preco; }

    public void setDataHora(LocalDate dataHora) { this.dataHora = dataHora; }
    public void setAnimal(Animal animal) { this.animal = animal; }
    public void setTipoAtendimento(String tipoAtendimento) { this.tipoAtendimento = tipoAtendimento; }
    public void setPreco(double preco) { this.preco = preco; }
}

