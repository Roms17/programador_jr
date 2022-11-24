import java.util.Stack;

public class Camisas {
    
    public static void metodoPush(){
        Stack pila = new Stack();
        Stack<String> sPila = new Stack<String>();

        pila.push(3);

        sPila.push("Camisa de cuadros");
        sPila.push("Camisa de rayas");
        sPila.push("Camisa negra");
}
        public static void metodoPeek(){
            Stack<Integer> pila = new Stack<Integer>();
            for(int i = 0;i<4;i++){
                pila.push(i);
}
                System.out.println("Pila: "+pila);
                System.out.println("El ultimo elemento es : "+ pila.peek());
                System.out.println("Pila Final: "+ pila);
        
            }


                public static void metodoEmpty(){
                    Stack<String> camisas= new Stack<String>();
                    // agregar elementos a la pila
                    camisas.push("Camisa de cuadros");
                    camisas.push("Camisa de rayas");
                    camisas.push("Camisa negra");
                    
                    System.out.println("Pila: " + camisas);
                    // Revisa si la pila está vacía
                    boolean resultado = camisas.empty();
                    System.out.println("¿La pila está vacía? " + resultado);
                }

    }

}
