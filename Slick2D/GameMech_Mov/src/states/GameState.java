package states;

import java.util.Random;

import org.newdawn.slick.Animation;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GameState extends BasicGameState {

	private SpriteSheet alienSheet;
	private Animation alienAnimation;
	private float x,y;
	private float x2,y2;
	
	@Override
	public void init(GameContainer gc, StateBasedGame arg1) throws SlickException {
		alienSheet = new SpriteSheet("data/alien_spritesheet.png", 32,32);
		alienAnimation = new Animation(alienSheet,200);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
		alienAnimation.draw(x, y);
		alienAnimation.draw(x2, y2);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
		alienAnimation.update(delta);
		x+= 0.1 * delta;
		y+= 0.1 * delta;
		
		Input input = gc.getInput();
		
		if( input.isKeyDown(Input.KEY_RIGHT))
		{
			x += 0.09 * delta;
		}
		if( input.isKeyDown(Input.KEY_LEFT))
		{
			x -= 0.115 * delta;
		}
		if( input.isKeyDown(Input.KEY_UP))
		{
			y -= 0.091 * delta;
		}
		if( input.isKeyDown(Input.KEY_DOWN))
		{
			y += 0.09 * delta;
		}
		if(x>800||y>600){
			x=0;
			y=0;
		}
		
		float d = (x-x2)*(x-x2)+(y-y2)*(y-y2);
		float targetD = (10+10)*(10+10);
		
		if (d < targetD )
		{
			Random r = new Random();
			x2 = r.nextInt(500);
			y2 = r.nextInt(500);
		}
		
	}
	public void init(GameContainer gc) throws SlickException {
		x = 0;
		y = 0;
		x2 =100;
		y2 =100;
	}

	@Override
	public int getID() {
		// TODO Auto-generated method stub
		return 0;
	}

}
