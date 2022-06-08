public class Funcionario {
	private String nome;
	private double salario;
	private double bonus;
	private double salarioLiquido;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public void setBonus(double salario) {
		if (salario <= 1000) {
			bonus = (salario * 0.2);
		}else if (salario > 1000 && salario < 2000 ) {
			bonus = (salario * 0.1);
		}else {
			bonus = (salario * 0.1);
			this.salarioLiquido -= bonus;
		}
	}
	
	public double getBonus() {
		return bonus;
	}
	
	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salarioLiquido) {
		if(this.salario < 2000) {
			this.salarioLiquido = salarioLiquido;
		}else {
			this.salarioLiquido = (this.salario - this.bonus);
		}
		
		
	}
}

