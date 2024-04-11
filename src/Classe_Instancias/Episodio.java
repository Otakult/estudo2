package Classe_Instancias;

public class Episodio implements Classificavel {
    private int totalVisualizacoes;
    private int numero;
    private String serie;
    public int getClassificacao() {
        if (totalVisualizacoes >= 100) {
            return 4;
        } else if (totalVisualizacoes >= 50) {
        return 2;
        } else {
            return 0;
        }
    }
    public int getTotalVisualizacoes() {
        return totalVisualizacoes;
    }

    public void setTotalVisualizacoes(int totalVisualizacoes) {
        this.totalVisualizacoes = totalVisualizacoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }
}
