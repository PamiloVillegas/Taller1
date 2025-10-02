import java.util.function.Function;

import javax.swing.JOptionPane;

public class Jardin {
    public double calcularValorMatricula (){
        int edad = 2;
        boolean tieneHermano = true;
        Double valorAPagar = 0;
        switch (edad) {
            case 1:
                valorAPagar = 400000;
                break;
            case 2:
            case 3:
                valorAPagar = 500000;
                break;
            case 4: 
                valorAPagar = 600000;
                break;JOptionPane.showMessageDialog(, valorAPagar, null, edad);
            default:

        }
        if (tieneHermano) {
            
        }
    }

}

