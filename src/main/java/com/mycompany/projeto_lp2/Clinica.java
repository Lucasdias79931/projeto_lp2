package com.mycompany.projeto_lp2;

import java.util.ArrayList;

public class Clinica {
    private ArrayList<Veterinario> veterinarios;
    private ArrayList<Funcionario> funcionarios;
    private ArrayList<Tutor> tutores;
    private ArrayList<Agenda> agendamentos;
    private ArrayList<Consulta> consultas;
    private ArrayList<Vacina> vacinas;
    
    public Clinica() {
        this.veterinarios = new ArrayList<>();
        this.funcionarios = new ArrayList<>();
        this.tutores = new ArrayList<>();
        this.agendamentos = new ArrayList<>();
    }

    public Clinica(ArrayList<Veterinario> veterinarios, ArrayList<Funcionario> funcionarios,
                   ArrayList<Tutor> tutores, ArrayList<Agenda> agendamentos
                   ) {
        this.veterinarios = veterinarios;
        this.funcionarios = funcionarios;
        this.tutores = tutores;
        this.agendamentos = agendamentos;
    }


    public ArrayList<Veterinario> getVeterinarios() {
        return veterinarios;
    }

    public void setVeterinarios(ArrayList<Veterinario> veterinarios) {
        this.veterinarios = veterinarios;
    }

    public ArrayList<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    public void setFuncionarios(ArrayList<Funcionario> funcionarios) {
        this.funcionarios = funcionarios;
    }

    public ArrayList<Tutor> getTutores() {
        return tutores;
    }

    public void setTutores(ArrayList<Tutor> tutores) {
        this.tutores = tutores;
    }

    public ArrayList<Agenda> getAgendamentos() {
        return agendamentos;
    }

    public void setAgendamentos(ArrayList<Agenda> agendamentos) {
        this.agendamentos = agendamentos;
    }

  
}
