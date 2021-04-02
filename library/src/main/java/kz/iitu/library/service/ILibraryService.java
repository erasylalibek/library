package kz.iitu.library.service;

import kz.iitu.library.model.Library;

import java.util.List;

public interface ILibraryService {
    void create(Library library);
    void delete(Integer id);
    List<Library> listOfLibraries();
    Library getByName(String name);
}
