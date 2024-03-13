package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("NFe")
public class NFe {
    // Atributos da NFe, você pode adicionar mais conforme necessário
    private String chaveAcesso;
    private String numero;
    private String dataEmissao;
    // ...
    private InfNFe infNFe;
    // Construtores, getters e setters

    public NFe() {
        // Construtor padrão
    }

    public NFe(String chaveAcesso, String numero, String dataEmissao /*...*/) {
        this.chaveAcesso = chaveAcesso;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        // Setar outros atributos conforme necessário
    }

    public String getChaveAcesso() {
        return chaveAcesso;
    }

    public void setChaveAcesso(String chaveAcesso) {
        this.chaveAcesso = chaveAcesso;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(String dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public InfNFe getInfNFe() {
        return infNFe;
    }

    public void setInfNFe(InfNFe infNFe) {
        this.infNFe = infNFe;
    }

// Adicionar outros getters e setters conforme necessário
}
