public Leilao(String id, Date dataExpiracao, double lanceMinimo) {
        this.id = id;
        this.dataExpiracao = dataExpiracao;
        this.lanceMinimo = lanceMinimo;
        this.lances = new ArrayList<>();
        this.estaAberto = false;
}

public void abrir() {
    this.estaAberto = true;
}

public void fechar() {
    this.estaAberto = false;
}

public boolean estaAberto() {
    return estaAberto;
}

public boolean expirou() {
    return new Date().after(dataExpiracao);
}

public void fazerLance(Lance lance) {
    if (!estaAberto || expirou()) {
        throw new IllegalStateException("Leilão não está aberto para lances.");
    }
    if (lance.getValor() < lanceMinimo) {
        throw new IllegalArgumentException("Valor do lance está abaixo do lance mínimo.");
    }
    if (!lances.isEmpty() && lance.getValor() <= lances.get(lances.size() - 1).getValor()) {
        throw new IllegalArgumentException("Valor do lance deve ser maior que o lance anterior.");
    }
    if (!lances.isEmpty() && lance.getParticipante().equals(lances.get(lances.size() - 1).getParticipante())) {
        throw new IllegalArgumentException("Participante não pode fazer dois lances consecutivos.");
    }
    lances.add(lance);
}

public Lance getMaiorLance() {
    if (lances.isEmpty()) {
        return null;
    }
    return lances.get(lances.size() - 1);
}

public List<Lance> getLances() {
    return lances;
}
}