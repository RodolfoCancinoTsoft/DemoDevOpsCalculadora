package democalculadora;

public class MainCalculadora {

    public static void main(String[] args) {

        Calculadora nuevaCalculadora = new Calculadora(5,4);

        System.out.println("El resultado de la suma es: "+nuevaCalculadora.sumar());
        System.out.println("El resultado de la resta es: "+nuevaCalculadora.restar());
        System.out.println("El resultado de la multiplicación es: "+nuevaCalculadora.multiplicar());
        System.out.println("El resultado de la division es: "+nuevaCalculadora.dividir());
    }
}
