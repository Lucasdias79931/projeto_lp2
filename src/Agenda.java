public class Agenda extends Atendimento{
    private String status;
    private String especialidade;
}

public Agenda(LocalDate dataHora, Animal animal, String tipo_atendimento, double preco, String status, String especialidade){
    super(dataHora, animal, tipo_atendimento, preco);
    this.status = status;
    this.especialidade = especialidade;
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
