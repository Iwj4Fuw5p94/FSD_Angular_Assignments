package com.hexaware.apicodingchallange.service;

import java.util.List;

import com.hexaware.apicodingchallange.dto.PlayersDTO;
import com.hexaware.apicodingchallange.entity.Players;

public interface IPlayersService {
	public Players createPlayer(PlayersDTO dto);
	public List<Players> getAllPlayers();
	public void  deleteById(Long playerId);
	public PlayersDTO getPlayersById(Long playerId);
	public Players updateById(PlayersDTO dto,Long playerId);
	public Long getTotalMatchesByCountry(String country);
}
