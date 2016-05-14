package rubricaborrosa;

import java.util.ArrayList;

public class Variable
{
    private String nombre, rango;
    private int resolucion;
    ArrayList<FuncionPertenencia> listaFuncionesP;
    
    public Variable(String n, String ran, int res)
    {
        nombre = n;
        rango = ran;
        resolucion = res;
        listaFuncionesP = new ArrayList();
    }

    public ArrayList<FuncionPertenencia> getListaFuncionesP() {
        return listaFuncionesP;
    }

    public void setListaFuncionesP(ArrayList<FuncionPertenencia> listaFuncionesP) {
        this.listaFuncionesP = listaFuncionesP;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }
}
