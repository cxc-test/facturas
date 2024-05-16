package com.cxc.facturas.service.impl;

import com.cxc.facturas.model.dto.FacturaDto;
import com.cxc.facturas.repository.FacturaRepository;
import com.cxc.facturas.service.FacturaService;
import com.cxc.facturas.transform.FacturaTransform;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacturaServiceImpl implements FacturaService {

    @Autowired
    FacturaRepository repository;

    @Autowired
    FacturaTransform transform;

    @Override
    public List<FacturaDto> getAll() {
        return repository.findAll()
                .stream()
                .map(transform::toDto)
                .toList();
    }

    @Override
    public FacturaDto create(FacturaDto dto) {
        dto.setId(null);
        var txn = repository.saveAndFlush(transform.toEntity(dto));
        return transform.toDto(txn);
    }

    @Override
    public FacturaDto update(FacturaDto dto) {
        var exitsId = repository.getById(dto.getId());
        var txn = repository.saveAndFlush(transform.copyToAttached(exitsId, dto));
        return transform.toDto(txn);
    }

    @Override
    public Boolean deleteById(Long id) {
        repository.deleteById(id);
        return true;
    }
}
