package com.spring.pontointeligente.api.repositories;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import com.spring.pontointeligente.api.entities.Empresa;

@RunWith(SpringRunner.class)
@SpringBootTest
/**
 * Utilizando o profile de testes "test" conforme arquivo "application-test.properties".
 * O nome entre "application" e "properties" no caso "test", é o nome do profile.
 */
@ActiveProfiles("test")
public class EmpresaRepositoryTest {

    /**
     * Notação Autowired é utilizada para acessar o repositório denotado.
     */
    @Autowired
    private EmpresaRepository empresaRepository;

    private static final String CNPJ = "51463645000100";

    /**
     * Notação Before é utilizada para realizar ações antes do teste.
     */
    @Before
    public void setUp() throws Exception {
        Empresa empresa = new Empresa();
        empresa.setRazaoSocial("Empresa de exemplo");
        empresa.setCnpj(CNPJ);
        this.empresaRepository.save(empresa);
    }

    /**
     * Notação After é utilizada para realizar ações após o teste.
     */
    @After
    public final void tearDown() {
        this.empresaRepository.deleteAll();
    }

    @Test
    public void testBuscarPorCnpj() {
        Empresa empresa = this.empresaRepository.findByCnpj(CNPJ);

        assertEquals(CNPJ, empresa.getCnpj());
    }
}
