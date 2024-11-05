package org.example;

public class Computador extends ProcedimentoManutencao {

    protected void verificarEquipamento() {
        System.out.println("Verificando o computador...");
    }

    protected void realizarVerificacoes() {
        System.out.println("Realizando verificações de software e hardware.");
    }

    protected void executarManutencao() {
        System.out.println("Executando manutenção no computador: limpeza de disco, atualização de software.");
    }

    protected void registrarManutencao() {
        System.out.println("Manutenção do computador registrada com sucesso.");
    }
}
