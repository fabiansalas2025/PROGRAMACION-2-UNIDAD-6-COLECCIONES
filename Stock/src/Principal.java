
/**
 * PRACTICO N° 1
 * @author FABIAN SALAS
 * Comisión 17
 */
public class Principal {

    public static void main(String[] args) {
       
        Inventario inventario = new Inventario();

        Producto p1 = new Producto("P001", "Arroz", 1200, 50, CategoriaProducto.ALIMENTOS);
        Producto p2 = new Producto("P002", "Celular", 25000, 20, CategoriaProducto.ELECTRONICA);
        Producto p3 = new Producto("P003", "Remera", 1500, 30, CategoriaProducto.ROPA);
        Producto p4 = new Producto("P004", "Silla", 3000, 15, CategoriaProducto.HOGAR);
        Producto p5 = new Producto("P005", "Leche", 800, 40, CategoriaProducto.ALIMENTOS);

        inventario.agregarProducto(p1);
        inventario.agregarProducto(p2);
        inventario.agregarProducto(p3);
        inventario.agregarProducto(p4);
        inventario.agregarProducto(p5);

        System.out.println("Listado de productos:");
        inventario.listarProductos();

        System.out.println("Buscar producto por ID 'P003':");
        Producto buscado = inventario.buscarProductoPorId("P003");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("Filtrar por categoría ALIMENTOS:");
        inventario.filtrarPorCategoria(CategoriaProducto.ALIMENTOS);

        System.out.println("Eliminar producto con ID 'P002':");
        inventario.eliminarProducto("P002");
        inventario.listarProductos();

        System.out.println("Actualizar stock de 'P001' a 60:");
        inventario.actualizarStock("P001", 60);
        inventario.buscarProductoPorId("P001").mostrarInfo();

        System.out.println("Total de stock disponible:");
        System.out.println(inventario.obtenerTotalStock());

        System.out.println("Producto con mayor stock:");
        inventario.obtenerProductoConMayorStock().mostrarInfo();

        System.out.println("Filtrar productos con precio entre $1000 y $3000:");
        inventario.filtrarProductosPorPrecio(1000, 3000);

        System.out.println("Categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();
    }
}

    
