package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("ide")
public class Ide {

    private String cUF;
    private String cNF;
    private String natOp;
    private String indPag;
    private String mod;
    private String serie;
    private String nNF;
    private String dhEmi;
    private String dhSaiEnt;
    private String tpNF;
    private String idDest;
    private String cMunFG;
    private String tpImp;
    private String tpEmis;
    private String cDV;
    private String tpAmb;
    private String finNFe;
    private String indFinal;
    private String indPres;

    public String getcUF() {
        return cUF;
    }

    public void setcUF(String cUF) {
        this.cUF = cUF;
    }

    public String getcNF() {
        return cNF;
    }

    public void setcNF(String cNF) {
        this.cNF = cNF;
    }

    public String getNatOp() {
        return natOp;
    }

    public void setNatOp(String natOp) {
        this.natOp = natOp;
    }

    public String getIndPag() {
        return indPag;
    }

    public void setIndPag(String indPag) {
        this.indPag = indPag;
    }

    public String getMod() {
        return mod;
    }

    public void setMod(String mod) {
        this.mod = mod;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public String getnNF() {
        return nNF;
    }

    public void setnNF(String nNF) {
        this.nNF = nNF;
    }

    public String getDhEmi() {
        return dhEmi;
    }

    public void setDhEmi(String dhEmi) {
        this.dhEmi = dhEmi;
    }

    public String getDhSaiEnt() {
        return dhSaiEnt;
    }

    public void setDhSaiEnt(String dhSaiEnt) {
        this.dhSaiEnt = dhSaiEnt;
    }

    public String getTpNF() {
        return tpNF;
    }

    public void setTpNF(String tpNF) {
        this.tpNF = tpNF;
    }

    public String getIdDest() {
        return idDest;
    }

    public void setIdDest(String idDest) {
        this.idDest = idDest;
    }

    public String getcMunFG() {
        return cMunFG;
    }

    public void setcMunFG(String cMunFG) {
        this.cMunFG = cMunFG;
    }

    public String getTpImp() {
        return tpImp;
    }

    public void setTpImp(String tpImp) {
        this.tpImp = tpImp;
    }

    public String getTpEmis() {
        return tpEmis;
    }

    public void setTpEmis(String tpEmis) {
        this.tpEmis = tpEmis;
    }

    public String getcDV() {
        return cDV;
    }

    public void setcDV(String cDV) {
        this.cDV = cDV;
    }

    public String getTpAmb() {
        return tpAmb;
    }

    public void setTpAmb(String tpAmb) {
        this.tpAmb = tpAmb;
    }

    public String getFinNFe() {
        return finNFe;
    }

    public void setFinNFe(String finNFe) {
        this.finNFe = finNFe;
    }

    public String getIndFinal() {
        return indFinal;
    }

    public void setIndFinal(String indFinal) {
        this.indFinal = indFinal;
    }

    public String getIndPres() {
        return indPres;
    }

    public void setIndPres(String indPres) {
        this.indPres = indPres;
    }

    @Override
    public String toString() {
        return "Ide [cUF=" + cUF + ", cNF=" + cNF + ", natOp=" + natOp + ", indPag=" + indPag + ", mod=" + mod
                + ", serie=" + serie + ", nNF=" + nNF + ", dhEmi=" + dhEmi + ", dhSaiEnt=" + dhSaiEnt + ", tpNF=" + tpNF
                + ", idDest=" + idDest + ", cMunFG=" + cMunFG + ", tpImp=" + tpImp + ", tpEmis=" + tpEmis + ", cDV="
                + cDV + ", tpAmb=" + tpAmb + ", finNFe=" + finNFe + ", indFinal=" + indFinal + ", indPres=" + indPres
                + "]";
    }
    
}
