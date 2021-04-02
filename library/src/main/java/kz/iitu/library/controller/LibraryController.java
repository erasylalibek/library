package kz.iitu.library.controller;

import kz.iitu.library.model.Library;
import kz.iitu.library.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class LibraryController {

    @Autowired
    ILibraryService service;

    public void create(Library library){
        service.create(library);
    }

    public void delete(Integer id){
        service.delete(id);
    }
    public List<Library> getAllLibraries(){
        return service.listOfLibraries();
    }
    public Library getLibraryByName(String name){
        return service.getByName(name);
    }
}
