package lab9_p1_jonatanvallecillo;

import java.util.ArrayList;
import javax.swing.JOptionPane;
//fila 3, silla 12
public class Lab9_P1_JonatanVallecillo {

    public static void main(String[] args) {
        Menu menu = new Menu();
        /*char submenu = 's';
        while (submenu == 's' || submenu == 'S'){
            menu.setVisible(true);
            menu.setLocationRelativeTo(null);
            int opciones = menu.getOpcion();
                if (opciones == 1){*/
                    int x = 0; 
                    int y = 0;
                    int opcion = 0;
                    String direccion = "";
                    ArrayList<String> instrucciones = new ArrayList<String>();

                    Gusanito gusanito = new Gusanito (x, y);

                    char correcto = 's';
                    while (correcto == 's' || correcto == 'S'){
                        x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el ancho: "));
                        y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el alto: "));
                        if (x > 3 && y > 3 && x < 10 && y < 10){
                            correcto = 'n';
                        }else{
                            JOptionPane.showMessageDialog(null, "No ingreso un valor valido");
                        }
                    }

                    String [][] tablero = gusanito.tablero(x, y);

                    correcto = 's';


                    while (correcto == 's' || correcto == 'S'){
                        opcion = gusanito.imprimir(tablero);
                        if(opcion == 1){
                            instrucciones.add(gusanito.imprimir2(tablero));
                        }else if (opcion == 2){
                            String cad = "";
                            for(int i = 0; i < instrucciones.size(); i++){
                                for(int j = 0; j < instrucciones.size(); j++){
                                    cad += instrucciones.get(i)+" ";
                                }
                            }
                            JOptionPane.showMessageDialog(null, cad);
                            correcto = 'n';
                        }else{
                            JOptionPane.showMessageDialog(null, "Ingreso un valor invalido");
                        }
                    } 
                /*}else{
                    submenu = 'n';
            }
        }*/
    }    
}
