import java.util.Scanner;

public class Principal {
	public static void main(String[]args) {
		System.out.println("Quantos funcionários deseja cadastrar?");
		Scanner numero = new Scanner( System.in );
		int numeroInt = numero.nextInt();
		Funcionario[] vetor = new Funcionario[numeroInt];
		
		for (int i = 0; i < numeroInt; i++) {
			
			Funcionario funcionario = new Funcionario();
			
			System.out.println("Insira o nome do seu funcionario " + (i+1));
			Scanner nome = new Scanner (System.in);
			
			funcionario.setNome(nome.nextLine());
			vetor[i] = funcionario;
			
			System.out.println("Insira o salario do seu funcionario " + (i+1));
			Scanner salario = new Scanner (System.in);
			
			vetor[i].setSalario(salario.nextDouble());
			vetor[i].setBonus(vetor[i].getSalario());
			vetor[i].setSalarioLiquido(vetor[i].getSalario() + vetor[i].getBonus());
		}
		
		for (int i = 0; i < numeroInt; i++) {
			System.out.println("Funcionário: " + vetor[i].getNome());
			System.out.println("Salário: " + vetor[i].getSalario());
			System.out.println("Bonus: " + vetor[i].getBonus());
			System.out.println("Salário Líquido: " + vetor[i].getSalarioLiquido());
			System.out.println("");
		}
	}
}