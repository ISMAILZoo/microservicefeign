package org.benzbairismail.client.module;

import lombok.Builder;

@Builder
public record ClientREQ(
    String name,
    Float age
) {
    
}
