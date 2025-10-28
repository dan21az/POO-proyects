package espol.poo.modelo;
public class Tienda {
    private PromocionMes[] promociones;  // Arreglo de promociones
    private int mesActual;
    public Tienda(int mes) {
        mesActual=mes;
        this.promociones = new PromocionMes[12];
    }
    // Constructor de Tienda
    public Tienda(PromocionMes[] promociones) {
        this.promociones = promociones;
    }

    public void agregarPromocion(PromocionMes promocion){
        this.promociones[mesActual] = promocion;
    }

    // Método para mostrar las promociones de la tienda
    public void mostrarPromociones() {
        System.out.println("Promociones de la tienda:");
        for (PromocionMes promocion : promociones) {
            if (promocion!=null){ 
            System.out.println(promocion);
            System.out.println("Precio con descuento: " + promocion.calcularPrecioConDescuento());
            System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        // Crear algunos productos
        Producto producto1 = new Producto("Laptop", 1200.00);
        Producto producto2 = new Producto("Teléfono", 800.00);
        Producto producto3 = new Producto("Auriculares", 150.00);

        // Crear algunas promociones
        PromocionMes promocion1 = new PromocionMes(producto1, 15.0); // 15% de descuento
        PromocionMes promocion2 = new PromocionMes(producto2, 10.0); // 10% de descuento
        PromocionMes promocion3 = new PromocionMes(producto3, 5.0); // 5% de descuento

        // Crear un arreglo de promociones
        PromocionMes[] promociones = {promocion1, promocion2, promocion3};

        // Crear la tienda con las promociones
        Tienda tienda = new Tienda(promociones);
        // Mostrar las promociones y precios con descuento
        tienda.mostrarPromociones();
        System.out.println("Promociones tienda 2");
        //Tienda 
        Tienda tienda2 = new Tienda(10);
        tienda2.agregarPromocion(promocion1);
        tienda2.mostrarPromociones();

    }
}