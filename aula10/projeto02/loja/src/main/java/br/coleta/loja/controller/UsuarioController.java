package br.coleta.loja.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import br.coleta.loja.dao.UsuarioDAO;
import br.coleta.loja.model.Usuario;

@RestController
@CrossOrigin("*") // aceita pedidos de qualquer origem
public class UsuarioController {

    // delega ao JPA a responsabilidade de criar a classe para esse DAO e
    // implementar os métodos.
    @Autowired
    private UsuarioDAO dao;

    @GetMapping("/usuario/{id}")
    public ResponseEntity<Usuario> buscarUsuario(@PathVariable int id) {

        Usuario usuario = dao.findById(id).orElse(null); // busca um usuário pela chave primária

        if (usuario != null) {
            return ResponseEntity.ok(usuario);
        }
        else{
            return ResponseEntity.notFound().build();
            }
   
}

/*
    @PostMapping("/usuario/login")
    public ResponseEntity <Usuario> fazerLogin(@RequestBody Usuario userIncomplete)
    {
        Usuario userFinded = dao.findByEmailAndSenha(userIncomplete.getEmail(), userIncomplete.getSenha());

        if (userFinded != null) {
            return ResponseEntity.ok(userFinded);
        }
        else{
            return ResponseEntity.status(403).build();
            }
    }
    */

    @PostMapping("/usuario/login")
    public ResponseEntity <Usuario> fazerLogin(@RequestBody Usuario userIncomplete)
    {
        Usuario userFinded = dao.findByEmailAndSenha(userIncomplete.getEmail(), userIncomplete.getSenha());

        if (userFinded != null) {
            userFinded.setSenha("*******");
            return ResponseEntity.ok(userFinded);
        }
        else{
            return ResponseEntity.status(403).build();
            }
    }


    
    @GetMapping("/usuarios")
    public ResponseEntity<List<Usuario>> buscarUsuarios(){

        List <Usuario> lista = (List<Usuario>)dao.findAll(); // busca todos os usuários

        if (lista != null) {
            return ResponseEntity.ok(lista);
        }
        else{
            return ResponseEntity.notFound().build();
            }
   
}

/* 
@GetMapping("/usuarios")
public List<Usuario> buscarUsuarios(){

    List <Usuario> lista = (List<Usuario>)dao.findAll(); // busca todos os usuários

   return null;

}
*/

}
