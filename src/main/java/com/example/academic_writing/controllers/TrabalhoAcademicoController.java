package com.example.academic_writing.controllers;

import com.example.academic_writing.TrabalhoAcademicoPresenter;
import com.example.academic_writing.models.TrabalhoAcademico;
import com.example.academic_writing.services.TrabalhoAcademicoService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TrabalhoAcademicoController {
    private final TrabalhoAcademicoService service;

    public TrabalhoAcademicoController(TrabalhoAcademicoService service) {
        this.service = service;
    }


    @GetMapping("trabalho-academico/{id}")
    public TrabalhoAcademicoPresenter findById(@PathVariable long id){
        return service.findById(id);

    }

    @GetMapping("trabalho-academico/")
    public List<TrabalhoAcademicoPresenter> list() {
        return service.list();
    }

    @PostMapping
    public TrabalhoAcademicoPresenter create(@RequestBody TrabalhoAcademico trabalhoAcademico){
        return service.create(trabalhoAcademico);

    }

}
