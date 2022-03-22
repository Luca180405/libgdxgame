package com.surreal.game;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

public class GameObject {
	
	public Vector2 pos,dim;
	public float speed;
	public int health;
	
	
	public Pixmap pixmap;
	public Texture texture;
	public Sprite sprite;
	public Color color;
	
	public GameObject() {
		pos = new Vector2();
		dim = new Vector2();
		speed = 0f;
		health = 0;
	}
	
	
	public void createGraphics() {
		int width = 8;
		int height = 8;
		
		pixmap = new Pixmap(width, height, Pixmap.Format.RGB888);
		pixmap.setColor(color);
		pixmap.fill();
		pixmap.drawRectangle(0, 0, width, height);
		
		texture = new Texture(pixmap);
		
		sprite = new Sprite(texture);
	}
	
	
	public Vector2 getPos() {return pos;}
	public Vector2 getDim() {return dim;}
	public float getSpeed() {return speed;}
	public int getHealth() {return health;}
	
	public void setPos(Vector2 pos) {this.pos = pos;}
	public void setDim(Vector2 dim) {this.dim = dim;}
	public void setSpeed(float s) {this.speed = s;}
	public void setHealth(int h) {this.health = h;}
}
