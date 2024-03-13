package com.edson;

import com.thoughtworks.xstream.XStream;

import  com.edson.model.NfeProc;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Hello world!
 *
 */
public class App {

  public static void main(String[] args) {
    // Caminho do arquivo XML
    String filePath =
      "C:/Users/Asp/Dropbox/4-Chaves/35220903858331000155550090005325111259932420.xml";

    try {
      // Ler o conteúdo do arquivo como uma string
      String xmlContent = new String(Files.readAllBytes(Paths.get(filePath)));

      // Criar uma instância do XStream
      XStream xStream = new XStream();

      xStream.alias("nfeProc", NfeProc.class);
      xStream.ignoreUnknownElements();

      xStream.setMode(XStream.ID_REFERENCES);
      //            xStream.debugSystemProperties();

      // Aqui você pode configurar o XStream conforme necessário
      // System.out.println("xmlContent" + xmlContent);
      // Desserializar o XML para um objeto Java

      // Agora você pode trabalhar com o objeto desserializado

      NfeProc nfeProc = (NfeProc) xStream.fromXML(xmlContent);
      System.out.println(
        "aqui:: " + nfeProc.getNFe().getInfNFe().getIde().getDhEmi()
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
