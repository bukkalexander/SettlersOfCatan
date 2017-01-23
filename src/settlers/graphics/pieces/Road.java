package settlers.graphics.pieces;

import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;

import settlers.Path;
import settlers.graphics.GraphicalObject;

public class Road extends GraphicalObject{
	
	public Road(String color, int positionX, int positionY) {
		
		// Inherited member variables
		try {
			this.image = ImageIO.read(Road.class.getResource(Path.PIECES_IMAGES + "road" + color + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.positionX = positionX;
		this.positionY = positionY;
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
		
	}
	
	@Override
	public void draw(Graphics graphics) {
		graphics.drawImage(this.image, this.positionX, this.positionY, null);
	}

}
