package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    void deveVerificarEquipamento() {
        Computador computador = new Computador();
        computador.verificarEquipamento();
        assertTrue(true);
    }

    @Test
    void deveRealizarVerificacoes() {
        Computador computador = new Computador();
        computador.realizarVerificacoes();
        assertTrue(true);
    }

    @Test
    void deveExecutarManutencao() {
        Computador computador = new Computador();
        computador.executarManutencao();
        assertTrue(true);
    }

    @Test
    void deveRegistrarManutencao() {
        Computador computador = new Computador();
        computador.registrarManutencao();
        assertTrue(true);
    }

    @Test
    void deveRealizarManutencaoCompleta() {
        Computador computador = new Computador();
        computador.realizarManutencao();
        assertTrue(true);
    }
}