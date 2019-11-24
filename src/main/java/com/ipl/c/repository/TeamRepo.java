package com.ipl.c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ipl.d.models.Team;

@Repository
public interface TeamRepo extends JpaRepository<Team, Long> {

}
