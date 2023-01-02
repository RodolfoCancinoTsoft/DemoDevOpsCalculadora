package testCalculadora;

import democalculadora.Calculadora;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculadoraTest {


    @Test
    public void metodoSumar(){
        Calculadora calculadora1 = new Calculadora(5,5);
        Assert.assertEquals(10,calculadora1.sumar());
    }

    @Test
    public void metodoRestar(){
        Calculadora calculadora1 = new Calculadora(5,5);
        Assert.assertEquals(0,calculadora1.restar());
    }
}
