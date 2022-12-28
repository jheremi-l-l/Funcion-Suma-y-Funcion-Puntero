public class Main {
    public static void main(String[] args) {

    //suma (10, 20, 30);

    Coche miCoche = new Coche();
    miCoche.SumaPuerta();
        System.out.println(miCoche.puerta);
    }
//Funcion Suma de parametros
    public static void suma (int a, int b, int c){
        int resultado = a + b + c;
        System.out.println(resultado);
    }
}
//Clase Coche y Funcion añadir puerta
class Coche {
    public int puerta = 1;

    public void SumaPuerta() {
        this.puerta++;
    }
}