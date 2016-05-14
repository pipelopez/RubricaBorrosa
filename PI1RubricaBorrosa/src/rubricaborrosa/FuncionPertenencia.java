package rubricaborrosa;
/**
 * @author GrupoPI 
 */
public class FuncionPertenencia
{
    private String etiqueta, gradosPertenencia;

    public FuncionPertenencia(String etiqueta, String gradosPertenencia) {
        this.etiqueta = etiqueta;
        this.gradosPertenencia = gradosPertenencia;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getGradosPertenencia() {
        return gradosPertenencia;
    }

    public void setGradosPertenencia(String gradosPertenencia) {
        this.gradosPertenencia = gradosPertenencia;
    }
}
