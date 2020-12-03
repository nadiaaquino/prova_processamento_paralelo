package prova;

public class AbaixoMedia extends Thread{
	int inicio, termino;
    
    public AbaixoMedia(int ini, int fim){
        inicio=ini;
        termino=fim;
    }
    
    public void run(){                        
        for (int i=inicio;i<termino;i++){
        		for(int j = 0; j < 100; j++) {
        			if(Main.Matriz[i][j] < Main.Media) {
        				Main.AbaixoDaMedia++;
        			}
        		}
        }
    }
}
