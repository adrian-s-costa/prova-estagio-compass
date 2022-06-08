
public class Pergunta {
	private String[] pergunta = {"Qual o ponto mais alto da terra?", "Qual a primeira programadora mulher?"
			, "Qual o famoso matematico considerado pai da computacao?"};
	
	private String[] alternativa1 = {"a) Cristo Redentor", "a) Ada Lovelace", "a) Robert Noice"};
	private String[] alternativa2 = {"b) Mont Python", "b) Joan Clarke", "b) Alan Turing"};
	private String[] alternativa3 = {"c) Monte Everest", "c) Grace Hooper", "c) Mark Zuckenberg"};
	private String[] alternativa4 = {"d) Pao de Acucar", "d) Ruth Teitelbaum", "d) Steve Jobs"};
	private String[] altCorreta = {"c", "a", "b"};
	public static int corretas = 0;
	public static int erradas = 0;
	
	public String getPergunta( int indice) {
		return pergunta[indice];
	}
	public String getAlternativa1(int indice) {
		return alternativa1[indice];
	}
	public String getAlternativa2(int indice) {
		return alternativa2[indice];
	}
	public String getAlternativa3(int indice) {
		return alternativa3[indice];
	}
	public String getAlternativa4(int indice) {
		return alternativa4[indice];
	}
	public int getCorretas() {
		return Pergunta.corretas;
	}
	public int getErradas() {
		return Pergunta.erradas;
	}
	
	public String validarResposta(String resposta, int indice) {
		if(this.altCorreta[indice].equals(resposta)) {
			Pergunta.corretas++;
			return "Acertou! Boa!";
		}
		Pergunta.erradas++;
		return "..nao foi dessa vez amigo, errou";
	}
	
}

