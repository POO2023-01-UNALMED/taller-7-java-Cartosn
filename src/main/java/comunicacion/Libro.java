package comunicacion;

public class Libro extends Escrito{
    private String co_autor;
    private String editorial;
    private String edicion;
    private String interpretacion;

    public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editorial, String edicion, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.co_autor = co_autor;
        this.editorial = editorial;
        this.edicion = edicion;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina*getPaginas()*2;
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
        a_retornar += this.co_autor + "\n";
        a_retornar += this.editorial + "\n";
        a_retornar += this.edicion;
        return a_retornar;
    }

    public String getCo_autor() {
        return co_autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getEdicion() {
        return edicion;
    }


}
