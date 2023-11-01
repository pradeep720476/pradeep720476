package org.hidubai.publisher.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@SuperBuilder(toBuilder = true)
@AllArgsConstructor
public class Meta extends BasicMeta {

    private String code;
    private String message;
}
