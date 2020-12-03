package prova;

public class AcimaMedia extends Thread{
    int inicio, termino;
        
    public AcimaMedia(int ini, int fim){
        inicio=ini;
        termino=fim;
    }
    
    public void run(){                        
        for (int i=inicio;i<termino;i++){
        		for(int j = 0; j < 100; j++) {
        			if(Main.Matriz[i][j] > Main.Media) {
        				Main.AcimaDaMedia++;
        			}else{
        				if(Main.Matriz[i][j] == Main.Media) {
        					Main.MediaExata++;
        				}
        			}
        		}
        }
    }
}