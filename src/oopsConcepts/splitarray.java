package oopsConcepts;

import java.util.*; 
import java.io.*;

class splitarray {

  public static String SearchingChallenge(String[] inputArray) {
    // code goes here  
    Map<String,Integer> preficSumMap = new HashMap<>();

    for (String entry : inputArray){
      String[] parts = entry.split(":");
      if(parts.length == 2){
        String prefix = parts[0];
        int value;
        try{
          value=Integer.parseInt(parts[1]);

        }catch(NumberFormatException e){
          System.out.print("Invalid Number"+entry);
          continue;
        }
  preficSumMap.put(prefix, preficSumMap.getOrDefault(prefix,0)+value);

      }
      else{
        System.out.print("Invalid Entry format"+entry);
      }
    }
    

    StringBuilder output = new StringBuilder();
    for(Map.Entry<String,Integer> entry : preficSumMap.entrySet()){
      if(output.length()>0){
        output.append(",");
      }
      output.append(entry.getKey()).append(":").append(entry.getValue());


    }
    return output.toString();


    }


    

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    //String line = scanner.nextLine();
    String s1 = s.nextLine();

    String [] inArray = s1.split(",\\S*");
    System.out.print(SearchingChallenge(inArray)); 
  }

}