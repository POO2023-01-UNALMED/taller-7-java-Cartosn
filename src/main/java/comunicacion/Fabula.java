package comunicacion;

public class Fabula extends  Escrito{
    private String ensenanza;
    private String interpretacion;

    public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.ensenanza = ensenanza;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina*getPaginas();
    }

    @Override
    public String interpretacion() {
        return this.interpretacion;
    }

    @Override
    public String toString() {
        String a_retornar = this.getOrigen() + "\n";
        a_retornar += this.getTitulo() + "\n";
        a_retornar += this.getAutor() + "\n";
        a_retornar += this.getPaginas() + "\n";
        a_retornar += this.ensenanza;
        return a_retornar;
    }

    public String getEnsenanza() {
        return ensenanza;
    }
}
