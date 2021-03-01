package primeraev;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad1 {
  public static void main(String args[]) {
    try {
      // Este script funciona solo en windows como se indica en el enunciado
      Runtime rt = Runtime.getRuntime();
      String cmdString = "cmd /c dir c:\\";
      Process pr = rt.exec(cmdString);
      BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));
      String line = null;
      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }
    } catch (Exception e) {
      System.out.println(e.toString());
      e.printStackTrace();
    }
  }
}
