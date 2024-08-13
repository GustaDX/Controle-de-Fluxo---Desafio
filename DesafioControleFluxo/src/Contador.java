import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
        int parametroDois = terminal.nextInt();
		terminal.close();
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
            
		
		}catch (ParametrosInvalidosException exception) {

		}
		
	}
    static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
        if (parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        else{
            int contagem = parametroDois - parametroUm;
            for( ; contagem >1; ){
                parametroDois = parametroDois -1;
                contagem = contagem -1;
                System.err.println(parametroDois);

            }
        }
	}
}