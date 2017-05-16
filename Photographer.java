import java.util.*;

public class Photographer{

  private String cameraName;
  private String cameraFilter;
  private String cameraResolution;
  private ArrayList<Printable> cameras;

  public Photographer(String cameraName, String cameraFilter, String cameraResolution){
      this.cameraName = cameraName;
      this.cameraFilter = cameraFilter;
      this.cameraResolution = cameraResolution;
      this.cameras = new ArrayList<Printable>();
  }

  // public Photographer(){
  //   this.cameras = new ArrayList<Printable>();
  // }

}