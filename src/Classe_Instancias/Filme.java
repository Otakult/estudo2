package Classe_Instancias;

public class Filme extends Título implements Classificavel {
    private int somaNotas=0;
    private int totalAvaliações=0;
    public void fazAvaliacao(int nota){
        somaNotas += nota;
        totalAvaliações++;
    }
    public int pegaMedia(){
        return somaNotas/totalAvaliações;
    }
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    public int getTotalAvaliações() {
        return totalAvaliações;
    }
}
