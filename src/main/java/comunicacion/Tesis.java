package comunicacion;

public class Tesis extends Escrito{
    private String idea;
    private String[] argumentos;
    private  String conclusion;
    private String referencias;
    private String interpretacion;

    public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos, String conclusion, String referencias, String interpretacion) {
        super(origen, titulo, autor, paginas);
        this.idea = idea;
        this.argumentos = argumentos;
        this.conclusion = conclusion;
        this.referencias = referencias;
        this.interpretacion = interpretacion;
    }

    @Override
    public int palabrasTotales(int palabrasPagina) {
        return palabrasPagina*getPaginas()*5;
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
        a_retornar += this.idea + "\n";
        a_retornar += this.argumentos.length + "\n";
        a_retornar += this.conclusion + "\n";
        a_retornar += this.referencias;
        return a_retornar;
    }

    public String getIdea() {
        return idea;
    }

    public String[] getArgumentos() {
        return argumentos;
    }

    public String getConclusion() {
        return conclusion;
    }

    public String getReferencias() {
        return referencias;
    }
}
