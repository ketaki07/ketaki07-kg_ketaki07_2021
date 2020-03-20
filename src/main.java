import java.util.HashMap;

public class main {

  public static boolean charMapping(String string1, String string2){
    int strLength1= string1.length();
    int strLength2 = string2.length();
    if(strLength1 != strLength2){
      return false;
    }
    HashMap<Character, Character> hashStr1= new HashMap<>();

    for(int i=0;i<strLength1;i++){
      char char1=string1.charAt(i);
      char char2=string2.charAt(i);
      if(hashStr1.containsKey(char1)) {
        if (char2 != hashStr1.get(char1)) {
          return false;
        }
      }else {
        hashStr1.put(char1,char2);
      }
      }
    return true;
    }

  public static void main(String[] args) {
    boolean value = charMapping("abc","bcd");
    System.out.println(value);
  }
  }

