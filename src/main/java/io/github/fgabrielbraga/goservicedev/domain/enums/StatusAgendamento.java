package io.github.fgabrielbraga.goservicedev.domain.enums;

public enum StatusAgendamento {
    AGUARDANDO_CONFIRMACAO("Aguardando Confirmação"),
    CONFIRMADO("Confirmado"),
    CONCLUIDO("Concluído"),
    CANCELADO_PELO_CLIENTE("Cancelado pelo Cliente"),
    CANCELADO_PELO_PRESTADOR("Cancelado pelo Prestador");

    private final String descricao;

    private StatusAgendamento(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }
}
