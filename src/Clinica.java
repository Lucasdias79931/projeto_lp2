import java.util.ArrayList;

public class Clinica {
    private ArrayList<Veterinario> veterinarios = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Tutor> tutores = new ArrayList<>();
    private ArrayList<Agenda> agendamentos = new ArrayList<>();
    private RegistroAtendimento registroAtendimento = new RegistroAtendimento();

    public void adicionarVeterinario(Veterinario vet) { veterinarios.add(vet); }
    public void adicionarFuncionario(Funcionario func) { funcionarios.add(func); }
    public void adicionarTutor(Tutor tut) { tutores.add(tut); }
    public void agendar(Agenda agn) { agendamentos.add(agn); }

    public ArrayList<Veterinario> getVeterinarios() { return veterinarios; }
    public ArrayList<Funcionario> getFuncionarios() { return funcionarios; }
    public ArrayList<Tutor> getTutores() { return tutores; }
    public ArrayList<Agenda> getAgendamentos() { return agendamentos; }

    public RegistroAtendimento getRegistroAtendimento() { return registroAtendimento; }
}

