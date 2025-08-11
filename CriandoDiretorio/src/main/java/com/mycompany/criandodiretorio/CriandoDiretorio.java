
package com.mycompany.criandodiretorio;

import java.io.File;

public class CriandoDiretorio {

    public static void main(String[] args) {
    File f=new File("/home/malu/mallushmalow");
        if (f.exists()){
        System.out.println("Já existe um diretório ou arquivo com este nome");
            }else{
                if (f.mkdir()){
                System.out.println("Diretorio criado com sucesso");
                    }else{
                    System.out.println("Falha na criação do diretório");
                    }
                }
    }
}
