//No exemplo a seguir, estamos criando um componente List com 5 linhas e adicionando-o ao Frame.
import java.awt.*;
import javax.swing.*;

public class ListExample1{
    ListExample1(){
        JFrame f  =  new JFrame();

        List l1 =  new List(5);

        l1.setBounds(100, 100, 75, 75);

        l1.add("Item 1");
        l1.add("Item 2");
        l1.add("Item 3");
        l1.add("Item 4");
        l1.add("Item 5");

        f.add(l1);

        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
    public static void main(String[] args){
        new ListExample1();
    }
}