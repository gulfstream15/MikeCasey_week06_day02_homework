import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.*;

public class PhotographerTest{

  Photographer photographer;
  DigitalCamera digitalCamera;
  AnalogCamera analogCamera;
  
  @Before 
  public void before() {
    photographer = new Photographer(); 
  }

  @Test
  public void photographerClassExists() {
      assertNotNull(photographer);
  }

  @Test
  public void hasCamera(){
    photographer.addCamera(digitalCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canAddCamera(){
    photographer.addCamera(analogCamera);
    assertEquals(1, photographer.cameraCount());
  }

  @Test
  public void canRemoveCamera() {
    photographer.addCamera(digitalCamera);
    photographer.addCamera(analogCamera);
    Printable camera = photographer.removeCamera();
    assertNotNull(camera);
  }

  // @Test
  // public void canPrintAllCameras() {
  //   photographer.printAllCameras;
  //   assertNotNull(camera);
  // }  


}