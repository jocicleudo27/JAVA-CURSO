/*import javax.swing.*;
import java.awt.event.*;

class PopupMenuExample {
    PopupMenuExample() {
        final JFrame f = new JFrame("Exemplo PopupMenu2");
        final JPopupMenu popupmenu = new JPopupMenu("Opções");
        JMenuItem open = new JMenuItem("Abrir");
        open.setActionCommand("Abrir");
        JMenuItem save = new JMenuItem("Salvar");
        save.setActionCommand("Salvar");
        JMenuItem exit = new JMenuItem("Sair");
        exit.setActionCommand("Sair");
        popupmenu.add(open);
        popupmenu.add(save);
        popupmenu.add(exit);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new PopupMenuExample();
    }
}
*/

import javax.swing.*;
import java.awt.event.*;

class PopupMenuExample {
    PopupMenuExample() {
        final JFrame f = new JFrame("Exemplo PopupMenu");
        final JPopupMenu popupmenu = new JPopupMenu("Editar");
        JMenuItem cut = new JMenuItem("Corte");
        cut.setActionCommand("Corte");
        JMenuItem copy = new JMenuItem("Cópia");
        copy.setActionCommand("Copiar");
        JMenuItem paste = new JMenuItem("Colar");
        paste.setActionCommand("Colar");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        f.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args) {
        new PopupMenuExample();
    }
}

