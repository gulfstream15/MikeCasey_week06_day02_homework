import java.util.*;

public class Photographer{

  private ArrayList<Printable> cameras;

  public Photographer(){
    this.cameras = new ArrayList<Printable>();
  }

  public int cameraCount(){
    return this.cameras.size();
  }

  public void addCamera(Printable camera){
    this.cameras.add(camera);
  }

  public Printable removeCamera() {
     if (cameraCount() > 0) {
      return cameras.remove(0);
    }
    return null;
  }

  public void printAllCameras() {
    for(Printable camera: this.cameras) {
      System.out.println(camera.printDetails());
    }
  } 

}