package primeraev;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Actividad2 {
  public static void main(String args[]) {
    try {
      Runtime rt = Runtime.getRuntime();
      String cmdString = "cmd /c dir c:\\";

      Process pr = rt.exec(cmdString);

      BufferedReader input = new BufferedReader(new InputStreamReader(pr.getInputStream()));

      String line = null;

      while ((line = input.readLine()) != null) {
        System.out.println(line);
      }

      int exitVal = pr.waitFor();
      System.out.println("Exited with error code " + exitVal);

    } catch (Exception e) {
      System.out.println(e.toString());
      e.printStackTrace();
    }
  }
}
