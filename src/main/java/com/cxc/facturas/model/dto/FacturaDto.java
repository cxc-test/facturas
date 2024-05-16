package com.cxc.facturas.model.dto;

import java.math.BigDecimal;

import com.cxc.facturas.model.type.CoinTypeEnum;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FacturaDto {
   private Long id;
    private CoinTypeEnum coin;
    private BigDecimal amount;
    private String descriptionProduct;
    private Integer countProduct;
    private Long clientId;
}
