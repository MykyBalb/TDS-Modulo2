package com.integracao.aula.Controller;

import com.integracao.aula.Entity.Produto;
import com.integracao.aula.Repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produto")
public class ProdutoController {
    @Autowired
    private ProdutoRepository pr;

    @GetMapping
    public List<Produto> getProduct() {
        return pr.findAll();
    }

    @PostMapping("/post")
    public ResponseEntity<Boolean> postProduct(@RequestBody Produto produto) {
        pr.save(produto);
        return new ResponseEntity<Boolean>(true, HttpStatus.OK);
    }

//    @PutMapping ResponseEntity<Boolean> putProduct(@PathVariable Long id, @RequestBody Produto p) {
//
//    }
}
