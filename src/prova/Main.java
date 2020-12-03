package prova;
import java.util.Random;

public class Main {

	public static int[][] Matriz;
	public static int Soma = 0;
	public static int Media = 0;
	public static int AcimaDaMedia = 0;
	public static int AbaixoDaMedia = 0;
	public static int MediaExata = 0;
	
	 public static void main(String[] args) throws InterruptedException {
		 
		 Matriz = new int[100][100];
		 
		 alimentaMatriz();
		
		 MediaMatriz t1 = new MediaMatriz(0, 50);
		 MediaMatriz t2 = new MediaMatriz(50, 100);
		 
		 t1.start();
		 t1.join();
		 
		 t2.start();
		 t2.join();
		 
		 AcimaMedia t3 = new AcimaMedia(0, 50);
		 AcimaMedia t4 = new AcimaMedia(50, 100);
		 
		 t3.start();
		 t3.join();
		 
		 t4.start();
		 t4.join();
		 
		 AbaixoMedia t5 = new AbaixoMedia(0, 50);
		 AbaixoMedia t6 = new AbaixoMedia(50, 100);
		 
		 t5.start();
		 t5.join();
		 
		 t6.start();
		 t6.join();
		 
		 System.out.println("Soma Matriz: " + Soma);
		 System.out.println("Média dos valores: " + Media);
		 System.out.println("Quantidade acima da média: " + AcimaDaMedia);
		 System.out.println("Quantidade abaixo da média: " + AbaixoDaMedia);
		 System.out.println("Quantidade Exatamente na média: " + MediaExata);
	}
	 
	 private static void alimentaMatriz() {
		 Random r;
		 r = new Random();
		 
		 for (int i=0;i<100;i++){
     		for(int j = 0; j < 100; j++) {
     			Main.Matriz[i][j] = r.nextInt(5001);
     		}
		 }
	 }
}
