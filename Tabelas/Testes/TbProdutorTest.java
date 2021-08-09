package Tabelas.Testes;

import Tabelas.Produtor;
import Tabelas.TbProdutor;
import Tabelas.TipoEstruturado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

//Classe agora possui um array de produtor, faltam metodos para avaliar eles individualemnte
public class TbProdutorTest {
    TbProdutor ClasseTeste=new TbProdutor();
    String nome="Glorinha";

    @Test
    void testNovoTBProdutor(){
        TbProdutor Novo;
        Novo=new TbProdutor();
        assertNotNull(Novo);
    }
    @Test
    void testLeValor(){
        ClasseTeste.add(nome);
        Produtor me=ClasseTeste.get(0);
        String palavra=me.getNome();
        System.out.println(palavra);
        assertTrue(nome.equals(palavra));
    }
    @Test
    void testCriaNovo(){
        ClasseTeste.add(nome);
        System.out.println(ClasseTeste.get(0));
        assertTrue(nome.equals(ClasseTeste.get(0)));

    }

}

