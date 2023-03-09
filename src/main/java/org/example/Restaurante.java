package org.example;

public class Restaurante {
    public static void main(String[] args) {

        //voy con mi esposa a cenar a un restaurante.
        //Cada uno pide una cena:

        Comida comidaUno= new Comida();
        Entrada entrada = new Entrada("Sopa de esparragos",28000);
        comidaUno.setEntrada(entrada);
        PlatoFuerte platoFuerte= new PlatoFuerte("beef chorizo",55000);
        comidaUno.setPlatofuerte(platoFuerte);
        Bebida bebida =new Bebida("Vino tinto", 45000);
        comidaUno.setBebida(bebida);
        Postre postre= new Postre("tiramizu escarchado",34500);
        comidaUno.setPostre(postre);
        Integer costoComida1=comidaUno.calcularCostoComida();




        Comida comidaDos = new Comida();
        Entrada entrada1= new Entrada("muelas de cangrejo",30000);
        comidaDos.setEntrada(entrada1);
        PlatoFuerte platoFuerte1= new PlatoFuerte("pato a la naranja", 58000);
        comidaDos.setPlatofuerte(platoFuerte1);
        Bebida bebida1=new Bebida("Soda de miel y tamarindo",18500);
        comidaDos.setBebida(bebida1);
        Postre postre1= new Postre("volcan de ciruelas",22000);
        comidaDos.setPostre(postre1);
        Integer costoComida2=comidaDos.calcularCostoComida();


        System.out.println("El costo total de la cena para dos fue de: ");
        //PONGA ACA LA LINEA QUE PERMITA ENCONTRAR EL REUSLTADO
        Integer costoTotal = costoComida1+costoComida2;
        System.out.println(costoTotal);
    }
}