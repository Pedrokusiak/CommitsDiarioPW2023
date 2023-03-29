package com.example.helloworld.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.helloworld.entity.Aluno;
import com.example.helloworld.service.AlunoService;

@RestController
@RequestMapping("/alunos")
@CrossOrigin
public class AlunoController {
    @Autowired
    private AlunoService alunoService;

    // localHost:8080/aluno/ - com verbo get
    @GetMapping
    public List<Aluno> listarTodos(){
        return alunoService.listarTodos();
    }

    // localHost:8080/aluno/ - com verbo post
    @PostMapping("/salvar")
    public Aluno salvar(@RequestBody Aluno aluno){
        return alunoService.salvar(aluno);
    }
    //localHost:8080/aluno/ - com o verbo delete
    @DeleteMapping("/{id}")
    public void excluir(@PathVariable("id") Long id){
        alunoService.excluir(id);
    }

}
