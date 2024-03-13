package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

@XStreamAlias("nfeProc")
public class NfeProc {

  private NFe NFe;

  public NFe getNFe() {
    return NFe;
  }

  public void setNFe(NFe nFe) {
    NFe = nFe;
  }
}
