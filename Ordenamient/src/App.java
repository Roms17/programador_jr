import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        int[] listaDesordenada = {6, 4, 2, 8, 5, 1, 3, 9, 7};
        System.out.println(Arrays.toString(listaDesordenada));

        Ordenamient.burbuja(listaDesordenada);

        System.out.println(Arrays.toString(listaDesordenada));
    }
}

