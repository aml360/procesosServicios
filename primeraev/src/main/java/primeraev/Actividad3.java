package primeraev;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Actividad3 {
	public static void main(String[] args) throws IOException {
		Process p = new ProcessBuilder("CMD", "/C", "DATE").start();

		OutputStream os = p.getOutputStream();
		os.write("19-11-20".getBytes());
		os.flush();

		InputStream is = p.getInputStream();
		int c;
		while ((c = is.read()) != -1) {
			System.out.print((char) c);
		}
		is.close();

		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("Valor de Salida: " + exitVal);
		} catch (Exception e) {
			e.printStackTrace();
		}
		errores(p);
	}

	private static void errores(Process p) {
		InputStream is = p.getErrorStream();
		int c;
		try {
			while ((c = is.read()) != -1)
				System.out.print((char) c);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
