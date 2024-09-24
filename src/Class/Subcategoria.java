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
public class Subcategoria {
    private String Categoria;
    private String descripcion;
    private double Descuento;
    
    public  Subcategoria() {
    }
    
    public Subcategoria(String Categoria, String descripcion, double Descuento) {
        this.Categoria = Categoria;
        this.descripcion = descripcion;        
        this.Descuento = Descuento;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
        
    public double getDescuento() {
        return Descuento;
    }

    public void setDescuento(double Descuento) {
        this.Descuento = Descuento;
    }
    
    public Subcategoria[] GetSubcategoria(){
        Subcategoria[] subcategorias = new Subcategoria[20];
        //Subcategorias de TELEVISOR
        subcategorias[0] = new Subcategoria("Televisores","LED",0.2);
        subcategorias[1] = new Subcategoria("Televisores","OLED",0.1);
        subcategorias[2] = new Subcategoria("Televisores","QLED",0.1);
        subcategorias[3] = new Subcategoria("Televisores","NANOCELL",0.15);
        //Subcategorias de COMPUTADORAS
        subcategorias[4] = new Subcategoria("Computadoras","Laptops",0.10);
        subcategorias[5] = new Subcategoria("Computadoras","Tablets",0.05);
        subcategorias[6] = new Subcategoria("Computadoras","Monitores",0.05);
        subcategorias[7] = new Subcategoria("Computadoras","Impresoras",0.10);
        subcategorias[8] = new Subcategoria("Computadoras","Accesorios de Computo",0.15);
        //Subcategorias de VIDEOJUEGOS
        subcategorias[9] = new Subcategoria("Videojuegos","Consolas",0.20);
        subcategorias[10] = new Subcategoria("Videojuegos","Controles",0.10);
        subcategorias[11] = new Subcategoria("Videojuegos","Juegos",0.25);
        //Subcategorias de TELÉFONO
        subcategorias[12] = new Subcategoria("Teléfono","Smarthphones",0.15);
        subcategorias[13] = new Subcategoria("Teléfono","Audifonos",0.10);
        subcategorias[14] = new Subcategoria("Teléfono","Cargadores y Cables",0.05);
        subcategorias[15] = new Subcategoria("Teléfono","Parlantes",0.08);
        subcategorias[16] = new Subcategoria("Teléfono","Cases",0.05);
        //Subcategorias de FOTOGRAFIA
        subcategorias[17] = new Subcategoria("Fotografía","Drones",0.10);
        subcategorias[18] = new Subcategoria("Fotografía","Cámaras",0.20);
        subcategorias[19] = new Subcategoria("Fotografía","Lentes",0.12);         
        return subcategorias;
    }
}