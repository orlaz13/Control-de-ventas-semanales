import java.util.Scanner;
public class VentasSemanales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double ventaTotal = 0;
        double mayorVenta = Double.MIN_VALUE;
        int diaMayorVenta = 0;        
        for (int i = 1; i <= 7; i++) {
            System.out.print("Ingrese la venta del día " + i + " (S/): ");
            double venta = scanner.nextDouble();
            ventaTotal += venta;           
            if (venta > mayorVenta) {
                mayorVenta = venta;
                diaMayorVenta = i;
            }
        }     
        double promedio = ventaTotal / 7;
        System.out.printf("Venta total: S/ %.2f\n", ventaTotal);
        System.out.printf("Promedio: S/ %.2f\n", promedio);
        System.out.println("Mayor venta: Día " + diaMayorVenta);
        scanner.close();
    }
}