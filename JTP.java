/*Um bloco é uma das práticas mais úteis do setor no campo de TI. 
Durante o ciclo de desenvolvimento do projeto de TI, haverá a necessidade de criar e 
manter algum código necessário. Essas linhas essenciais de código devem ser colocadas 
no bloco try para rotulá-las como código limpo, por exemplo, o fechamento do arquivo no 
projeto desenvolvido ou o fechamento da conexão estabelecida.

Finalmente, o bloco é amplamente utilizado em três casos, 
e eles são discutidos abaixo com código relevante na linguagem de programação java.

Caso 1: Quando uma exceção não sobe
*/
public class JTP{
    public static void main(String[] args){
        try{
            System.out.println("Ei! Estamos dentro do bloco de tenntativa agora");
            //o trecho de código abaixo não nos lançará nenhun tipo de exceção.
            System.out.println(84/2);
        }catch(ArithmeticException e){
            System.out.println("Ei programador, é uma exceção aritmética");
        } finally{
            System.out.println("Ei programador, finalmente: eu sempre sou executado!");
        }
    }
}
