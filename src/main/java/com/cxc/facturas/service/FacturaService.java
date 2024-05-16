package com.cxc.facturas.service;


import com.cxc.facturas.model.dto.FacturaDto;
import java.util.List;

public interface FacturaService {
    List<FacturaDto> getAll();
    FacturaDto create(FacturaDto dto);
    FacturaDto update(FacturaDto dto);
    Boolean deleteById(Long id);
}
