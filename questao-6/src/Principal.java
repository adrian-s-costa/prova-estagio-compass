import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Pergunta p1 = new Pergunta();
		
		Scanner usuario = new Scanner( System.in );
		System.out.println("Qual seu nome? ");
		String nomeusuario = usuario.next();
		System.out.println("");
		
		
		Scanner comeco = new Scanner( System.in );
		System.out.println("Podemos comecar? ");
		String comecar = comeco.next();
		System.out.println("");
		
		for (int i = 0; i <= 2; i++) {
		
		Pergunta p = new Pergunta();
		System.out.println(p.getPergunta(i));
		System.out.println("");
		System.out.println(p.getAlternativa1(i));
		System.out.println(p.getAlternativa2(i));
		System.out.println(p.getAlternativa3(i));
		System.out.println(p.getAlternativa4(i));
		System.out.println("");
		
		Scanner resposta = new Scanner( System.in );
		System.out.println("responda com a alternativa: ");
		String respostaAlt = resposta.next();
		System.out.println(p.validarResposta(respostaAlt, i));
		Scanner continuar = new Scanner( System.in );
		System.out.println("Vamo pra proxima? ");
		String continuando = comeco.next();
		System.out.println("");
		
		}
		System.out.println("");
		System.out.println("Resultado Final: ");
		System.out.println(nomeusuario);
		System.out.println("Certas: " + p1.getCorretas());
		System.out.println("Erradas: " + p1.getErradas());
	}

}
