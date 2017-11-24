/* Author : Enzo Godoy
 Fecha : 7/09/2017 
 email : enzo.godoy.g@gmail.com
*/
package ejercicio_pnt;

class Producto {
    //Atributos  del producto;
    private int Precio;
    private double Cantidad; 
    private String Nombre;
    
    // Producto más caro ó barato
    static String barato_min ;
    static String caro_max; 
    
   //Métodos de inserción precios , nombre , cantidad
    
   public void SetArticulo(String Nombre, double Cantidad, int Precio){
    this.Nombre = Nombre ;
    this.Precio = Precio ;
    this.Cantidad = Cantidad ;
}
    public String GetArticulo(){
        return Nombre ;    
    }
    
    public double GetCantidad(){
        return Cantidad ;    
    }
    
    public int GetPrecio(){
        return Precio;    
    }
    


    
}
