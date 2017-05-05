
public class Main {
	public static void main(String[] args) {
		Funcionario umFuncionario = new Funcionario(Funcionario.DESENVOLVEDOR,
				2100, 1);
		System.out.println(umFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionario = new Funcionario(Funcionario.DBA,
				1700, 2);
		System.out.println(outroFuncionario.calcularGratificacao());
		
		Funcionario outroFuncionarioLider = new Funcionario(Funcionario.LIDER,
				2200, 1);
		System.out.println(outroFuncionarioLider.calcularGratificacao());
		
		Funcionario outroFuncionarioGerente = new Funcionario(Funcionario.GERENTE,
				2500, 2);
		System.out.println(outroFuncionarioGerente.calcularGratificacao());
	}
}