public class MetodoOrdenamiento {
    public void imprimeArreglo(String mensaje, int[] arreglo){
    System.out.println(mensaje);
    System.out.println(i < arreglo.length + "  "  )
    



    }

    public void saltoLinea() {
        System.out.printl("\n")
    }

    public static void main(String args[]){

    
    MetodoOrdenamiento objOrdena = new MetodoOrdenamiento();
    objOrdena.imprimeArreglo("Arreglo inicial: ", arreglo);
    objOrdena.saltoLinea();
    for (int i = 0; i < arreglo.length; i++)[{
        System.out.println("i = " + i);
        for (int j = 0; j < arreglo.length - 1; j++) {
            objOrdena.imprimeArreglo(" Arreglo comparamdo: ", arreglo);
            System.out.println(" <----- j = " + j + " -- " + arreglo[j] + " > " + arreglo[j + 1] + "?");
            if (arreglo[j] > arreglo[j + 1]) {
                System.out.println(" ------- Intercambia " + arreglo[j] + " con " + arreglo[j + 1]);
                



                objOrdena.imprimeArreglo(" Arreglo modificado: ", arreglo);
                objOrdena.saltoLinea();
            }
        }

    
    }
    
objOrdena.saltoLinea();
objOrdena.imprimeArreglo("Arreflo final: ", arreglo);

