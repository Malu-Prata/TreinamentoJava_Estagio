package Arquivos;

import java.io.File;

public class ListaArquivos {
public static void main(String[] args) {
    File path = new File(".");
    File[] lista;
    lista = path.listFiles();
    System.out.println("Path: " + path.getAbsolutePath());
        for (int i = 0; i < lista.length; i++) {
            if (lista[i].isDirectory()) {
            System.out.println("\t Diretorio: " + lista[i].getName() );
            } else {
        System.out.println("\t Arquivo: " + lista[i].getName() + " Tamanho(bytes): " + lista[i].length());
                    }
}
}
}