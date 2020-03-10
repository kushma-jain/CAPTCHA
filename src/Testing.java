
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Toshiba
 */
public class Testing {
    
    public static void main(String []args){
//        GetKey gk = new GetKey();
//        System.err.println(gk.getKey(2));
        
//        Base64 bb = new Base64();
//        String data = "testint";
//        byte bbb[] = bb.decode(data);
//        System.out.println(new String(bbb));
//        String nor = bb.encode(bbb);
//        System.out.println(nor);



      try{
      
      
      String path = "D:\\testing\\path\\testing.jpg";
      FileOutputStream fos = new FileOutputStream("D:\\path.txt");
      ObjectOutputStream os = new ObjectOutputStream(fos);
      os.writeObject(path);
      os.close();
      
      
      
      
      }catch(Exception e){
          System.out.println(e);
      }

    }
    
}
