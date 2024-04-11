import Classe_Instancias.*;
public class Main {
    public static void main(String[] args) {
        Episodio primeiro = new Episodio();
        primeiro.setNumero(1);
        primeiro.setSerie("serie");
        primeiro.setTotalVisualizacoes(0);
        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(primeiro);
    }
}