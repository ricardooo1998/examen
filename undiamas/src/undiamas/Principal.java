package undiamas;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// dada una fecha correcta dar un d�a m�s
		int dia, mes, anyo;
		System.out.println("introduzca el d�a");
		Scanner sc=new Scanner(System.in);
		dia=sc.nextInt();
		System.out.println("introduzca el mes");
		mes=sc.nextInt();
		System.out.println("introduzca el a�o");
		anyo=sc.nextInt();
		if (dia>=1 && dia<=30)
		{
			if(mes>=1 && mes<=12)
			{
				if (anyo>=0)
				{
					System.out.println("La fecha es correcta");
					dia++;
					if (dia==31)
					{
						dia=1;
						mes++;
						if (mes==13)
						{
							mes=1;
							anyo++;
						}
					}
					System.out.println("La fecha con un d�a m�s es: "+dia+"/"+mes+"/"+anyo);
				}
				else
				{
					System.out.println("La fecha es incorrecta, el a�o no puede ser negativo");
				}
			}
			else
			{
				System.out.println("La fecha es incorrecta, el mes debe estar entre 1 y 12");
			}
		}
		else
		{
			System.out.println("La fecha es incorrecta, el d�a debe estar entre 1 y 30");
		}
	}

}
