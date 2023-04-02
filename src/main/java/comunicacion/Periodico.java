package comunicacion;

public class Periodico extends Escrito{
    private String fecha;
    private String primicia;
    private String interpretacion;

    public Periodico(String origen, String titulo, String autor, int paginas, String fecha, String primicia, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.fecha = fecha;
        this.primicia = primicia;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina*getPaginas()*10;
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
        a_retornar += this.fecha + "\n";
        a_retornar += this.primicia;
        return a_retornar;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPrimicia() {
        return primicia;
    }
}
