package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.ArrayList;
import java.util.List;

@XStreamAlias("infNFe")
public class InfNFe {

  private Ide ide;
  private Emit emit;
  private Dest dest;
  private List<Det> detList;

  public Ide getIde() {
    return ide;
  }

  public void setIde(Ide ide) {
    this.ide = ide;
  }

  public Emit getEmit() {
    return emit;
  }

  public void setEmit(Emit emit) {
    this.emit = emit;
  }

  public Dest getDest() {
    return dest;
  }

  public void setDest(Dest dest) {
    this.dest = dest;
  }

//  public List<Det> getDetList() {
//    return detList;
//  }
public List<Det> getDetList() {
  if (detList == null) {
    detList = new ArrayList<>();
  }
  return detList;
}
  public void setDetList(List<Det> detList) {
    this.detList = detList;
  }

@Override
public String toString() {
    return "InfNFe [ide=" + ide.toString() + ", emit=" + emit + ", dest=" + dest +   "]";
}

  
}
