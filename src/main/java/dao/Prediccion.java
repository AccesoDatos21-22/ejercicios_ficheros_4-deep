package dao;

import java.util.ArrayList;

public class Prediccion {
    private ArrayList<Tiempo>semana=new ArrayList<>();

    public Prediccion() {
    }

    public Prediccion(ArrayList<Tiempo> semana) {
        this.semana = semana;
    }

    public ArrayList<Tiempo> getSemana() {
        return semana;
    }

    public void setSemana(ArrayList<Tiempo> semana) {
        this.semana = semana;
    }
}
