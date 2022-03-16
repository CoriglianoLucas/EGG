/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author corig
 */
public class Ej_26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //int m10[][] = new int[10][10];
        //int m3[][] = new int[3][3];
        boolean mat=false;
        
        int [][] m10 = {
            {1,26,36,47,5,6,72,81,95,10},
            {11,12,13,21,41,22,67,20,10,61},
            {56,78,87,90,9,90,17,12,87,67},
            {41,87,24,56,97,74,87,42,64,35},
            {32,76,79,1,36,5,67,96,12,11},
            {99,13,54,88,89,90,75,12,41,76},
            {67,78,87,45,14,22,26,42,56,78},
            {98,45,34,23,32,56,74,16,19,18},
            {24,67,97,46,87,13,67,89,93,24},
            {21,68,78,98,90,67,12,41,65,12}
        };
        int [][] m3 = {
            {36,5,67},
            {89,90,75},
            {14,22,26}
        };

        
        /*
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                m10[i][j] = (int) (Math.random()*2);
            }
        }
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                m3[i][j] = (int) (Math.random()*2);
            }
        }
        */
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" "+m10[i][j]+" ");               
            }
            System.out.println("");
        }
        System.out.println("");
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" "+m3[i][j]+" ");    
            }
            System.out.println("");
        }
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
               
                if (m10[i][j]==m3[0][0] && m10[i][j+1]==m3[0][1] && m10[i][j+2]==m3[0][2]) {
                    System.out.println("fila 1 igual");
                    if (m10[i+1][j]==m3[1][0] && m10[i+1][j+1]==m3[1][1] && m10[i+1][j+2]==m3[1][2]) {
                        System.out.println("fila 2 igual");
                        if (m10[i+2][j]==m3[2][0] && m10[i+2][j+1]==m3[2][1] && m10[i+2][j+2]==m3[2][2]) {
                            System.out.println("fila 3 igual");
                            mat = true;
                            System.out.println("se encontro en: "+i+","+j+" "+i+","+(j+1)+" "+i+","+(j+2)+" "+(i+1)+","+j+" "+(i+1)+","+(j+1)+" "+(i+1)+","+(j+2)+" "+(i+2)+","+j+" "+(i+2)+","+(j+1)+" "+(i+2)+","+(j+2)+" ");
                        }
                    }
                }
             
           
            }
        }
        
        
        if (mat==true) {
            System.out.println("Se encontro la matriz!");
        System.out.println("");
        
        } else {
            System.out.println("No se encontro la matriz");
        }
      
        
    }
    
}
