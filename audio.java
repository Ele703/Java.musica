ackage br.com.alura.organizaaudio;

public class Audio {
    private String titulo;
    private int totalreproducoes;
    private int totalCurtidas;
    private int classificacao;


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTotalreproducoes() {
        return totalreproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }
    public void curte(){
            this.totalCurtidas++;
    }
    public void reproduz(){
        this.totalreproducoes++;
    }


    public void exibirFichaAudio(){

        System.out.println("Título: " + titulo);
        System.out.println("Total de curtidas: "+totalCurtidas);
        System.out.println("Total de reproduções: "+totalreproducoes) ;
        System.out.println("-------------------------------------------------");

    }
}
