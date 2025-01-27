package org.benzbairismail.car.modules.car;

import org.benzbairismail.car.modules.client.ClientDTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CarDTO {

    private Long id;
    private String marque;
    private String matricule;
    private String model;
    private ClientDTO client;


}
