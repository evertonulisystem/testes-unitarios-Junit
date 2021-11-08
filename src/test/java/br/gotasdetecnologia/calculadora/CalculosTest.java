package br.gotasdetecnologia.calculadora;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
//import org.junit.Assert;
//import org.junit.Test;
public class CalculosTest {
    //CENÁRIO DE TESTE
    //Preparação do Cenário
    //Execução
    //Resultados/Verificações
    @Test
    public void retornarZeroQuandoNadaInformado(){
        Calculos numerosASomar = new Calculos();
        double esperado = 0;
        double atual = numerosASomar.soma();
        Assertions.assertEquals(esperado,atual);
        //Assert.assertEquals(esperado,atual,0);
  }
    @Test
    public void retornarSomaQuandoNumerosForemInformados(){
        Calculos numerosASomar = new Calculos();
        double atual = numerosASomar.soma(15,13);
        double esperado = 28;
        Assertions.assertEquals(esperado,atual);
        //Assert.assertEquals(esperado,atual,0);
    }








//  @Test
//  public void verificaNumeroPar() {
//      Calculos paraVerificar = new Calculos();
//      boolean informaNumeroPar = paraVerificar.informaNumeroPar(4);
//      Assertions.assertTrue(informaNumeroPar);
//  }

//  @Test
//    public void retornaRaizQuadrada(){
//      Calculos numeroACalcular = new Calculos();
//      double atual = numeroACalcular.raizQuadradaDeDoisNumeros(144);
//      double esperado = 12;
//      Assertions.assertEquals(esperado, atual);
//    }
}