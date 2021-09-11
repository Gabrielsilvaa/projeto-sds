package com.gabriel.dsvendas.dto;

import com.gabriel.dsvendas.entity.Seller;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
public class SellerDTO implements Serializable {
    private Long id;
    private String name;

    public SellerDTO(Seller entity){
        this.id = entity.getId();
        this.name = entity.getName();
    }
}
