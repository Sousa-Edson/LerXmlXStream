package com.edson.model;

import com.thoughtworks.xstream.annotations.XStreamAlias; 
import java.util.List;

@XStreamAlias("infNFe")
public class InfNFe {

  private Ide ide;
  private Emit emit;
  private Dest dest;
  // private Det det;
  private List<Det> det;

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

  

  @Override
  public String toString() {
    return (
      "InfNFe [ide=" +
      ide.toString() +
      ", emit=" +
      emit +
      ", dest=" +
      dest +
      "]"
    );
  }

  public List<Det> getDet() {
    return det;
  }

  public void setDet(List<Det> det) {
    this.det = det;
  }

  
}
