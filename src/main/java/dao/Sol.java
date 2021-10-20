package dao;

import java.util.Date;

public class Sol {
    private Date inicio;
    private Date fin;

    public Sol(Date inicio, Date fin) {
        this.inicio = inicio;
        this.fin = fin;
    }

    public Sol() {
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }
}
