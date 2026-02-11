//com
package espol.poo.u1.clase5.modelo;


public class Cliente{
    private String nombre;
    private int porcDescuento;//valor de 0 a 100
    private boolean esAfiliado;

 
    public String getNombre() {
      return nombre;
    }
    public void setNombre(String nombre) {
      this.nombre = nombre;
    }
    public int getPorcDescuento() {
      return porcDescuento;
    }
    public void setPorcDescuento(int porcDescuento) {
      this.porcDescuento = porcDescuento;
    }
  
    
    //sobrecarga de constructores
    public Cliente(){
    }
    //constructores parametrizados
    public Cliente(String nombre){
      this.nombre = nombre;
      porcDescuento =2;
  
    }
  
    public Cliente(String name, boolean afi){
      nombre = name;
      esAfiliado = afi;
      if (afi) porcDescuento =5;
    }
    //constructor que usa otro constructor
    public Cliente(String name, int desc){
      this(name, true);
      porcDescuento = desc;//le asigna un descuento diferente al defecto
    }
  
    //constructor copia
    public Cliente(Cliente c){
      nombre = c.nombre;
      porcDescuento = c.porcDescuento;
      esAfiliado = c.esAfiliado;
    }
  
    

    //metodos sobrecargados
    public void mostrarSaludo(){
      System.out.println("Usuario " + nombre + " dice hola");
    }
  
    public void mostrarSaludo(String saludo){
      System.out.println("Usuario " + nombre + " dice " + saludo);
      revisarMenu();
    }
    public void mostrarSaludo(int c){
      for (int i=0;i<c;i++){ 
      System.out.println("¡¡¡¡¡Usuario " + nombre + " dice hola" );
      }
    }
  
    
    public void mostrarSaludo(String saludo, int c){
      for (int i=0;i<c;i++){ 
          mostrarSaludo(saludo);
      }
    }
  
  
    public void revisarMenu(){
      System.out.println("Usuario " + nombre + " revisa menu");
    }
  
    public boolean pagar(double valor){
      //aplica el descuento
      valor = valor - (this.porcDescuento * valor)/100;
      System.out.println("Usuario paga "+String.format("%.2f",valor) );
      return true;
      
    }
  }
