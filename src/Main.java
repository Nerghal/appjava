//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String saludar = "hola bienvenido";

        System.out.println(saludar);


        int numero = 11;

        boolean valor= true;

        if(valor){
            System.out.println("numero es igual:" + numero);

            int numero2 = 25;

            String nombre = "";
            if(numero2 < 26) {
                nombre = "Juan";

            }else{
                nombre = "Maria";
            }
            System.out.println(nombre);
        }
    }
}