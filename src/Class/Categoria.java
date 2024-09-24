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
public class Categoria {
    private String descripcion;        
    
    public Categoria() {
    }
    
    public Categoria(String descripcion) {
        this.descripcion = descripcion;        
    }
       
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    public Categoria[] GetCategoria(){     
        Categoria[] categorias = new Categoria[5];
        categorias[0] = new Categoria("Televisores");
        categorias[1] = new Categoria("Computadoras");
        categorias[2] = new Categoria("Videojuegos");
        categorias[3] = new Categoria("Teléfono");
        categorias[4] = new Categoria("Fotografía");      
        return categorias;
    }
    
}