
package com.ChatApp.ChatApp.Dao;


import com.ChatApp.ChatApp.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UsuarioDao extends JpaRepository <Usuario,Long>{
    Usuario findByUsername(String username);
}
