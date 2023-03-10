package com;

import com.gui.window.Exit;
import com.gui.window.Window;

public class Main {

  public static void main(String[] args) {

    String selection = Window.menu();

    if (selection != null && !selection.equals("EXIT")) {
      Window.nextWindow(selection);
    } else {
      Exit.sure();
    }

  }

}
