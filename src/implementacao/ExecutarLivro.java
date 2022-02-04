package implementacao;

import java.util.Scanner;

import beans.Livro;

public class ExecutarLivro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Iniciando!!");
		
		Livro uml1 = new Livro();
		
		uml1.titulo = "Aprendendo java UML";
		uml1.editora = "Books Editora";
		uml1.numPagina = 100;
		uml1.preco = 150.01;
		uml1.edicao = 2;
		
		System.out.println("Dados do livro");
		System.out.println("Titulo: " + uml1.titulo);
		System.out.println("Preco: " + uml1.preco);
		
		Livro uml2 = new Livro();
		
		Scanner leitor = new Scanner(System.in);
		
		System.out.println("Digite o Titulo:");
		uml2.titulo = leitor.nextLine();
		System.out.println("Digite a Editora");
		uml2.editora = leitor.nextLine();
		
	

	}

}
