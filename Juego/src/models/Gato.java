
public class Gato{
    Scanner sc = new Scanner(System.in);
    // caracteres de tablero
    private Jugador j1;
    private Jugador j2;
    private int tiradas;
    // tablero en una matriz bidimencional
    private char[][] tablero = new char[3][3];

    public void iniciarJuego(){}
// NOTE: 2 -- Asignar jugadores 
    private void asignarJugadores(boolean cpu){}
// NOTE: 3 -- Crear jugador 
    private Jugador crearJugador(boolean cpu,int n,char figura){}
// NOTE: 4 -- recorre tablero 
    private void imprimeTablero(){}
// NOTE: 5 -- 
    private boolean tirar(Jugador jt){}
// NOTE: 6
    private boolean verificaTres(char figura){}
// NOTE: 7
    public int jugar(){}
// NOTE: 1 -- inicia tbalero
    private void iniciaTablero(){}

    
}