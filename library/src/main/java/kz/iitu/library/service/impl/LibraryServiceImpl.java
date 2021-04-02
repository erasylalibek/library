package kz.iitu.library.service.impl;

import kz.iitu.library.model.Library;
import kz.iitu.library.repository.LibraryRepository;
import kz.iitu.library.service.ILibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryServiceImpl implements ILibraryService {

    @Autowired
    LibraryRepository repository;

    @Override
    public void create(Library library) {
        repository.save(library);
    }

    @Override
    public void delete(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Library> listOfLibraries() {
        return repository.findAll();
    }

    @Override
    public Library getByName(String name) {
        return repository.getByName(name);
    }
}
