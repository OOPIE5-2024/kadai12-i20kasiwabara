package Ex12;

public class BinaryImageFilter implements Processable{
	//@Override
	public void process(GrayImage img) {
		int width = img.getWidth();
		int height = img.getHeight();
		for(int x=0; x < width; x++) {
			for(int y=0; y < height; y++) {
				int c = img.getGray(x, y);
				if (c < 128) {
					c = 0;
				} else {
					c = 255;
				}
				img.setGray(x, y, c);
			}
		}
	}
}
