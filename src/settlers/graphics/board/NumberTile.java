package settlers.graphics.board;

import java.awt.Graphics;
import java.io.IOException;

import javax.imageio.ImageIO;

import settlers.Path;
import settlers.graphics.GraphicalObject;

class NumberTile extends GraphicalObject{

	// Constants
	public static final int DEFAULT_HEIGHT = 52;
	public static final int DEFAULT_WIDTH = 52;
	
	// Member variables
	private String tileNumber;
	public NumberTile(String tileNumber, int positionX, int positionY, int width, int height) throws IOException {
			
		// Inherited member variables
		this.image = ImageIO.read(ResourceTile.class.getResource(Path.NUMBER_TILES_IMAGES + tileNumber + ".png"));
		this.width = image.getWidth(null);
		this.height = image.getHeight(null);
		this.positionX = positionX + (width - this.width)/2;
		this.positionY = positionY + (height - this.height)/2;
		
		// Member variables
		this.tileNumber = tileNumber;
	}
	@Override
	public void draw(Graphics graphics) {
		graphics.drawImage(this.image, this.positionX, this.positionY, null);
	}
	
	public String getTileNumber() {
		return tileNumber;
	}
	
	public void setPositionX(int positionX, int width) {
		this.positionX = positionX + (width - this.width)/2;
	}
	
	public void setPositionY(int positionY, int height) {
		this.positionY = positionY + (height - this.height)/2;
	}
}

