package com.hexaware.apicodingchallange.restcontroller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.apicodingchallange.dto.PlayersDTO;
import com.hexaware.apicodingchallange.entity.Players;
import com.hexaware.apicodingchallange.service.IPlayersService;


@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/api/players")
public class PlayersRestController {

	
	@Autowired
	IPlayersService service;
	@PostMapping("/create")
	public Players createPlayer(@RequestBody PlayersDTO dto) {
		System.out.println(dto);
		return service.createPlayer(dto);
	}
	
	@GetMapping("/getall")
	public List<Players> getAllPlayers(){
		return service.getAllPlayers();
	}
	@DeleteMapping("/delete/{playerId}")
	public void deleteById(@PathVariable Long playerId) {
		service.deleteById(playerId);
		
	}
	
	@GetMapping("/totalmatchesbycountry/{country}")
    public Long getTotalMatchesByCountry(@PathVariable String country) {
        return service.getTotalMatchesByCountry(country);
}
}
