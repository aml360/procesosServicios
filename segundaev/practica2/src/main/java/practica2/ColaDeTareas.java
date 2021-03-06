package practica2;

import java.util.concurrent.BlockingQueue;

public class ColaDeTareas {

    private final BlockingQueue<Integer> listaDeTareas;

    public ColaDeTareas(int numHuecos) {
        listaDeTareas = new ConcurrentCircularBuffer<>(numHuecos);
    }

    public void addTask(int tarea) {
        try {
            listaDeTareas.put(tarea);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Integer quitaTarea() {
        try {
            return listaDeTareas.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int size() {
        return listaDeTareas.size();
    }

    @Override
    public String toString() {
        return listaDeTareas.toString();
    }
}
