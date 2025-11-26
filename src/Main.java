import java.util.Scanner;

public class Main {
    public static double aplicarDescuento(double precio, String Cliente){
        Cliente=Cliente.toLowerCase();

        switch(Cliente){
            case "1":
            case "Estudiante":
                return precio*(1-CalculadoraDescuentos.Descuento_Estudiante);

            case "2":
            case "Adulto":
                return precio*(1-CalculadoraDescuentos.Descuento_Adulto);

            case "3":
            case "Mayor":
                return precio*(1-CalculadoraDescuentos.Descuento_Mayor);

            case "4":
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

        System.out.println("ingrese tipo de cliente (1:Estudiante,2:Adulto,3:Mayor,4:VIP): ");
        String Cliente=sc.nextLine();

        double precioconDescuento=aplicarDescuento(preciobase,Cliente);

        double IVA=aplicarIVA(precioconDescuento);

        System.out.println("-------Resultado-------");
        System.out.println("Precio base: " + String.format("%.2f",preciobase));
        System.out.println("precio con descuento: " + String.format("%.2f",precioconDescuento));
        System.out.println("IVA: " + String.format("%.2f",IVA));
        sc.close();
    }
}