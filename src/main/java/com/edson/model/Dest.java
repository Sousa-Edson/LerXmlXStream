package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("dest")
public class Dest {
    private String CNPJ;
    private String xNome;
    private EnderecoDest enderDest;
    private String indIEDest;
    private String IE;

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

    public EnderecoDest getEnderDest() {
        return enderDest;
    }

    public void setEnderDest(EnderecoDest enderDest) {
        this.enderDest = enderDest;
    }

    public String getIndIEDest() {
        return indIEDest;
    }

    public void setIndIEDest(String indIEDest) {
        this.indIEDest = indIEDest;
    }

    public String getIE() {
        return IE;
    }

    public void setIE(String IE) {
        this.IE = IE;
    }
}
