import java.util.ArrayList;

public class RegistroAtendimento {
    private ArrayList<Consulta> consultas;
    private ArrayList<Vacina> vacinas;

    public RegistroAtendimento() {
        this.consultas = new ArrayList<>();
        this.vacinas = new ArrayList<>();
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(ArrayList<Consulta> consultas) {
        this.consultas = consultas;
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }

    public void setVacinas(ArrayList<Vacina> vacinas) {
        this.vacinas = vacinas;
    }

    public void adicionarConsulta(Consulta consulta) {
        this.consultas.add(consulta);
    }

    public void adicionarVacina(Vacina vacina) {
        this.vacinas.add(vacina);
    }
}
