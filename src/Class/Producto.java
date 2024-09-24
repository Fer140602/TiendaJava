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
public class Producto {    
    private int IdProducto;
    private String Subcategoria;
    private String Nombre;
    private double Precio;    

    public Producto() {
    }
    
    public Producto(int IdProducto, String Subcategoria, String Nombre, double Precio) {
        this.IdProducto = IdProducto;
        this.Subcategoria = Subcategoria;
        this.Nombre = Nombre;
        this.Precio = Precio;
    }
    
    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getSubcategoria() {
        return Subcategoria;
    }

    public void setSubcategoria(String Subcategoria) {
        this.Subcategoria = Subcategoria;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }    
    
    public Producto[] GetProducto(){
        Producto[] productos = new Producto[62];         
        //Subcategorias de LED
        productos[0] = new Producto(1,"LED","LG TV 49'' Smart 4k", 1699.00);
        productos[1] = new Producto(2,"LED","Samsung TV 50'' Smart 4k", 1649.00);        
        productos[2] = new Producto(3,"LED","Samsung TV 55'' Smart 4k", 2499.00);        
        productos[3] = new Producto(4,"LED","LG TV 43'' Smart FHD", 899.00); 
        //Subcategorias de OLED
        productos[4] = new Producto(5,"OLED","LG TV 55'' UHD ThinQ Al", 5799.00);
        productos[5] = new Producto(6,"OLED","LG TV 48'' UHD ThinQ Al", 4799.00);        
        productos[6] = new Producto(7,"OLED","Sony TV 55'' UHD Bravia", 7499.00);        
        productos[7] = new Producto(8,"OLED","LG TV 65'' UHD ThinQ Al", 7789.00); 
        //Subcategorias de QLED
        productos[8] = new Producto(9,"QLED","Samsung TV 60'' Neo Qled 4k", 4999.00);
        productos[9] = new Producto(10,"QLED","Samsung TV 65'' Qled 4k", 5999.00);        
        productos[10] = new Producto(11,"QLED","Samsung TV 50'' Qled 4k", 2699.00);        
        productos[11] = new Producto(12,"QLED","Samsung TV 55'' Neo Qled 4k", 4789.00); 
        productos[12] = new Producto(13,"QLED","LG TV 65'' Neo Qled 4k", 4199.00);
        //Subcategorias de NANOCELL        
        productos[13] = new Producto(14,"NANOCELL","LG TV 50'' Nanocell 4k", 2569.00);        
        productos[14]= new Producto(15,"NANOCELL","LG TV 55'' Nanocell 4k", 3409.00);        
        productos[15] = new Producto(16,"NANOCELL","LG TV 75'' Nanocell 4k", 7489.00);   
        //Subcategorias de Laptops
        productos[16] = new Producto(17,"Laptops","HP ALL-IN-ONE", 2699.00);
        productos[17] = new Producto(18,"Laptops","LENOVO PENTIUM 81UW", 2899.00);        
        productos[18] = new Producto(19,"Laptops","ASUS VIVO BOOK 15", 2799.00);        
        productos[19] = new Producto(20,"Laptops","ACER Swift 3S ", 2489.00); 
        //Subcategorias de Tablets
        productos[20] = new Producto(21,"Tablets","APPLE iPad8", 1399.00);        
        productos[21]= new Producto(22,"Tablets","LENOVO Tab 9M10", 409.00);        
        productos[22] = new Producto(23,"Tablets","Samsumg Galaxy Tab", 689.00);  
        //subcategoria de Monitores
        productos[23] = new Producto(24,"Monitores","BENQ  MonitorGamer 24k", 1299.00);        
        productos[24]= new Producto(25,"Monitores","AOC MOnitor AoC C27", 1049.00);
        //Subcategoria Impresora
        productos[25]= new Producto(26,"Impresoras","HP Ink Tank''415  wireless", 799.00);        
        productos[26] = new Producto(27," Impresoras ","Multifuncional Smarthtank 515 wifi", 899.00);  
        productos[27]= new Producto(26,"Impresoras"," Multifuncional WIFI PIXMA ", 899.00);   
        //Subcategoria de Accesorios de Computo
        productos[28] = new Producto(29,"Accesorios de Computo","Sakar Protector PC", 59.90);        
        productos[29]= new Producto(30,"Accesorios de Computo","Mercury Funda Tablet #7 ", 49.00);
        //Subcategoria de Consolas
        productos[30] = new Producto(31,"Consolas","SONY Ps3", 659.90);        
        productos[31]= new Producto(32,"Consolas","SONY Ps4", 1449.00);
        productos[32] = new Producto(33,"Consolas","SONY Ps5", 2559.90);        
        productos[33]= new Producto(34,"Consolas","NINTENDO Nintendo Switch ", 650.00);
        //Subcategoria de Controles
        productos[34] = new Producto(35,"Controles","SONY MANDO-Ps3", 59.90);        
        productos[35]= new Producto(36,"Controles","SONY MANDO-Ps4", 249.00);
        productos[36] = new Producto(37,"Controles","SONY MANDO-Ps5", 359.90);
        //Subcategoria de Juegos 
        productos[37] = new Producto(38,"Juegos","SONY Juegos-Ps3", 49.90);        
        productos[38]= new Producto(39,"Juegos","SONY Juegos-Ps4", 129.00);
        productos[39] = new Producto(40,"Juegos","SONY MANDO-Ps5", 199.90);
        //Subcategoria de Smarthphones
        productos[40] = new Producto(41,"Smarthphones","XIAOMI RedmiNote 10", 1549.90);        
        productos[41]= new Producto(42,"Smarthphones","MOTOROLA MotoG20", 1129.00);
        productos[42] = new Producto(43,"Smarthphones","Samsung Galaxy S21", 4199.90);
        //Subcategoria de Audifonos
        productos[43] = new Producto(44,"Audifonos","SkullCandy Dime True Wireless", 229.90);        
        productos[44]= new Producto(45,"Audifonos","Apple Airpods Pro", 529.00);
        productos[45] = new Producto(46,"Audifonos","SoundCore Bluetooth Life Q20", 199.90);
        //Subcategoria de Cargadores y Cables
        productos[46] = new Producto(47,"Cargadores y Cables","YOOBAO Cable Tipo-C", 229.90);        
        productos[47]= new Producto(48,"Cargadores y Cables","Apple Cable Carga USB-C", 529.00);
        productos[48] = new Producto(49,"Cargadores y Cables","ANKER Cargador de pared USB", 199.90);
        //Subcategoria de Parlantes
        productos[49] = new Producto(50,"Parlantes","SOUNDCORE Parlante Bluetooth Motion B", 89.90);        
        productos[50]= new Producto(51,"Parlantes","JBL Parlante Inalámbrico Go2 Black", 99.00);
        productos[51] = new Producto(52,"Parlantes","LG PORTATIL XBOOM PL5 ", 199.90);
        //Subcategoria de Cases
        productos[52] = new Producto(53,"Cases","TARGUS Case Iphone 7 Y 8", 109.90);        
        productos[53]= new Producto(54,"Cases","UBY Case Funda Iphone", 39.00);
        productos[54] = new Producto(55,"Cases","HORRORLAB Case Funda Delfin iPhone 11", 19.90);
        //Subcategoria de Drones
        productos[55] = new Producto(56,"Drones","JJRC Mini Deportivo Taichi ", 259.90);        
        productos[56]= new Producto(57,"Drones","SYMA Drone Camara Quadcopter HD WIFI", 499.00);
        //Subcategoria de Camaras
        productos[57] = new Producto(58,"Camaras","CANON Cámara EO5 M50 EF-M BL", 1109.90);        
        productos[58]= new Producto(59,"Camaras","PANASONIC Cámara semiprofesional 4K Ultra HD", 1739.00);
        productos[59] = new Producto(60,"Camaras","NIKON Cámara Réflex D5600", 919.90);
        //Subcategoria de Lentes
        productos[60] = new Producto(61,"Lentes","DJI Dji Om 4", 709.90);        
        productos[61]= new Producto(62,"Lentes","CANON'' Lente para Cámara ", 839.00);
        return productos;
    }
    
    public boolean validarCantidad(String cantidad){
        int num;
        try
        {
            num = Integer.parseInt(cantidad);
            if(num < 0)
            {
                return false;
            }            
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }
}