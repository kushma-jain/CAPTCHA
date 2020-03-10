import java.io.*;
import java.util.*;
public class GetKey {
    String key = "";
    public String getKey(int offset){
      try{
      String mainString = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
      
      String subString = mainString.substring(0,offset);
      key = subString.substring(subString.length()-1,subString.length());
      
      }catch(Exception e){
          System.out.println(e);
      } 
      
      return key;
    }
    
}
