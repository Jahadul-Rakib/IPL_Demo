package com.ipl.b.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ipl.c.repository.PlayerRepo;
import com.ipl.c.repository.TeamRepo;
import com.ipl.d.models.Player;
import com.ipl.d.models.Team;

@Service
public class TeamService {

	@Autowired
	PlayerRepo playerRepo;
	@Autowired
	TeamRepo teamRepo;

	public Team createTeam(Team team) {
		return teamRepo.save(team);
	}

	public Team getTeam(long id) {
		Team t = teamRepo.getOne(id);
		return t;
	}

	public List<Team> getAllTeam() {
		return (List<Team>) teamRepo.findAll();

	}

	public Player addPlayer(Player player) {
		return playerRepo.save(player);
	}

	public List<Player> getPlayerByTeamId(long id) {
		Team team = getTeam(id);
		List<Player> p = playerRepo.getPlayerByTeam(team.getId());
		return p;
	}
	
	public String deletePlayer(long id) {
		playerRepo.deleteById(id);
		return "Deleted";
		
	}
}
