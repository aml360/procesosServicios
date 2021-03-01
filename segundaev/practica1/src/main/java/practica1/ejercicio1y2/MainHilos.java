package practica1.ejercicio1y2;

import java.util.ArrayList;
import java.util.List;

public class MainHilos {
	public static void main(String[] args) {
		List<MisHilos> misHilos = new ArrayList<>();
		for (int i = 0; i < 100; i++) {
			misHilos.add(new MisHilos());
		}
		for (MisHilos h : misHilos) {
			h.start();
		}
	}
}