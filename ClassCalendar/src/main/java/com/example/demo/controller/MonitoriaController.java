package com.example.demo.controller;

import com.example.demo.model.Monitoria;
import com.example.demo.service.MonitoriaService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class MonitoriaController {
    
    @Autowired
    private MonitoriaService monitoriaService;
    
    @GetMapping("/monitorias")
    public ResponseEntity <List<Monitoria>> listaMonitorias(){
        return ResponseEntity.status(HttpStatus.OK). body(monitoriaService.listaMonitorias());
    }
    
    @GetMapping ("monitoria/{id_monitoria}")
    public ResponseEntity<Optional<Monitoria>> getByIdMonitoria(@PathVariable Integer id_monitoria){
        return ResponseEntity.status(HttpStatus.OK). body(monitoriaService.getByIdMonitoria(id_monitoria));
    }
    
    @PostMapping("monitoria")
    public ResponseEntity<Monitoria> salvaMonitoria(@RequestBody Monitoria monitoria){
       return ResponseEntity.status(HttpStatus.CREATED).body(monitoriaService.salvaMonitoria(monitoria));
    }
    
    @PutMapping("monitoria")
    public ResponseEntity<Monitoria> atualizaMonitoria(@RequestBody Monitoria monitoria){
        return ResponseEntity.status(HttpStatus.OK).body(monitoriaService.atualizaMonitoria(monitoria));
    }
    
    @DeleteMapping("monitoria/{id_monitoria}")
        public ResponseEntity<String> deleteByIdMonitoria(@PathVariable Integer id_monitoria){
            monitoriaService.deleteByIdMonitoria(id_monitoria);
            return ResponseEntity.status(HttpStatus.OK).body("Monitoria removida com sucesso");
        }
}
