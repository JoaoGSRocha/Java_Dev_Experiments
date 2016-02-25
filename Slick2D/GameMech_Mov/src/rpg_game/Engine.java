package rpg_game;


import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

import states.GameState;

public class Engine extends StateBasedGame{

	public Engine(String name) {
		super(name);
	}
	
	@Override
	public void initStatesList(GameContainer gc) throws SlickException {
		//MainMenu menu = new MainMenu();
		GameState game = new GameState();
		this.addState(game);
		//this.addState(menu);
	}
	
	public static void main(String[] args)
	{
		try {
			AppGameContainer appgc = new AppGameContainer(new Engine("Game"));
			appgc.setDisplayMode(800, 600, false);
			appgc.start();
		} catch (SlickException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}