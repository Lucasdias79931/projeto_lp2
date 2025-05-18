import java.util.ArrayList;

public class RegistroAtendimento {
    private ArrayList<Consulta> consultas = new ArrayList<>();
    private ArrayList<Vacina> vacinas = new ArrayList<>();

    public void adicionarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void adicionarVacina(Vacina vacina) {
        vacinas.add(vacina);
    }

    public ArrayList<Consulta> getConsultas() {
        return consultas;
    }

    public ArrayList<Vacina> getVacinas() {
        return vacinas;
    }
}

