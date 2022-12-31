package democalculadora;

public class Calculadora {

    //Atributos
    private int numero1;
    private int numero2;

    public Calculadora(int numero1, int numero2){
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Calculadora(){

    }

    //Getter and Setter


    //Metodos
    public int sumar(){
        int resSuma = numero1 + numero2;
        return resSuma;
    }

    public int restar(){
        int resResta = numero1 - numero2;
        return resResta;
    }

    public int multiplicar(){
        int resMultiplicacion = numero1 * numero2;
        return resMultiplicacion;
    }

    public double dividir(){
        double resDivision = numero1 / numero2;
        return resDivision;
    }

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
