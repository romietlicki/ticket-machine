package com.rodrigo.ticket.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.rodrigo.ticket.model.Pesquisa;

public interface RepositorySearch extends JpaRepository<Pesquisa, Integer> {

    @Query(value = "SELECT p "
            + "from Pesquisa p where p.texto like %:texto%")
    List<Pesquisa> getAllTicketByText(@Param("texto") String texto);

}
