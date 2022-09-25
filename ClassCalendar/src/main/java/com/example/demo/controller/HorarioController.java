package com.example.demo.controller;

import com.example.demo.model.Horario;
import com.example.demo.service.HorarioService;
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
public class HorarioController {
    
    @Autowired
    private HorarioService horarioService;
    
    @GetMapping("/horarios")
    public ResponseEntity <List<Horario>> listaHorarios(){
        return ResponseEntity.status(HttpStatus.OK).body(horarioService.listaHorarios());
    }
    
    @GetMapping("horario/{id_horario}")
    public ResponseEntity<Optional<Horario>> getByIdHorario(@PathVariable Integer id_horario){
        return ResponseEntity.status(HttpStatus.OK).body(horarioService.getByIdHorario(id_horario));
    }
    
    @PostMapping("horario")
    public ResponseEntity<Horario> salvaHorario(@RequestBody Horario horario){
        return ResponseEntity.status(HttpStatus.CREATED).body(horarioService.salvaHorario(horario));
    }
    
    @PutMapping("horario")
    public ResponseEntity<Horario> atualizaHorario(@RequestBody Horario horario){
        return ResponseEntity.status(HttpStatus.OK).body(horarioService.atualizaHorario(horario));
    }
    
    @DeleteMapping("horario/{id_horario}")
    public ResponseEntity<String> deleteByIdHorario(@PathVariable Integer id_horario){
        horarioService.deleteByIdHorario(id_horario);
        return ResponseEntity.status(HttpStatus.OK).body("Horario removido com sucesso");
    }
}
