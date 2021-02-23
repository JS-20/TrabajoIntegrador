package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DNRPA {

    public static void main(String[] args) {
        // hago una lista de automotores que estan registrados en la DNRPA
        List<Automotor> automotores  = new ArrayList<>();
        // los automotores estan separados por secciones
        List<Seccional> seccionales = new ArrayList<>(Arrays.asList(
                new Seccional("seccional norte"),
                new Seccional("seccional sur"),
                new Seccional("seccional este"),
                new Seccional("seccional oeste")
        ));
         // en cada seccion hay automotores de distintos tipos.
            automotores.add(new AutoElectrico(""));
            automotores.add(new MotoElectrico(""));
            automotores.add(new AutomovilACombustible(""));
            automotores.add(new MotocicletaACombustible(""));
            automotores.add(new Colectivo(""));
            automotores.add(new Utilitarios(""));
            automotores.add(new Camiones(""));

         AutoElectrico autoElectrico1 = new AutoElectrico("toyota");
         AutoElectrico autoElectrico2 = new AutoElectrico("renault");
         AutoElectrico autoElectrico3 = new AutoElectrico("nissan");

         MotoElectrico motoElectrico1 = new MotoElectrico("scooter Niu NGT");
         MotoElectrico motoElectrico2 = new MotoElectrico("Vespa Elettrica L3");

         AutomovilACombustible automovilACombustible1 = new AutomovilACombustible("chevrolet");
         AutomovilACombustible automovilACombustible2 = new AutomovilACombustible("chevrolet");
         AutomovilACombustible automovilACombustible3 = new AutomovilACombustible("chevrolet");

         MotocicletaACombustible motocicletaACombustible1 = new MotocicletaACombustible("Yamaha");
         MotocicletaACombustible motocicletaACombustible2 = new MotocicletaACombustible("suzuki");
         MotocicletaACombustible motocicletaACombustible3 = new MotocicletaACombustible("Honda");

         Colectivo colectivo = new Colectivo("Mercedes Benz");
         Colectivo colectivo1 = new Colectivo("Marcopolo");
         Colectivo colectivo2 = new Colectivo("Metalpar");
         Colectivo colectivo3 = new Colectivo("metro");
         Colectivo colectivo4 = new Colectivo("Jac ");

         Utilitarios utilitarios = new Utilitarios("Ford");

         Camiones camiones1 = new Camiones("Volkswagen");
         Camiones camiones2 = new Camiones("Volvo");
         Camiones camiones3 = new Camiones("Iveco");
         Camiones camiones4 = new Camiones("scania");
         Camiones camiones5 = new Camiones("Volkswagen");
         Camiones camiones6 = new Camiones("Volvo");

        //* Todos los vehículos tienen un único propietario y autorizados a conducir.
        // De los propietarios y autorizados se sabe el nombre, DNI y dirección.
        // 1)Se desea poder listar todos los autos registrados en todas las seccionales.
        // 2)Se desea poder listar a todos los propietarios (en orden alfabético) de camiones.//*

          System.out.println("estos son toda los automotores de las seccionales: "+ automotores.size());
    }

}
