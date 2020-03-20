import java.util.HashMap;
//To determine whether a one-to-one character mapping exists from one string, s1, to another string,
//s2.
public class main {

  public static boolean charMapping(String string1, String string2){
    int strLength1= string1.length();
    int strLength2 = string2.length();
    //If length of two strings is different return false
    if(strLength1 != strLength2){
      return false;
    }
    HashMap<Character, Character> hashStr1= new HashMap<>();

    for(int i=0;i<strLength1;i++){
      char char1=string1.charAt(i);
      char char2=string2.charAt(i);
      //if character has already occured in string1 then check in hashmap if its corresponding
      //value is same as the current character in string2. If not return false.
      //if character has not already occured in string1 then just add that character and its
      //corresponding character from string2 in hashmap.
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
    boolean value = charMapping(args[0],args[1]);
    System.out.println(value);
  }
  }

