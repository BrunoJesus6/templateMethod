package org.example;

public abstract class ProcedimentoManutencao {

    public final void realizarManutencao() {
        verificarEquipamento();
        realizarVerificacoes();
        executarManutencao();
        registrarManutencao();
    }

    protected abstract void verificarEquipamento();

    protected abstract void realizarVerificacoes();

    protected abstract void executarManutencao();

    protected abstract void registrarManutencao();
}