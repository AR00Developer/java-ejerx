/* Author : Enzo Godoy
 Fecha : 7/09/2017 
 email : enzo.godoy.g@gmail.com
*/
package ejercicio_pnt;

public class Ejercicio_PNT {

    public static void main(String[] args) {
        
    // Contrucción de los objetos productos    
    Producto coca_z = new Producto();
    coca_z.SetArticulo("Coca-Cola Zero",1.5, 20 );
    System.out.println("Nombre : " + coca_z.GetArticulo() + " /// Litros: " +  coca_z.GetCantidad() +" /// Precio :$ " + coca_z.GetPrecio() );
    
    
    Producto coca = new Producto();
    coca.SetArticulo("Coca-Cola",1.5, 18 );
    System.out.println("Nombre : " + coca.GetArticulo() + " /// Litros: " +  coca.GetCantidad() + " /// Precio :$ " + coca.GetPrecio() );
  
    
    Producto shampoo = new Producto();
    
    shampoo.SetArticulo("Shampoo Sedal", 500 , 19);
    System.out.println("Nombre : " + shampoo.GetArticulo()+ " /// Contenido: " + shampoo.GetCantidad() + "ml /// Precio :$ "+ shampoo.GetPrecio());
    
    Producto frutillas = new Producto();
    frutillas.SetArticulo("Frutillas", 0, 64);
    System.out.println("Nombre : " + frutillas.GetArticulo() + " /// Precio :$" +  frutillas.GetPrecio()  + " /// Unidad de Venta : kilo"  );
    
    /*        
    Lógica de obtención producto más barato ó caro
    
       IF  (a > b and a > c and a > d) {
        Caro = a; 
    }
      IF  ( a < b and a < c and a < d ){
        barato = a ; 
    }
    */
    
    
    //Obteniendo producto de menor precio
   
    if(coca.GetPrecio() < coca_z.GetPrecio() && coca.GetPrecio() < shampoo.GetPrecio() && coca.GetPrecio() < frutillas.GetPrecio() ) {  
        Producto.barato_min = coca.GetArticulo();
    }
    else if (coca_z.GetPrecio() < coca.GetPrecio() && coca_z.GetPrecio() < shampoo.GetPrecio() && coca_z.GetPrecio() < frutillas.GetPrecio() ) {
       Producto.barato_min = coca_z.GetArticulo();
    }
    else if (shampoo.GetPrecio() < coca.GetPrecio() && shampoo.GetPrecio() < coca_z.GetPrecio() && shampoo.GetPrecio() < frutillas.GetPrecio() ){
        Producto.barato_min = shampoo.GetArticulo();
        }
    else  if (frutillas.GetPrecio() < coca.GetPrecio() && frutillas.GetPrecio() < coca_z.GetPrecio() && frutillas.GetPrecio() < shampoo.GetPrecio() ) {
        Producto.barato_min = frutillas.GetArticulo(); 
    }
    
    // Obtención de producto mayor precio 
    if(coca.GetPrecio() > coca_z.GetPrecio() && coca.GetPrecio() > shampoo.GetPrecio() && coca.GetPrecio() > frutillas.GetPrecio() ) {  
        Producto.caro_max = coca.GetArticulo();
    }
    else if (coca_z.GetPrecio() > coca.GetPrecio() && coca_z.GetPrecio() > shampoo.GetPrecio() && coca_z.GetPrecio() > frutillas.GetPrecio() ) {
       Producto.caro_max = coca_z.GetArticulo();
    }
    else if (shampoo.GetPrecio() > coca.GetPrecio() && shampoo.GetPrecio() > coca_z.GetPrecio() && shampoo.GetPrecio() > frutillas.GetPrecio() ){
        Producto.caro_max = shampoo.GetArticulo();
        }
    else  if (frutillas.GetPrecio() > coca.GetPrecio() && frutillas.GetPrecio() > coca_z.GetPrecio() && frutillas.GetPrecio() > shampoo.GetPrecio() ) {
        Producto.caro_max = frutillas.GetArticulo(); 
    }
        
    
    // Impresion de producto caro/barato.
        
    System.out.println("El Articulo más caro es : "+ Producto.caro_max );
    System.out.println("El Articulo más barato es : " + Producto.barato_min);
    
}
}

