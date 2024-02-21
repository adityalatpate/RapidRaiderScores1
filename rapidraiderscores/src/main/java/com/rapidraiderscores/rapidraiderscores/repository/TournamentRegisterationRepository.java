package com.rapidraiderscores.rapidraiderscores.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.rapidraiderscores.rapidraiderscores.entities.TeamRegistration;


@Repository
public interface TournamentRegisterationRepository extends JpaRepository<TeamRegistration, Long> 
{

    
}
