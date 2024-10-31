public class TiposVariaveis {
    public static void main(String[] args) throws Exception {

        String nomeUm = "GEVESSON";
        String nomeDois = new String("GEVESSON");

        System.out.println(nomeUm == nomeDois); // COMPARAÇÃO ENTRE VARIAVEIS
        System.out.println(nomeUm.equals(nomeDois)); // COMPARAÇÃO ENTRE OBJETOS E STRING


        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println(simNao);

        simNao = numero1 != numero2;
        System.out.println(simNao);
        
        simNao = numero1 > numero2;
        System.out.println(simNao);
    
    }
}
