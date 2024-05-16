package com.cxc.facturas.controller;


import com.cxc.facturas.model.dto.FacturaDto;
import com.cxc.facturas.service.FacturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "facturas")
public class FacturaController {

    @Autowired
    FacturaService clienteService;

    @CrossOrigin("*")
    @PostMapping(value = "/create")
    @ResponseBody
    public ResponseEntity<FacturaDto> create(@RequestBody FacturaDto dto) {
        return ResponseEntity.ok(clienteService.create(dto));
    }

    @CrossOrigin("*")
    @GetMapping(value = "/")
    @ResponseBody
    public ResponseEntity<List<FacturaDto>> getAll() {
        return ResponseEntity.ok(clienteService.getAll());
    }

    @CrossOrigin("*")
    @PutMapping(value = "/update")
    @ResponseBody
    public ResponseEntity<FacturaDto> update(@RequestBody FacturaDto dto) {
        return ResponseEntity.ok(clienteService.update(dto));
    }

    @CrossOrigin("*")
    @DeleteMapping(value = "/delete/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> deleteById(@PathVariable("id") Long id) {
        return ResponseEntity.ok(clienteService.deleteById(id));
    }
}
