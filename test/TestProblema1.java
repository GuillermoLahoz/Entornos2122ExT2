import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestProblema1 {
@Test
public void cadena_de_texto_1_20_Test(){
    String cadena = Problema1.cadena_de_texto_1_20();
    Assertions.assertEquals("1234567891011121314151617181920", cadena);
}
@Test
public  void cadena_de_texto_fizz_Buzz_Test(){
    String cadena = Problema1.cadena_de_texto_fizz_Buzz();
    Assertions.assertEquals("1fizzBuzzfizzfizzBuzzfizzfizzbuzzfizzBuzz", cadena);
}
}
