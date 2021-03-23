package com.ltts.Player.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ltts.Player.Dao.PlayerDao;
import com.ltts.Player.model.Player;


@RestController
public class PlayerController {
	@Autowired
	PlayerDao pd;
	@RequestMapping("/Players")
	public List<Player> getPlayers()
	{
		return pd.getAllPlayers();
	}

}
