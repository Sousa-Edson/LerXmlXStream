package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("emit")
public class Emit {
    private String CNPJ;
    private String xNome;
    private EnderecoEmit enderEmit;
    private String IE;
    private String CRT;

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    public String getxNome() {
        return xNome;
    }

    public void setxNome(String xNome) {
        this.xNome = xNome;
    }

    public EnderecoEmit getEnderEmit() {
        return enderEmit;
    }

    public void setEnderEmit(EnderecoEmit enderEmit) {
        this.enderEmit = enderEmit;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }

    public String getCRT() {
        return CRT;
    }

    public void setCRT(String CRT) {
        this.CRT = CRT;
    }
    
}
