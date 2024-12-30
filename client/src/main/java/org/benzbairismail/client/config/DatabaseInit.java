package org.benzbairismail.client.config;

import java.util.List;

import org.benzbairismail.client.module.Client;
import org.benzbairismail.client.module.ClientRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseInit {

    @Bean
    CommandLineRunner initializeDatabase(ClientRepository clientRepository) {
        return args -> {
            // Create and save 10 clients
            List<Client> clients = List.of(
                    Client.builder().name("ismail").age(25.5f).build(),
                    Client.builder().name("silya").age(30.0f).build(),
                    Client.builder().name("sami").age(22.3f).build(),
                    Client.builder().name("assil").age(40.8f).build(),
                    Client.builder().name("med").age(35.2f).build(),
                    Client.builder().name("ilias").age(28.4f).build(),
                    Client.builder().name("yanis").age(33.7f).build(),
                    Client.builder().name("laila").age(27.9f).build(),
                    Client.builder().name("meriem").age(45.1f).build(),
                    Client.builder().name("chaima").age(29.6f).build());

            clientRepository.saveAll(clients);
            System.out.println("Database initialized with 10 clients.");
        };
    }
}