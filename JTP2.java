/* try: Este bloco contém o código que pode potencialmente lançar uma exceção. 
Neste caso, estamos tentando dividir um número por zero, 
o que resultará em uma ArithmeticException.
catch (ArithmeticException e): Este bloco é executado se e somente se uma ArithmeticException 
for lançada no bloco try. Ele captura a exceção e imprime uma mensagem para o usuário.
finally: Este bloco é sempre executado, independentemente de uma exceção ser lançada ou não. 
É geralmente usado para limpeza de recursos, como fechar conexões de banco de dados. 
Neste caso, estamos apenas imprimindo uma mensagem para o usuário.
*/
public class JTP2 {

    public static void main(String[] args) {
        try {
            System.out.println("Ei! Estamos dentro do bloco de tentativa agroa");
            // O trecho de código abaixo nos lançará a exceção aritmética
            System.out.println(84 / 0);
        } catch (ArithmeticException e) {
           // O trecho de código abaixo capturará a exceção aritmética que é levantada 
           System.out.println("Ei, codificador, a pegadinha: exceção foi manejada.");
    }finally{
        // No caso abaixo do trecho de código Java, estamos anotando que a execução do programa será executada sempre.
        System.out.println("Ei! codificador, finalmente: eu sempre sou executao!"); 
        }
    }
}