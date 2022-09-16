package ejercicio5;

public class mainMatriz {
    public static void main(String[] args)
    {

        ejercicioMatriz mostrar = new ejercicioMatriz();
        mostrar.setFila(3);
        mostrar.setColumna(3);
        mostrar.setFila2(3);
        mostrar.setColumna2(3);

        System.out.println("su matriz tiene: "+mostrar.getFila()+" filas");
        System.out.println("su matriz tiene: "+mostrar.getColumna()+" columnas");
        System.out.println("su segunda matriz tiene: "+mostrar.getFila()+" filas");
        System.out.println("su segunda matriz tiene: "+mostrar.getColumna()+" columnas");

        mostrar.mostrarMatriz();
        mostrar.sumarMatriz();
        mostrar.multiplicarMatriz();
    }
}