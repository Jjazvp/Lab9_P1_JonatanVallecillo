package lab9_p1_jonatanvallecillo;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

public class Gusanito {
    Random rand = new Random();
    int x;
    int y;
    String [][] tablero;

    public Gusanito(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String [][] tablero(int x, int y){
        String [][] temporal = new String [y][x];
        int cantx = x;
        int canty = y;
        int mayor = 0;
        if (cantx > canty){
            mayor = cantx;
        }else{
            mayor = canty;
        }
        
        int posx = 0;
        int posy = 0;
        int posserpx = rand.nextInt(x - 0)+0;
        int posserpy = rand.nextInt(y - 0)+0;
        int posmanzx = rand.nextInt(x - 0)+0;
        int posmanzy = rand.nextInt(y - 0)+0;
        
        for (int i = 0; i < temporal.length; i++){
            for (int j = 0; j < temporal[i].length; j++){
                temporal[i][j] = "[  ]";
            }
        }
        
        while(mayor > 0){
            posx = rand.nextInt(x - 0)+0;
            posy = rand.nextInt(y - 0)+0;
            for (int i = 0; i < temporal.length; i++){
                for (int j = 0; j < temporal[i].length; j++){
                    if(i == posserpy && j == posserpx){
                        temporal[i][j] = "[s]";
                    }else if (i == posmanzy && posmanzx == j){
                        temporal[i][j] = "[ó]";
                    }else if(i == posy && j == posx){
                        temporal[i][j] = "[#]";
                    }
                }
            }
            mayor -= 1;
        }
        return temporal;
    }

    public Gusanito(String[][] tablero) {
        this.tablero = tablero;
    }
    
    public int imprimir(String [][] tablero){
        int opcion;
        String [][] matriz = tablero;
        String cadena = "";
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                cadena += matriz[i][j];
            }
            cadena += "\n";
        }
        opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "Mapa\n"+cadena+"\n1. Ingresar instruccion\n2. Ejecutar instrucciones"));
        return opcion;
    }
    
    public String imprimir2(String [][] tablero){
        String direccion = "";
        String [][] matriz = tablero;
        String cadena = "";
        int posserpx = 0;
        int posserpy = 0;
        int alto = 0;
        int ancho = 0;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[i].length; j++){
                cadena += matriz[i][j];
                if (matriz[i][j] == "[s]"){
                    posserpy = i;
                    posserpx = j;
                }
                ancho = j;
            }
            cadena += "\n";
            alto = i;
        }
        
        char correcto = 's';
        while (correcto == 's'){
            direccion = JOptionPane.showInputDialog(null, "Mapa\n"+cadena+"\nIngrese la instruccion:");
            if (((direccion.charAt(1) == 'u' || direccion.charAt(1) == 'U')
                    && (direccion.charAt(2) == 'p' || direccion.charAt(2) == 'P')) ||
                    ((direccion.charAt(1) == 'd' || direccion.charAt(1) == 'D')
                    && (direccion.charAt(2) == 'n' || direccion.charAt(2) == 'N')) ||
                    ((direccion.charAt(1) == 'r' || direccion.charAt(1) == 'R')
                    && (direccion.charAt(2) == 't' || direccion.charAt(2) == 'T')) ||
                    ((direccion.charAt(1) == 'l' || direccion.charAt(1) == 'L')
                    && (direccion.charAt(2) == 't' || direccion.charAt(2) == 'T'))
                    && (posserpy < alto && posserpx < ancho)){
                correcto = 'n';
            }else{
                JOptionPane.showMessageDialog(null, "No ingreso valores validos");
            }
            
        }
        return direccion;
    }
    
    ArrayList<String> lista;

    public Gusanito(ArrayList<String> lista) {
        this.lista = lista;
    }
    
    public ArrayList<String> Arraylist(ArrayList<String> Lista){
        ArrayList<String> temporal = Lista;
        int numero = 0;
        String direccion = "";
        
        
        for(int i = 0; i < temporal.size(); i++){
            direccion = temporal.get(i);
            for(int j = 0; j < direccion.length(); j++){
                numero = direccion.charAt(0);
                
            }
        }
        return temporal;
    }
}
