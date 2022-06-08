import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Sistema {
    public static void main(String[] args) {
        DateTimeFormatter hora = DateTimeFormatter.ofPattern("HH");
        DateTimeFormatter minuto = DateTimeFormatter.ofPattern("mm");
        String horarioHM = hora.format(LocalDateTime.now()) + minuto.format(LocalDateTime.now());
        Usuario usuario = new Usuario();
        System.out.println("Qual seu nome de login? ");
    	Scanner usuarioNome = new Scanner( System.in );
		String nomeUsuario = usuarioNome.next();
		System.out.println("Qual sua senha? ");
    	Scanner senha = new Scanner( System.in );
		String senhaUsuario = senha.next();
		int usuarioExistente = 0;
		
        for (int i = 0; i <= 1; i++) {
    		boolean respostaValidacao = usuario.validarUser(nomeUsuario, senhaUsuario, i);
    		if (respostaValidacao) {
    			usuarioExistente++;
    		}
        }
		if (usuarioExistente != 0) {
			if(Integer.parseInt(horarioHM) >= 600 && Integer.parseInt(horarioHM) <= 1159) {
				System.out.println("Bom dia, você se logou ao nosso sistema.");
			} 
			else if (Integer.parseInt(horarioHM) >= 1200 && Integer.parseInt(horarioHM) <= 1759) {
				System.out.println("Boa tarde, você se logou ao nosso sistema.");
			}
			else if(Integer.parseInt(horarioHM) >= 1800 && Integer.parseInt(horarioHM) < 2359) {
				System.out.println("Boa noite, você se logou ao nosso sistema.");
			}
			else {
				System.out.println("Bom madrugada, você se logou ao nosso sistema.");
			}


		}else {
			System.out.println("Usuário e/ou senha incorretos.");
		}
		
    }
}
