package com.ipl.a.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ipl.b.service.TeamService;
import com.ipl.d.models.Player;
import com.ipl.d.models.Team;

@RestController
@CrossOrigin(origins = "*")
public class HomeController {
	@Autowired
	TeamService teamService;

	@RequestMapping(value = "/addteam", method = RequestMethod.POST)
	public Team addTeam(@RequestBody Team team) {
		return teamService.createTeam(team);
	}

	@RequestMapping(value = "/getallteam", method = RequestMethod.GET)
	public List<Team> getAllTeam() {
		return teamService.getAllTeam();
	}

	@RequestMapping(value = "/getteam/{id}", method = RequestMethod.GET)
	public Team getTeam(@PathVariable long id) {
		return teamService.getTeam(id);
	}

	@RequestMapping(value = "/addplayer", method = RequestMethod.POST)
	public Player addPlayer(@RequestBody Player player) {
		return teamService.addPlayer(player);
	}
}
