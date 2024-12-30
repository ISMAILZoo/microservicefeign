package org.benzbairismail.car.modules.client;
import lombok.Builder;

@Builder
public record ClientREQ(
    String name,
    Float age
) {
    
}
