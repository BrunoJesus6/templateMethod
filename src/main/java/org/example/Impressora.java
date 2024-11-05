package org.example;

public class Impressora extends ProcedimentoManutencao {

    protected void verificarEquipamento() {
        System.out.println("Verificando a impressora...");
    }

    protected void realizarVerificacoes() {
        System.out.println("Verificando níveis de tinta e papel.");
    }

    protected void executarManutencao() {
        System.out.println("Executando manutenção na impressora: substituição de cartuchos, limpeza de cabeçote.");
    }

    protected void registrarManutencao() {
        System.out.println("Manutenção da impressora registrada com sucesso.");
    }
}
