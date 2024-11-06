package util;
import java.util.function.Function;

import entities.Produto;

//Classe que implementa uma Interface funcional
public class UpperCaseName implements Function<Produto, String> {

    @Override
    public String apply(Produto p) {
       return p.getNome().toUpperCase();
    }
    
}
