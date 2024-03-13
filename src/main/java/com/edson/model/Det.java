package com.edson.model;
 
import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("det")
public class Det {
    private String nItem;
    // private Prod prod;
    // private Imposto imposto;

    public String getnItem() {
        return nItem;
    }

    public void setnItem(String nItem) {
        this.nItem = nItem;
    }

    // public Prod getProd() {
    //     return prod;
    // }

    // public void setProd(Prod prod) {
    //     this.prod = prod;
    // }

    // public Det() {
    // }
    // public Imposto getImposto() {
    //     return imposto;
    // }

    // public void setImposto(Imposto imposto) {
    //     this.imposto = imposto;
    // }
}
