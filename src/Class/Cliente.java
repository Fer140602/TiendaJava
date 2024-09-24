/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Class;

/**
 *
 * @author Anonimo
 */
public class Cliente {   
    private String NombreCompleto;
    private String DNI;
    private String Movil;    

    public Cliente(){    
    }
    
    public Cliente(String NombreCompleto, String DNI, String Movil) {
        this.NombreCompleto = NombreCompleto;
        this.DNI = DNI;
        this.Movil = Movil;
    }

    public String getNombreCompleto() {
        return NombreCompleto;
    }

    public void setNombreCompleto(String NombreCompleto) {
        this.NombreCompleto = NombreCompleto;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getMovil() {
        return Movil;
    }

    public void setMovil(String Movil) {
        this.Movil = Movil;
    }

    public boolean validarDNI(String dni){
        int num;
        try
        {
            num = Integer.parseInt(dni);
            if(num < 0)
            {
                return false;                
            } else {
                if(dni.length() == 8){
                    return true;
                } else {
                    return false;
                }
            }
        }
        catch(Exception e)
        {
            return false;
        }
    }
}