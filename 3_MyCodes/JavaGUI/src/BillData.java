import java.net.*;
import java.awt.*;
import java.awt.image.*;
public class BillData {
    public URL link;
    public Image image;
    public int[] image_pixels;
    public BillData(URL link, Image image) {
        this.link = link;
        this.image = image;
    }
    public void initPixels(int image_width, int image_height) {
        image_pixels = new int[image_width * image_height];
        PixelGrabber pixel_grabber = new
                PixelGrabber(image.getSource(), 0, 0,
                image_width, image_height, image_pixels, 0, image_width);
        try {
            pixel_grabber.grabPixels();
        }
        catch (InterruptedException e) {
            image_pixels = null;
        }
    }
}