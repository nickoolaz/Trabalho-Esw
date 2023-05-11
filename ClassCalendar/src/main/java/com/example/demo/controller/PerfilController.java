package com.example.demo.controller;

import com.example.demo.model.Perfil;
import com.example.demo.service.PerfilService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
@Api("Api Perfils")
public class PerfilController {
    
    @Autowired
    private PerfilService perfilService;
    
    @GetMapping("/perfis")
    @ApiOperation("Listar todos os perfis")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Requisição realizada com sucesso"),
        @ApiResponse(code = 404, message = "Falha na requisição")
    })
    public ResponseEntity <List<Perfil>> listaPerfils(){
        return ResponseEntity.status(HttpStatus.OK). body(perfilService.listaPerfils());
    }
                                                                            
    @GetMapping("perfil/{id_perfil}")
    @ApiOperation("Listar um perfil por id")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Requisição realizada com sucesso"),
        @ApiResponse(code = 404, message = "Falha na requisição")
    })
    public ResponseEntity<Optional<Perfil>> getByIdPerfil(@PathVariable Integer id_perfil){
        return ResponseEntity.status(HttpStatus.OK).body(perfilService.getByIdPerfil(id_perfil));  
    }
    
    @PostMapping("perfil")
    @ApiOperation("Cadastrar um aluno")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Requisição realizada com sucesso"),
        @ApiResponse(code = 404, message = "Falha na requisição")
    })
    public ResponseEntity<Perfil> salvaAluno(@RequestBody Perfil perfil){
        return ResponseEntity.status(HttpStatus.CREATED).body(perfilService.salvaPerfil(perfil));
    }
    
    @PutMapping("perfil")
    @ApiOperation("Atualizar um perfil")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Requisição realizada com sucesso"),
        @ApiResponse(code = 404, message = "Falha na requisição")
    })
    public ResponseEntity<Perfil> atualizaAluno(@RequestBody Perfil perfil){
        return ResponseEntity.status(HttpStatus.OK).body(perfilService.atualizaPerfil(perfil));
    }
    
    @DeleteMapping("aluno/{id_perfil}")
    @ApiOperation("Remover um perfil")
    @ApiResponses({
        @ApiResponse(code = 200, message = "Requisição realizada com sucesso"),
        @ApiResponse(code = 404, message = "Falha na requisição")
    })
    public ResponseEntity<String> deleteByIdPerfil(@PathVariable Integer id_perfil){
        perfilService.deleteByIdPerfil(id_perfil);
        return ResponseEntity.status(HttpStatus.OK).body("Perfil removido com sucesso!");
    }    
}
