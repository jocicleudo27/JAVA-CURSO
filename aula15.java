//import java.util.*;
//import java.lang.*;
public class aula15 {
    /*public enum Day
    {
        Sun, Mon, Twe, Wed, Thu, Fri, Sat
    }*/

    public static void main(String[] args) {
       /*
        char a = 'G';
        int i = 89;
        byte b = 4;
        short s = 56;
        double d = 4.355453532;
        float f = 47333434f;
        long l =12121;

        System.out.println("char: " + a);
        System.out.println("integer: " + i);
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("float:" + f);
        System.out.println("double: " + d);
        System.out.println("long: " + l);
        System.out.println("geeksforGeeks");
        */
        /*
        float f = 20.25f;
        System.out.println("f= " + f);

        double d = 20.75;
        System.out.println("d=" + d);
         */
        /*
        char ch = 'S';
        System.out.println(ch);

        char ch2 = '&';
        System.out.println(ch2);

        char ch3 = '$';
        System.out.println(ch3);
        */
       
        /*
        boolean t = true;
        System.out.println(t);

        boolean f = false;
        System.out.println(f);
        */
        /*
        System.out.println("PRIMITIVE DATA TYPES\n");
        int x = 10;
        int y = x;
        System.out.print("Initially: ");
        System.out.println("x = " + x + ", y = " + y);

        y = 30;

        System.out.print("After changing y to 30: ");
        System.out.println("x = " + x + ", y = " + y);
        System.out.println(
            "**Only value of y is affected here "
            + "because of Primitive Data Type\n");
        System.out.println("REFERENCE DATA TYPES\n");
        int[] c = { 10, 20, 30, 40 };

        int[] d = c;

        System.out.println("Initially");
        System.out.println("Array c: " + Arrays.toString(c));
        System.out.println("Array d:" + Arrays.toString(d));

        System.out.println("\nModifying the value at "
        + "index 1 to 50 in array d\n");
        d[1] = 50;

        System.out.println("After modification");
        System.out.println("Array c: "
        + Arrays.toString(c));
        System.out.println("Array d: "
        + Arrays.toString(d));
        System.out.println("**Here value of c[1] is also affectde "
        + "because of Reference Data Type\n");
    */
    //convertendo tipo de dados float para int
    /*float f = 10.5f;
    int a = (int) f;
    System.out.println(f);
    System.out.println(a);
    */

    //exemplo de variavel Java: Estouro
    /*
    int a = 130;
    byte b = (byte)a;
    System.out.println(a);
    System.out.println(b);
    */
    //Neste código, você está tentando converter um valor int
    //para um byte. O intervalo de valores que um byte pode
    //armazenar é de -128 a 127. Quando você tenta armazenar o
    //valor int 130 em um byte, ocorre um estouro.
    //Portanto, quando você faz o typecast de 130 para um byte
    //ele “estoura” de volta para o início do intervalo de byte, resultando em -126.
    /*
    byte a = 10;
    byte b = 10;
    byte c =(byte)(a + b);
    System.out.println(c);
    */
    
    /*
    int a = 10;
    int b = 5;
    int c = 20;
    System.out.println(a < b & a < c );
    System.out.println(a < b & a < c);
    */
    //O operador lógico && não verifica a segunda condição se a primeira condição for false. 
    //Ele verifica a segunda condição somente se a primeira for verdadeira.
    //O operador & bit a bit sempre verifica ambas as condições se a primeira condição é verdadeira ou falsa.

    /*
    int a = 2;
    int b = 5;
    int min = (a < b) ? a : b;
    System.out.println(min);
    */
    //Portanto, na expressão int min=(a<b)?a:b, min recebe o valor de a se a for menor que b, 
    //caso contrário, recebe o valor de b. O operador ':' É que diz caso contrario.
    
    /*
    int a = 10;
    int b = 20;
    a+= 4;
    b-=4;
    System.out.println(a);
    System.out.println(b);
    */
    //a +=4 a = a + 4(a = 10+4)
    //b -=4 b = b-4(b = 20-4)
    
    /*
    int a = 10;
    a+=3;
    System.out.println(a);
    a-=4;
    System.out.println(a);
    a*=2;
    System.out.println(a);
    a/=2;
    System.out.println(a);
    */
    
    /*
    int x = 10;
    int y = 12;
    if(x+y > 20){
        System.out.println("x + y e maior que 20");
    }
    */

    /*
    int x = 10;
    int y = 12;
    if(x+y < 10){
        System.out.println("x + y e menor que 10");
    }else{
        System.out.println("x + y e maior que 20");
    }
    */

    /*
    String cidade = "Delhi";
    if(cidade.equals("Meerut")){
        System.out.println("cidade e Merrut");
    }else if (cidade.equals("Noida")) {
        System.out.println("cidade e Noida");
    }else if (cidade.equals("Agra")) {
        System.out.println("cidade e Agra");
    }else{
        System.out.println(cidade);
    }
    */

    /*
    String address = "Delhi, India";
    if (address.endsWith("India")) {
        if (address.contains("Meerut")) {
            System.out.println("Sua cidade e Meerut");
        } else if (address.contains("Noida")) {
            System.out.println("Sua cidade e Noida");
        } else {
            System.out.println(address.split(",")[0]);
        }
    } else {
        System.out.println("Voce nao vive na India");
    }
    */
    //neste code a variavel address = "Delhi, India" o primeiro if
    //.endsWith verifica se a string termina com India e no segundo if
    //.contains verifica se a string "Delhi, India" contem a string Meerut.

    /*
    int num = 2;
    switch (num) {
        case 0:
            System.out.println("number is 0");
            break;
        case 1:
            System.out.println("number is 1");
            break;
        default:
            System.out.println(num);
            break;
    }
    */
    //PROGRAMA PARA SOMAR OS 10 PRIMEIROS NUMEROS NATURAIS.
    /*
    int sum = 0;
    for(int j = 1; j < 10; j++)
    sum = sum + j;
    {
        System.out.println("A soma dos 10 primeiros nymeros naturais e " + sum);
    }
    */

    //LOOP FOR-EACH
    /*
    String[] names = {"Java","C","C++","Python","JavaScript"};
    System.out.println("Printing o conteudo do array names:\n");
    for(String name:names){
        System.out.println(name);
    }
    */
    //escreva um programa que imprima os cinco primeiros numeros pares.
    /*
    int i = 0 ;
    System.out.println("imprimindo a lista dos 10 primeiros numeros pares\n");
    while (i <= 10) {
        System.out.println(i);
        i = i +2;
    }
    */
    /*
    int i = 0;
    System.out.println("imprimndo a lista dos primeiros 10 numeros pares \n");
    do{
        System.out.println(i);
        i = i + 2;
    }while(i <= 20);
    */

    //este programa imprimi os numeros de 0 a 10 mas como tenho
    //um if(i == 6) se condição for verdadeira a intrução break
    //é executada terminando o loop. E os numeros de 7 a 10 não são impressos.
    /*
    for(int i = 0 ; i < 10; i++){
        System.out.println(i);
        if(i == 6)
        break;
    }
    */
    //Este é um exemplo de código Java que usa rótulos e a instrução break.
    //a: for(int i = 0; i <= 10; i++)  Este é um loop for rotulado como a 
    //que começa com i = 0 e continua até i ser maior que 10, incrementando i em 1 a cada iteração.
    //b: for(int j = 0; j <= 15; j++)  Este é um loop for rotulado como b 
    //que começa com j = 0 e continua até j ser maior que 15, incrementando j em 1 a cada iteração.
    //c: for(int k = 0; k <= 20; k++)  Este é um loop for rotulado como c 
    //que começa com k = 0 e continua até k ser maior que 20, incrementando k em 1 a cada iteração.
    //System.out.println(k);: Esta linha imprime o valor atual de k na saída padrão.
    //if(k == 5) { break a; }: Esta é uma instrução if que verifica se k é igual a 5. 
    //Se for verdade, a instrução break a é executada. A instrução break a interrompe o loop for 
    //mais interno rotulado como a, então o programa sai do loop a.
    /*
    a:
    for(int i = 0; i<= 10; i++){
        b:
        for(int j = 0; j <= 15; j++){
            c:
            for(int k = 0; k<= 20; k++){
                System.out.println(k);
                if(k == 5){
                    break a;
                }
            }
        }
    }
    */
    /*
    for(int i = 0; i <= 2; i++){
        for(int j = i; j <= 5; j++){
            if (j == 4) {
                continue;
            }
            System.out.println(j);
        }
    }
    */
    // a instrução continue não quebra o loop, enquanto que ela ignora a parte específica do loop 
    //e salta para a próxima iteração do loop imediatamente.

   /*
    int idade = 20;
    //verificando a idade.
    if(idade > 18){
        System.out.println("a condicao e verdadeira");
        System.out.println("A idade e maior que 18");
    }else{
        System.out.println("a condicao é falsa");
        System.out.println("A idade é menor que 18");
    }
    */
    /*
    //programa de número ímpar e par.
    int numeros = 13;
    //verifica se o número é divisivel por 2 ou não.
    if (numeros %2 == 0 ) {
        System.out.println("número par");
    }else{
        System.out.println("número ímpar");
    }
    */
    //programa para saber se um ano é bissexto, 
    //se for divisivel por 4 e 400. e não por 100. 
    /*
    int ano = 2020;
    if (((ano %4 == 0)&&(ano %100 != 0)) ||(ano %400 == 0)) {
        System.out.println("Ano bissexto");
    }else{
        System.out.println("Ano comum");
    }
    */

    //Usando operador ternario. 
    /*
    int numeros = 13;
    String output = (numeros %2 == 0) ? "numeros par" : "numeros ímpar";
    System.out.println(output);
    */
    //temos uma variável chamada output. Esta variável receberá um valor com base no resultado de uma operação 
    //específica. Se a variável numeros for dividida por 2 e o resto dessa divisão for 0 (ou seja, se numeros for um número par), 
    //então a variável output receberá a string "numeros par.
    //se o resto da divisão de numeros por 2 não for 0 (ou seja, se numeros for um número ímpar), 
    //então a variável output receberá a string "numeros ímpar".

    /*
    int marcas = 10;
    if (marcas < 50) {
        System.out.println("falhar");
    }
    else if (marcas >= 50 && marcas < 60) {
        System.out.println("Grau D");
        }
        else if (marcas >= 60 && marcas < 70) {
            System.out.println("Grau C");
        }
        else if (marcas >= 70 && marcas < 80) {
            System.out.println("Grau B");
        }
        else if (marcas>= 80 && marcas < 90) {
            System.out.println("Grau A");
        }else if (marcas >= 90 && marcas < 100) {
            System.out.println("Grau A+");
        }else{
            System.out.println("Invalido!");
        }
        */
        //Ex Positivos e Negativos.
        /*
        int numeros = -13;
        if (numeros > 0) {
            System.out.println("POSITIVOS");
        }else if (numeros < 0) {
            System.out.println("NEGATIVOS");
        }else{
            System.out.println("ZERO");
        }
        */
    /*
    int idade=20;
    int peso =30;
    //condição de aplicação na idade e peso  
    if(idade>=18){
    if(peso>50){
    System.out.println("Você é elegível para doar sangue");
        }else{
            System.out.println("vai engorda gata seca");
        }    
    }    
      */
      
    //codigo verifica a idade e peso. com if aninhado.
    /*
    int idade = 25;
    int peso = 68;

    if (idade >= 18) {
        if (peso > 50) {
            System.out.println("Você é elegível para doar sangue");
        }else{
            System.out.println("Você não é elegível para doar sangue");
        }
        }else{
        System.out.println("A idade deve ser maior que 18");
        }
        */

        /*
        int numeros = 30;
        //alternar expressão
        switch (numeros) {
            case 10:
                System.out.println("10");
                break;
            case 20:
                System.out.println("20");
                break;
            case 30:
                System.out.println("30");
                break;
            default:
                System.out.println("Não em 10, 20 ou 30");
                break;
        }
        */
        /*
        int mes = 4;
        String monthString = "";
        switch (mes) {
            case 1:
                monthString = "1 - Janeiro";
                break;
            case 2: 
                monthString="2 - fevereiro";
                break;    
            case 3: monthString="3 - março";
                break;    
            case 4: monthString="4 - abril";
                break;    
            case 5: monthString="5 - maio";
                break;    
            case 6: monthString="6 - junho";
                break;    
            case 7: monthString="7 - julho";
                break;    
            case 8: monthString="8 - agosto";
                break;    
            case 9: monthString="9 - setembro";
                break;    
            case 10: monthString="10 - outubro";
                break;    
            case 11: monthString="11 - novembro";
                break;    
            case 12: monthString="12 - dezembro";
                break;   
            default:
                monthString="Valor inválido";
                break;
        }
        System.out.println(monthString);
        */

        /*Um switch aninhado é quando você tem um switch dentro de outro switch. 
        O switch externo está verificando o valor da variável collegeYear. 
        Dependendo do ano da faculdade, ele entra em um caso específico.
        Dentro de alguns desses casos (2º, 3º e 4º ano), 
        há outro switch que verifica a variável branch. (ramo de estudo). 
        Dependendo do ramo, ele imprime as disciplinas relevantes para aquele ano e ramo específicos. */
        /*
        char branch = 'M';               
        int collegeYear = 4;
        switch( collegeYear )
        {
            case 1:
                System.out.println("English, Maths, Science");
                break;
            case 2:
                switch( branch ) 
                {
                    case 'C':
                        System.out.println("Operating System, Java, Data Structure");
                        break;
                    case 'E':
                        System.out.println("Micro processors, Logic switching theory");
                        break;
                    case 'M':
                        System.out.println("Drawing, Manufacturing Machines");
                        break;
                }
                break;
            case 3:
                switch( branch ) 
                {
                    case 'C':
                        System.out.println("Computer Organization, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Fundamentals of Logic Design, Microelectronics");
                        break;
                    case 'M':
                        System.out.println("Internal Combustion Engines, Mechanical Vibration");
                        break;
                }
                break;
            case 4:
                switch( branch ) 
                {
                    case 'C':
                        System.out.println("Data Communication and Networks, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Embedded System, Image Processing");
                        break;
                    case 'M':
                        System.out.println("Production Technology, Thermal Engineering");
                        break;
                }
                break;
        }
        */
        /*
    Day[] DayNow = Day.values();
        for(Day Now : DayNow)
        {
            switch (Now) {
                case Sun:
                    {
                        System.out.println("Sunday");
                        break;
                    }
                case Mon:
                    {
                        System.out.println("Monday");
                        break;
                    }
                case Twe:
                    {
                        System.out.println("Twesday");
                        break;
                    }
                case Wed:
                    {
                        System.out.println("Wednesday");
                        break;
                    }
                case Thu:
                    {
                        System.out.println("Thursday");
                        break;
                    }
                case Fri:
                    {
                        System.out.println("Friday");
                        break;
                    }
                case Sat:
                    {
                        System.out.println("Saturday");
                        break;
                    }
            }
        }
        */
    /*
    Integer age = 65;
    switch (age) {
        case 16:
            System.out.println("Você tem menos de 18 anos");
            break;
        case 18:
            System.out.println("Você está apto a votar");
            break;
        case 65:
            System.out.println("O voto é facultativo");
            break;
        default:
        System.out.println("Por favor, indique a idade válida.");
        break;
    }
    */

    //Exp: Piramide para exercitar o cotrole da struc for.
    /*
    for(int i = 1; i <= 5; i++){
        for(int j = 1; j <= i; j++){
            System.out.print("* ");
        }
        System.out.println();
    } 
   */

    //Exp: Piramide
    /*
    int termo = 6;
    for(int i = 1; i <= termo; i++){
        for(int j = termo; j >= i; j--){
            System.out.print("* ");
        }
        System.out.println();
    }
    */

    //Exp: ForEch.
    /*
    int arr[] = {12, 23, 44, 56, 78};
    for (int i : arr) {
        System.out.println(i);
    }
    */

    //Exp: While
    /*int i = 1;
    while (i <= 10) {
        System.out.println(i);
        i++;
    } */

    //DoWhileExample
    /*int i = 1;
    do {
        System.out.println(i);
        i++;
    } while (i <= 8); */
    
    //BreakExample
    /*for(int i = 1; i <= 10; i++){
        if (i == 5) {
            break;
        }
        System.out.println(i);
    } */

    //Instrução Java Break com loop interno
    /*for(int i = 1; i <= 3; i++){
        for(int j = 1; j <= 3; j++){
            if (i == 2 && j == 2) {
                break;
            }
            System.out.println(i+" "+j);
        }
    } */
    //for(int i = 1; i <= 3; i++): Este é o loop externo que itera a variável i de 1 a 3.
    //for(int j = 1; j <= 3; j++): Este é o loop interno que itera a variável j de 1 a 3 para cada valor de i.
    //if (i == 2 && j == 2) { break; }: Esta condição verifica se i e j são ambos iguais a 2. Se forem, o loop interno é interrompido.
    //System.out.println(i+" "+j);: Esta linha imprime o valor atual de i e j.
    
    /*Aa:
    for(int i = 1; i <= 3; i++){
        Bb:
        for(int j = 1; j <= 3; j++){
            if(i == 2 && j== 2){
            break Aa;
        }
        System.out.println(i+ " " +j);
        }
        
    } */

    
    
}

}