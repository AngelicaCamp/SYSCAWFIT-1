package com.syscawfit.syscawfit;

import java.io.File;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.syscawfit.syscawfit.controller.EquipamentosController;

@SpringBootApplication
public class SyscawfitApplication {

    public static void main(String[] args) {
    	
    	//cria pasta dentro do sistema para recebimento de imagens conforme o caminho especificado.
//    	new File(EquipamentosController.caminhoImagens).mkdir();
    	
        SpringApplication.run(SyscawfitApplication.class, args);
    }

}
