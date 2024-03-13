package com.edson;

import com.edson.model.Det;
import com.edson.model.NfeProc; 
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
      "C:/Users/Asp/Downloads/35240204616931000170550010000022951000022964.xml";

    try {
      // Ler o conteúdo do arquivo como uma string
      String xmlContent = new String(Files.readAllBytes(Paths.get(filePath)));

      // Criar uma instância do XStream
      XStream xStream = new XStream();

      xStream.alias("nfeProc", NfeProc.class);
      xStream.ignoreUnknownElements();
     xStream.setMode(XStream.ID_REFERENCES);

      NfeProc nfeProc = (NfeProc) xStream.fromXML(xmlContent);

      // Obtendo a lista de itens de detalhe
// System.out.println("busca::: "+nfeProc.getNFe().getInfNFe().getDet().getProd().getxProd());
//      List<Det> detList = nfeProc.getNFe().getInfNFe().getDetList();
      List<Det> det = nfeProc.getNFe().getInfNFe().getDet();

      if(det != null){
        System.out.println("detList size:"+det.size());
      }else{
        System.out.println("vazia");
      }

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
