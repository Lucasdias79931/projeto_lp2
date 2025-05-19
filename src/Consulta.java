import java.time.LocalDate;

public class Consulta extends Atendimento {
    private String problema;
    private String medicamento;
    private Veterinario veterinario;

    public Consulta(LocalDate dataHora, Animal animal, String tipoAtendimento, double preco) {
        super(dataHora, animal, tipoAtendimento, preco);
    }

    public String getProblema() {
        return problema;
    }

    public void setProblema(String problema) {
        this.problema = problema;
    }

    public String getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(String medicamento) {
        this.medicamento = medicamento;
    }

    public Veterinario getVeterinario() {
        return veterinario;
    }

    public void setVeterinario(Veterinario veterinario) {
        this.veterinario = veterinario;
    }
}
