package com.library;


//import org.junit.Assert;
import org.assertj.core.api.Assertions;
import org.junit.Test;

public class PrimeiroTeste {
    @Test
    public void estruturaDeUmTeste(){

        //cenário do teste
        int numero1 = 10, numero2 = 5;

        //execução do teste
        int resultado = numero1 + numero2;

        //verificação Assert - Junit
        // Assert.assertEquals(15, resultado);

        //Verificação AssertJ
//        Assertions.assertThat(resultado).isBetween(14, 16);
          Assertions.assertThat(resultado).isGreaterThan(10);

    }

}
