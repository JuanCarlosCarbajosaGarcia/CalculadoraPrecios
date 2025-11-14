import java.util.Scanner;

public class Main {
    public static double aplicarDescuento(double precio, String Cliente){
        Cliente=Cliente.toLowerCase();

        switch(Cliente){
            case "Estudiante":
                return precio*(1-CalculadoraDescuentos.Descuento_Estudiante);
            case "Adulto":
                return precio*(1-CalculadoraDescuentos.Descuento_Adulto);
            case "Mayor":
                return precio*(1-CalculadoraDescuentos.Descuento_Mayor);
            case "VIP":
                return precio*(1-CalculadoraDescuentos.Descuento_VIP);

            default:
                return precio;
        }
    }
    public static double aplicarIVA(double precioconDescuento){
        return precioconDescuento*(1-CalculadoraDescuentos.IVA);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("ingrese precio base: ");
        double preciobase=sc.nextDouble();
        sc.nextLine();

        System.out.println("ingrese tipo de cliente (Estudiante,Adulto,Mayor,VIP): ");
        String Cliente=sc.nextLine();

        double precioconDescuento=aplicarDescuento(preciobase,Cliente);

        double IVA=aplicarIVA(precioconDescuento);

        System.out.println("-------Resultado-------");
        System.out.println("Precio con Descuento: " + String.format("%.2f",precioconDescuento));
        System.out.println("IVA: " + String.format("%.2f",IVA));
        sc.close();
    }
}