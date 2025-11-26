//Scanner es necesario para que el usuario pueda responder/escribir.
import java.util.Scanner;

//calcula y muestra el precio final del cliente.
public class Main {


    //calculo del descuento del cliente en caso de que exista.
    public static double aplicarDescuento(double precio, String Cliente){
        Cliente=Cliente.toLowerCase();

        //opciones del cliente.
        switch(Cliente){
            //Descuento de Estudiante
            case "1":
            case "Estudiante":
                return precio*(1-CalculadoraDescuentos.Descuento_Estudiante);

            //Descuento de Adulto
            case "2":
            case "Adulto":
                return precio*(1-CalculadoraDescuentos.Descuento_Adulto);

            //Descuento de Mayor
            case "3":
            case "Mayor":
                return precio*(1-CalculadoraDescuentos.Descuento_Mayor);

            //Descuento de VIP
            case "4":
            case "VIP":
                return precio*(1-CalculadoraDescuentos.Descuento_VIP);

            //valor basico en caso de opcion incorrecta o ausencia de descuento
            default:
                return precio;
        }
    }

    //aplicacion de iva al precio
    public static double aplicarIVA(double precioconDescuento){
        return precioconDescuento*(1-CalculadoraDescuentos.IVA);
    }

    //parte con la que el usuario interactua
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pedir precio base del producto
        System.out.println("ingrese precio base: ");
        double preciobase=sc.nextDouble();
        sc.nextLine();

        //introduccion del tipo de cliente
        System.out.println("ingrese tipo de cliente (1:Estudiante,2:Adulto,3:Mayor,4:VIP):");
        String Cliente=sc.nextLine();

        //aplica el descuento en funcion del cliente
        double precioconDescuento=aplicarDescuento(preciobase,Cliente);

        //aplicacion del IVA
        double IVA=aplicarIVA(precioconDescuento);

        //mensaje para el usuario para que este sepa que debe pagar y cuanto ahorra
        System.out.println("-------Resultado-------");
        System.out.println("Precio base: " + String.format("%.2f",preciobase));
        System.out.println("precio con descuento: " + String.format("%.2f",precioconDescuento));
        System.out.println("IVA: " + String.format("%.2f",IVA));

        //cerrar el Scanner
        sc.close();
    }
}