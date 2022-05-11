package com.rodrigo.ticket;

import java.util.Arrays;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.rodrigo.ticket.model.Pesquisa;
import com.rodrigo.ticket.repository.RepositorySearch;

@SpringBootApplication
public class TicketMachineInteger1Application {

	public static void main(String[] args) {
		SpringApplication.run(TicketMachineInteger1Application.class, args);
	}
	
	
    @Bean
    ApplicationRunner init(RepositorySearch userRepository)
    {
        return args -> {
            Pesquisa pesquisa = new Pesquisa();
            pesquisa.setId(1);
            pesquisa.setTexto("Brazil");
            
            Pesquisa pesquisa1 = new Pesquisa();
            pesquisa1.setId(2);
            pesquisa1.setTexto("Portugal");
            
            Pesquisa pesquisa2 = new Pesquisa();
            pesquisa2.setId(3);
            pesquisa2.setTexto("USA");
            
            Pesquisa pesquisa3 = new Pesquisa();
            pesquisa3.setId(4);
            pesquisa3.setTexto("United Kingdom");
            
            Pesquisa pesquisa4 = new Pesquisa();
            pesquisa4.setId(5);
            pesquisa4.setTexto("França");
            
            Pesquisa pesquisa5 = new Pesquisa();
            pesquisa5.setId(6);
            pesquisa5.setTexto("Italia");
            
            Pesquisa pesquisa6 = new Pesquisa();
            pesquisa6.setId(7);
            pesquisa6.setTexto("Itú");
            
            Pesquisa pesquisa7 = new Pesquisa();
            pesquisa7.setId(8);
            pesquisa7.setTexto("Bosnia");

            userRepository.saveAll(Arrays.asList(pesquisa, pesquisa1,pesquisa2,pesquisa3,pesquisa4,pesquisa5,pesquisa6,pesquisa7));
        };

}

}
