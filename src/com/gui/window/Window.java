package com.gui.window;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class Window {

  /*
   * parentComponent,
   * "Select an option:",
   * "Title",
   * JOptionPane.OK_CANCEL_OPTION,
   * null,
   * options,
   * initialValue
   */

  public static String menu() {

    String message = "Seleccione una opcion de conversion";
    String[] options = { "Selecciona una opcion", "Conversor de monedas", "Conversor temperatura" };
    JDialog dialog = new JDialog();

    Object inputValue = JOptionPane.showInputDialog(dialog, message, "Conversor", JOptionPane.DEFAULT_OPTION, null,
        options, options[0]);
    System.out.println(inputValue);

    if (inputValue == null || inputValue.toString().isEmpty()) {
      return "EXIT";
    }
    
    return inputValue.toString();
  }

  public static void nextWindow(String window) {

  }

}
