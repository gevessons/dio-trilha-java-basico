public class Operações {
    public static void main(String[] args) throws Exception {

        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }

        if(condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira");
        }

        if(condicao1 && (7 > 4)){
            System.out.println("As condições são verdadeiras");
        }
        
        System.out.println("fim");
    }
}
