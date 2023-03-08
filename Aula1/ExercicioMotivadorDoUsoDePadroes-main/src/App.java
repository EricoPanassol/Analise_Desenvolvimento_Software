public class App {
    public static void main(String[] args) throws Exception {

        Carro basico = new Carro("Basico", TipoCombustivel.GASOLINA, 10, 55);
        Carro esportivo = new Carro("Esportivo", TipoCombustivel.GASOLINA, 6, 45);
        Carro utilitario = new Carro("Utilitário", TipoCombustivel.DIESEL, 5, 70);
        Carro suv = new Carro("SUV", TipoCombustivel.FLEX, 8, 55);
        
     

        
        System.out.println("==========================================================================================================================================\n");
        System.out.println("Tipos de veiculos:");
        System.out.println("==========================================================================================================================================\n");

        System.out.println(basico);

        System.out.println(basico + "\n");

        basico.abastece(TipoCombustivel.GASOLINA, 999);
        System.out.println("Abastecendo o carro " + basico.getModelo() + " com " + basico.getCombustivelDisponivel() + "L\n");
        System.out.println("Indo para Salto do Itararé com o carro " + basico.getModelo() + "\n");

        basico.viaja(15);
        basico.viaja(32);

        System.out.println(basico);
       

        System.out.println("==========================================================================================================================================\n");
    
        System.out.println(esportivo + "\n");

        esportivo.abastece(TipoCombustivel.GASOLINA, 999);
        System.out.println("Abastecendo o carro " + esportivo.getModelo() + " com " + esportivo.getCombustivelDisponivel() + "L\n");
        System.out.println("Indo para a Europa com o carro " + esportivo.getModelo() + "\n");

        esportivo.viaja(70);
        esportivo.viaja(80);

        System.out.println(esportivo);

        System.out.println("==========================================================================================================================================\n");
        System.out.println(utilitario + "\n");

        utilitario.abastece(TipoCombustivel.DIESEL, 999);
        System.out.println("Abastecendo o carro " + utilitario.getModelo() + " com " + utilitario.getCombustivelDisponivel() + "L");
        System.out.println("Indo para a praia com o carro " + utilitario.getModelo());

        utilitario.viaja(110);
        utilitario.viaja(111);

        System.out.println(utilitario);

        System.out.println("==========================================================================================================================================\n");
        System.out.println(suv + "\n");

        suv.abastece(TipoCombustivel.FLEX, 999);
        System.out.println("Abastecendo o carro " + suv.getModelo() + " com " + suv.getCombustivelDisponivel() + "L\n");
        System.out.println("Indo para o Azerbaijão com o carro " + suv.getModelo() + "\n");

        suv.viaja(220);
        suv.viaja(46);

        System.out.println(suv);

        System.out.println("==========================================================================================================================================\n");
        // System.out.println(suvFlex + "\n");

        // suvFlex.abastece(TipoCombustivel.GASOLINA, 999);
        // System.out.println("Abastecendo o carro " + suvFlex.getModelo() + " com " + suvFlex.getCombustivelDisponivel() + "L\n");
        // System.out.println("Indo para o Azerbaijão com o carro " + suvFlex.getModelo() + "\n");

        // suvFlex.viaja(220);
        // suvFlex.viaja(46);

        // System.out.println(suvFlex);
    }
}
