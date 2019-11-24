package com.ipl.c.repository;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

import com.ipl.d.models.Player;

public interface PlayerRepo extends CrudRepository<Player, Long> {
	List<Player> getPlayerByTeam(long id);
}
