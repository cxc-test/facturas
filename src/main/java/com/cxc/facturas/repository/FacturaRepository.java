package com.cxc.facturas.repository;

import com.cxc.facturas.model.entity.FacturaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FacturaRepository  extends JpaRepository<FacturaEntity, Long> {
    List<FacturaEntity> findAll();
    void deleteById(Long id);
    FacturaEntity saveAndFlush(FacturaEntity entity);
    FacturaEntity getById(Long id);
}
