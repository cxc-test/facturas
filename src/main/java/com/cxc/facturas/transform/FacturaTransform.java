package com.cxc.facturas.transform;

import com.cxc.facturas.model.dto.FacturaDto;
import com.cxc.facturas.model.entity.FacturaEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FacturaTransform {

    @Autowired
    ModelMapper mapper;

    public FacturaDto toDto(FacturaEntity entity){
        return this.mapper.map(entity, FacturaDto.class);
    }

    public FacturaEntity toEntity(FacturaDto dto){
        return this.mapper.map(dto, FacturaEntity.class);
    }

    public FacturaEntity copyToAttached(FacturaEntity old, FacturaDto dto){
        old.setAmount(dto.getAmount());
        old.setClientId(dto.getClientId());
        old.setCoin(dto.getCoin());
        old.setCountProduct(dto.getCountProduct());
        old.setDescriptionProduct(dto.getDescriptionProduct());
        return old;
    }
}
