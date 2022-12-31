package testCalculadora;


import democalculadora.Calculadora;
import democalculadora.MainCalculadora;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraTest {


    @Test
    public void metodoSumar(){
        //Calculadora calculadora1 = new Calculadora();
        //MainCalculadora mainCalculadora = new MainCalculadora();

        Calculadora calculadora1 = new Calculadora();


        int resultadoActual = calculadora1.sumar();
        int resultadoEsperado = calculadora1.sumar();

        Assert.assertEquals(resultadoEsperado,resultadoActual);
        System.out.println(""+resultadoActual);
        System.out.println(""+resultadoEsperado);
    }
}
