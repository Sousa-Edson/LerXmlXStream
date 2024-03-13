package com.edson;

import com.edson.model.Det;
import com.edson.model.NfeProc;
import com.edson.model.Produto;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    // Caminho do arquivo XML
    String filePath =
      "/home/edson/Downloads/35230604207648000194550010000970711262768502-nfe.xml";

    try {
      // Ler o conteúdo do arquivo como uma string
      String xmlContent = new String(Files.readAllBytes(Paths.get(filePath)));

      // Criar uma instância do XStream
      XStream xStream = new XStream();

      xStream.alias("nfeProc", NfeProc.class);
      xStream.ignoreUnknownElements();
//      xStream.setMode(XStream.ID_REFERENCES);

      NfeProc nfeProc = (NfeProc) xStream.fromXML(xmlContent);

      // Obtendo a lista de itens de detalhe

//      List<Det> detList = nfeProc.getNFe().getInfNFe().getDetList();
      List<Det> detList = nfeProc.getNFe().getInfNFe().getDetList();

      if(detList != null){
        System.out.println("detList size:"+detList.size());
      }else{
        System.out.println("vazia");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
