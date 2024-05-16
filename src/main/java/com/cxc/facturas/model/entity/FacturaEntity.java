package com.cxc.facturas.model.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;

import com.cxc.facturas.model.type.CoinTypeEnum;

@Entity
@Getter
@Setter
@Table(name = "factura")
public class FacturaEntity implements Serializable {

    @Serial
    private static final long serialVersionUID = 1506872896128254182L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,  generator = "seq_facturas")
    @SequenceGenerator(name = "seq_facturas", allocationSize=1)
    private Long id;
    private CoinTypeEnum coin;
    private BigDecimal amount;
    private String descriptionProduct;
    private Integer countProduct;
    private Long clientId;
}
