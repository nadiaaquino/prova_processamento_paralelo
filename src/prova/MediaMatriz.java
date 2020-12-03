package prova;

public class MediaMatriz extends Thread{
    int inicio, termino;
        
    public MediaMatriz(int ini, int fim){
        inicio=ini;
        termino=fim;
    }
    
    public void run(){                        
        for (int i=inicio;i<termino;i++){
        		for(int j = 0; j < 100; j++) {
        			Main.Soma += Main.Matriz[i][j];
        		}
        }
        
        Main.Media = Main.Soma/(termino * 100);
    }
}
