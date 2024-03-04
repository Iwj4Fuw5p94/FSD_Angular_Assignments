package com.hexaware.apicodingchallange.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.apicodingchallange.dto.PlayersDTO;
import com.hexaware.apicodingchallange.entity.Players;
import com.hexaware.apicodingchallange.repository.IPlayersRepository;

@Service
public class PlayersServiceImp implements IPlayersService {

	@Autowired
	IPlayersRepository repository;
	
	@Override
	public Players createPlayer(PlayersDTO dto) {
		Players player=new Players();
		player.setPlayerId(dto.getPlayerId());
		player.setPlayerName(dto.getPlayerName());
		player.setJerseyNumber(dto.getJerseyNumber());
		player.setRole(dto.getRole());
		player.setTotalMatches(dto.getTotalMatches());
		player.setTeamName(dto.getTeamName());
		player.setCountry(dto.getCountry());
		player.setPlayerDescription(dto.getPlayerDescription());
		return repository.save(player);
	}

	@Override
	public List<Players> getAllPlayers() {
		return repository.findAll();
	}

	@Override
	public void deleteById(Long playerId) {
		Players player=repository.findById(playerId).orElse(null);
		 repository.deleteById(playerId);
	}

	@Override
	public PlayersDTO getPlayersById(Long playerId) {
		Players player=repository.findById(playerId).orElse(new Players());
		return new PlayersDTO(player.getPlayerId(),player.getPlayerName(),player.getJerseyNumber(),player.getRole(),player.getTotalMatches(),player.getTeamName(),player.getCountry(),player.getPlayerDescription());
	}

	@Override
	public Players updateById(PlayersDTO dto, Long playerId) {
		Players player=repository.findById(playerId).orElse(new Players());
		
		player.setPlayerId(dto.getPlayerId());
		player.setPlayerName(dto.getPlayerName());
		player.setJerseyNumber(dto.getJerseyNumber());
		player.setRole(dto.getRole());
		player.setTotalMatches(dto.getTotalMatches());
		player.setTeamName(dto.getTeamName());
		player.setCountry(dto.getCountry());
		player.setPlayerDescription(dto.getPlayerDescription());
		return repository.save(player);
		
	}

	@Override
	public Long getTotalMatchesByCountry(String country) {
		// TODO Auto-generated method stub
		return repository.findTotalMatchesByCountry(country);
	}

}
