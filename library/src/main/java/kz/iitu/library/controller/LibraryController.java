package kz.iitu.library.controller;

import kz.iitu.library.model.Library;
import kz.iitu.library.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    ILibraryService service;

    @PostMapping(value = "/create")
    public void create(@RequestBody Library library){
        service.create(library);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void delete(@PathVariable(name = "id") Integer id){
        service.delete(id);
    }

    @GetMapping(value = "/all")
    public List<Library> getAllLibraries(){
        return service.listOfLibraries();
    }

    @GetMapping(value = "/find/{name}")
    public Library getLibraryByName(@PathVariable(name = "name") String name){
        return service.getByName(name);
    }
}
