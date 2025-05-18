import java.time.LocalDate;
import java.util.ArrayList;

public class RegistroVacina {
    private ArrayList<Vacina> vacinas = new ArrayList<>();
    private LocalDate dataAplicacao;
    private LocalDate validade;

    public RegistroVacina(LocalDate dataAplicacao, LocalDate validade) {
        this.dataAplicacao = dataAplicacao;
        this.validade = validade;
        this.vacinas = new ArrayList<>();
    }

    public void adicionarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }

    public LocalDate getDataAplicacao() {
        return dataAplicacao;
    }

    public LocalDate getValidade() {
        return validade;
    }
}

