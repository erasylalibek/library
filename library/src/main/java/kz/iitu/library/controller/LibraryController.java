package kz.iitu.library.controller;

import kz.iitu.library.model.Library;
import kz.iitu.library.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {

    @Autowired
    ILibraryService service;

    @RequestMapping(method = RequestMethod.POST)
    public void create(@RequestBody Library library){
        service.create(library);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable("id") Integer id){
        service.delete(id);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<Library> getAllLibraries(){
        return service.listOfLibraries();
    }

    @RequestMapping(value = "/name", method = RequestMethod.GET)
    public Library getLibraryByName(@RequestParam(name = "name") String name){
        return service.getByName(name);
    }
}
