package com.mycompany.criandoarquivo;

import java.io.File;
import java.io.IOException;


public class CriandoArquivo {

    public static void main(String[] args) {
    File f = new File("/home/malu/mallushmalow/teste.txt");
        if (f.exists()) {
        System.out.println("Já existe um diretório ou arquivo com este nome");
        } else {    
            try {
                if (f.createNewFile()) {
                System.out.println("Arquivo criado com sucesso");
                    } else {
                    System.out.println("Falha na criação do arquivo");
                    }
                } catch (IOException ex) {
                ex.printStackTrace();
                    }
                }
    }
}
