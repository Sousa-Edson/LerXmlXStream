package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("prod")
public class Prod {

  private String cProd;
  private String cEAN;
  private String xProd;
  private String NCM;
  private String CFOP;
  private String uCom;
  private String qCom;
  private String vUnCom;
  private String vProd;
  private String cEANTrib;
  private String uTrib;
  private String qTrib;
  private String vUnTrib;
  private String indTot;

  public String getcProd() {
    return cProd;
  }

  public void setcProd(String cProd) {
    this.cProd = cProd;
  }

  public String getcEAN() {
    return cEAN;
  }

  public void setcEAN(String cEAN) {
    this.cEAN = cEAN;
  }

  public String getxProd() {
    return xProd;
  }

  public void setxProd(String xProd) {
    this.xProd = xProd;
  }

  public String getNCM() {
    return NCM;
  }

  public void setNCM(String nCM) {
    NCM = nCM;
  }

  public String getCFOP() {
    return CFOP;
  }

  public void setCFOP(String cFOP) {
    CFOP = cFOP;
  }

  public String getuCom() {
    return uCom;
  }

  public void setuCom(String uCom) {
    this.uCom = uCom;
  }

  public String getqCom() {
    return qCom;
  }

  public void setqCom(String qCom) {
    this.qCom = qCom;
  }

  public String getvUnCom() {
    return vUnCom;
  }

  public void setvUnCom(String vUnCom) {
    this.vUnCom = vUnCom;
  }

  public String getvProd() {
    return vProd;
  }

  public void setvProd(String vProd) {
    this.vProd = vProd;
  }

  public String getcEANTrib() {
    return cEANTrib;
  }

  public void setcEANTrib(String cEANTrib) {
    this.cEANTrib = cEANTrib;
  }

  public String getuTrib() {
    return uTrib;
  }

  public void setuTrib(String uTrib) {
    this.uTrib = uTrib;
  }

  public String getqTrib() {
    return qTrib;
  }

  public void setqTrib(String qTrib) {
    this.qTrib = qTrib;
  }

  public String getvUnTrib() {
    return vUnTrib;
  }

  public void setvUnTrib(String vUnTrib) {
    this.vUnTrib = vUnTrib;
  }

  public String getIndTot() {
    return indTot;
  }

  public void setIndTot(String indTot) {
    this.indTot = indTot;
  }
}
