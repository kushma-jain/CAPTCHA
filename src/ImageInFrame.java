
import java.io.FileInputStream;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class ImageInFrame extends JFrame
{
public static void main(String args[])
{
	new ImageInFrame().start();
}

public void start()
{
    
          try{
          FileInputStream fisFileName = new FileInputStream("file.txt"); 
        byte bbFileName[] = new byte[fisFileName.available()];
        fisFileName.read(bbFileName);
        fisFileName.close();        
        String capFilePath = new String(bbFileName);
	   ImageImplement panel = new ImageImplement(new ImageIcon(capFilePath).getImage());
	  add(panel);
	  setVisible(true);
	  setSize(400,400);
	  setDefaultCloseOperation(EXIT_ON_CLOSE);
          }catch(Exception e){
              System.out.println(e);
          }
}
}


