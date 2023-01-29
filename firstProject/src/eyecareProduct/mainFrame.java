package eyecareProduct;

import java.awt.*;
import javax.swing.*;
public class mainFrame extends JFrame {
    JTextField firstName , lastName;
    JMenuBar mainMenu;
    public mainFrame(){
        initliazd();
    }
    public void initliazd() {

        lastName = new JTextField();

        /*******************  Main Menu Pennel  *******************/

        mainMenu = new JMenuBar();
        JMenu home = new JMenu("Home");
        JMenuItem fileOpen = new JMenuItem( "File" );
        JMenuItem filesave = new JMenuItem( "save" );
        home.add(fileOpen);
        home.add(filesave);
        mainMenu.add(home);
        
        /*******************  Form pannel Pennel  *******************/
        
        JLabel firstLabel = new JLabel( "First Label" );
        JLabel secondLabel = new JLabel( "Second Label" );
        firstName = new JTextField();
        lastName = new JTextField();
        
        
        
        /******************* Label and text field *******************/

      
        JPanel formPannel = new JPanel();
        formPannel.setLayout( new GridLayout( 20 , 10, 5, 5 ) );
        formPannel.setPreferredSize(new Dimension( 300 , 400 ));
        formPannel.add( firstLabel );
        formPannel.add( firstName );
        formPannel.add( secondLabel );
        formPannel.add( lastName );

        /*******************  menu bar Pennel  *******************/
    
        JPanel menuBar = new JPanel();
        menuBar.setLayout(new GridLayout( 1 , 1, 2, 2 ) );
        menuBar.add(mainMenu);

        /*******************  Main initialized Pennel  *******************/

        JPanel mainPannel = new JPanel();
        mainPannel.setLayout(new BorderLayout());
        mainPannel.setBackground( new Color(128 , 128 , 255) );
        mainPannel.add(formPannel , BorderLayout.WEST);
        mainPannel.add(menuBar , BorderLayout.NORTH);

        add(mainPannel);

        setTitle( "Eye Care Software" );
        setSize( 1000 ,600 );
        setMinimumSize(new Dimension( 300 , 400 ));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}
