package com.spring.pontointeligente.api;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

/*
    Classe de teste utilizando o profile de teste "test" conforme arquivo application.test.properties.
    Foi necessário a inclusão das dependências Junit.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
public class PontoInteligenteApplicationTests {

    @Test
    public void contextLoads(){

    }
}
