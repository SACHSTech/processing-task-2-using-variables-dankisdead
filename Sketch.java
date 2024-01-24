import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
	// put your size call here
    size(973, 214);
  }

  /** 
   * Called once at the beginning of execution.  Add initial set up
   * values here i.e background, stroke, fill etc.
   */
  public void setup() {
    background(135, 206, 235);
  }

  /**
   * Called repeatedly, anything drawn to the screen goes here
   */
  public void draw() {  
  // stem
    stroke(53,94,59);
    strokeWeight((float)(width * 0.03));
    line((float)(width/2), (float)(height/2), (float)(width/2), (float)(height*0.9));
    
  // change strokeweight back to normal
    strokeWeight((float)(width * 0.005));
    stroke(0);

  // petals
    fill(255,254,224);
    ellipse((float)(width * 0.65), (float)(height * 0.3), (float)(width * 0.3), (float)(height * 0.3));
    ellipse((float)(width * 0.35), (float)(height * 0.3), (float)(width * 0.3), (float)(height * 0.3));
    ellipse((float)(width * 0.65), (float)(height * 0.6), (float)(width * 0.3), (float)(height * 0.3));
    ellipse((float)(width * 0.35), (float)(height * 0.6), (float)(width * 0.3), (float)(height * 0.3));

  // middle of flower
    fill(254,229,86);
    ellipse((float)(width * 0.5),(float)(height * 0.45),(float)(width * 0.3), (float)(height * 0.3));
    
  }
}