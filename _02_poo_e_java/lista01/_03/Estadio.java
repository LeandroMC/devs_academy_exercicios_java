package _02_poo_e_java.lista01._03;

import java.util.ArrayList;
import java.util.List;

public class Estadio {

    private List<Prova> provas;

    public List<Prova> realizarProvas(Atleta atleta) {
        List<Prova> provas = new ArrayList<>();

        for (Prova prova : this.provas) {
            if (prova.podeRealizar(atleta))
                provas.add(prova);
        }
        return provas;
    }

    public List<Prova> getProvas() {
        return provas;
    }

    public void setProvas(List provas) {
        this.provas = provas;
    }

}
