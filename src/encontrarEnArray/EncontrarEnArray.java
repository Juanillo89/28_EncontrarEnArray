package encontrarEnArray;

import java.util.Scanner;

public class EncontrarEnArray 
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		final int NUM_FILAS = 3;
		final int NUM_COLUMNAS = 2;
		int buscar;
		String respuesta;
		boolean encontrado;
		int[][] rectangulo = new int [NUM_FILAS][NUM_COLUMNAS];
		for(int fila = 0; fila < NUM_FILAS; fila++)
		{
			for(int col = 0; col < NUM_COLUMNAS; col++)
			{
				System.out.print("Fila " + (fila + 1) + " columna " + (col + 1) + ": ");				
				rectangulo[fila][col] = Integer.parseInt(sc.nextLine());
			}
		}
		
		do
		{
			System.out.println();
			for(int fila = 0; fila < NUM_FILAS; fila++)
			{
				for(int col = 0; col < NUM_COLUMNAS; col++)
				{
					System.out.print(rectangulo[fila][col] + "\t");
				} 
				System.out.print("\n\n");
			}
			encontrado = false;			
			System.out.print("Número a buscar: ");
			buscar = Integer.parseInt(sc.nextLine());
			encontrado = false;
			for(int fila = 0; fila < NUM_FILAS && !encontrado; fila++)
			{
				for(int col = 0; col < NUM_COLUMNAS && !encontrado; col++)
				{
					if(buscar == rectangulo[fila][col])
					{
						encontrado = true;
						System.out.println("Encontrado en la fila " + (fila + 1) + ", columna " + (col + 1) + ".");
					}
				}
			}
			if(!encontrado)
			{
				System.out.println("No encontrado.");		
			}
			System.out.print("¿Seguir buscando (s/n)?");
			respuesta = sc.nextLine();
		}
		while(respuesta.equals("s"));
		sc.close();
	}
}
