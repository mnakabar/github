package com.devsuperior.aula_bd01.resources;

import com.devsuperior.aula_bd01.entities.Category;
import jdk.jfr.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResources {

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = new ArrayList<>();
        list.add(new Category(1L, "Electronics"));
        list.add(new Category(2L, "Book"));
        return ResponseEntity.ok().body(list);
    }

    //  @GetMapping(value = "/{id}")
    // public ResponseEntity<...> findById(@PathVariable Long id){
    // ...
    // return ResponseEntity.ok().body(...);
    // }
}
