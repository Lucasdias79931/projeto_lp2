import java.time.LocalDate;

public class Agenda extends Atendimento {
    private String status;
    private String especialidade;
    public Agenda(LocalDate dataHora, Animal animal, String tipoAtendimento, double preco) {
        super(dataHora, animal, tipoAtendimento, preco);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
