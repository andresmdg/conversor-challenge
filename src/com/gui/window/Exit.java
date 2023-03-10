package com.gui.window;

import com.gui.components.Dialog;

import javax.swing.JOptionPane;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;

public class Exit {

  public static void sure() {

    Dialog dialog = new Dialog();

    WindowAdapter adapter = new WindowAdapter() {

      @Override
      public void windowClosing(WindowEvent e) {

        int confirm = JOptionPane.showConfirmDialog(dialog, "¿Quiere cerrar el programa?", "Cerrar programa",
            JOptionPane.YES_NO_OPTION);

        if (confirm == JOptionPane.YES_OPTION) {
          dialog.dispose();

        }
      }
    };

    dialog.addWindowListener(adapter);
    dialog.setVisible(true);
  }

}
