import javax.swing.*;


class MenuExample{
    MenuExample(){
        JFrame f = new JFrame("Exemplo de Menu e MenuItem");
        JMenuBar mb =  new JMenuBar();
        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("Sub Menu");
        JMenuItem i1 = new JMenuItem("Item 1");
        JMenuItem i2 = new JMenuItem("Item 2");
        JMenuItem i3 = new JMenuItem("Item 3");
        JMenuItem i4 = new JMenuItem("Item 4");
        JMenuItem i5 = new JMenuItem("Item 5");

        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);

        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);
        
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new MenuExample();
            }
        });
    }
    
}