import com.gui.window.Exit;
import com.gui.window.Window;

public class Main {

  public static void main(String[] args) {
    
    String selection = Window.menu();

    if (selection != null) { Window.nextWindow(selection); }

    Exit.sure();
  
  }

}
