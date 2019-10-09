package com.wildCircus.lordOfCircus.repositories;

import com.wildCircus.lordOfCircus.entities.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Integer>{
}