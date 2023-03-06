public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        Carro suvFlex = new Carro("SUV", TipoCombustivel.FLEX, 8, 65);

        

        System.out.println("Tipos de veiculos:");
        System.out.println(basico);

        // System.out.println("\n\n----------------");
        // System.out.println("\nAbastencendo carro basico com gasolina");
        // basico.abastece(TipoCombustivel.GASOLINA, 55);
        // System.out.println(basico);
        // System.out.println("\nViajando com o carro basico");
        // basico.viaja(250);
        // basico.viaja(150);
        // System.out.println(basico);

        System.out.println("==========================================================================================================================================");
    
        System.out.println(esportivo + "\n");

        esportivo.abastece(TipoCombustivel.GASOLINA, 999);
        System.out.println("Abastecendo o carro " + esportivo.getModelo() + " com " + esportivo.getCombustivelDisponivel() + "L\n");
        System.out.println("Indo para a Europa com o carro " + esportivo.getModelo() + "\n");

        esportivo.viaja(70);
        esportivo.viaja(80);

        System.out.println(esportivo);

        System.out.println("==========================================================================================================================================");
        System.out.println(utilitario + "\n");

        utilitario.abastece(TipoCombustivel.DIESEL, 999);
        System.out.println("Abastecendo o carro " + utilitario.getModelo() + " com " + utilitario.getCombustivelDisponivel() + "L");
        System.out.println("Indo para a praia com o carro " + utilitario.getModelo());

        utilitario.viaja(110);
        utilitario.viaja(111);

        System.out.println(utilitario);

        System.out.println("==========================================================================================================================================");
        System.out.println(suv + "\n");

        suv.abastece(TipoCombustivel.FLEX, 999);
        System.out.println("Abastecendo o carro " + suv.getModelo() + " com " + suv.getCombustivelDisponivel() + "L\n");
        System.out.println("Indo para o Azerbaijão com o carro " + suv.getModelo() + "\n");

        suv.viaja(220);
        suv.viaja(46);

        System.out.println(suv);

        System.out.println("==========================================================================================================================================");
        System.out.println(suvFlex + "\n");
    }
}
