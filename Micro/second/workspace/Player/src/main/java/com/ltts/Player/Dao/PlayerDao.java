package com.ltts.Player.Dao;

import java.util.List;
import java.util.ArrayList;
import org.springframework.stereotype.Repository;

import com.ltts.Player.model.Player;

@Repository
public class PlayerDao {
	public List<Player> getAllPlayers()
	{
		List<Player> li=new ArrayList<Player>();
		li.add(new Player(1,"CSK","Dhoni"));
		li.add(new Player(2,"RCB","Virat"));
		return li;
		
	}

}
