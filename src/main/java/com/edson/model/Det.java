package com.edson.model;
 
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("det")
public class Det {
    @XStreamAlias("nItem")
    private String nItem;
    private Produto prod;
    // private Imposto imposto;

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    public Produto getProd() {
        return prod;
    }

    public void setProd(Produto prod) {
        this.prod = prod;
    }

    // public Imposto getImposto() {
    //     return imposto;
    // }

    // public void setImposto(Imposto imposto) {
    //     this.imposto = imposto;
    // }
}