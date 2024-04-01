public class Main {
    public static void main(String[] args) {

        /*Uzduotis 01
        WHILE LOOP

        1. Atspausdinkite savo varda tiek kartu,
                kiek jusu varde yra simboliu.
        Zodzio ilgiui nustatyti naudokite metoda length().

        2. Atspausdinkite kas trecia skaiciu seka
        didejancia tvarka nuo 220 iki 300.

        3. Atspausdinkite skaicius, kurie dalinasi is triju.
                Skaiciu intervalas nuo 0 iki 99.*/

        //1-----------
        String vardas = "Evaldas";
        int ilgis = vardas.length();
        System.out.println(ilgis);
        while(ilgis > 0){
            System.out.println("Evaldas");
            ilgis--;
        }
        System.out.println();

        //2-----------
        int x = 220;
        int y = 300;
        int z = x;
        while (z < y){
            System.out.println(z);
            z += 3;
        }
        System.out.println();

        //3-----------
        x = 0;
        y = 99;
        z = x + 1;
        while (z < y){
            if ( z%3 == 0 ) System.out.println(z);
            z++;
        }
        System.out.println();

        /*Uzduotis 02
        DO WHILE LOOP

        1. Atspausdinkite sios savaites diena
        tiek kartu, kiek zodyje yra simboliu.
                Zodzio ilgiui nustatyti naudokite metoda.

        2. Atspausdinkite kas penkta skaiciu seka
        mazejancia tvarka nuo -1 iki -150.

        3. Atspausdinkite skaicius, kurie dalinasi
        is keturiu. Skaiciu intervalas nuo 1 iki 200.*/

        //1-----------
        String diena = "Ketvirtadienis";
        int ilgisDiena = diena.length();
        do{
            System.out.println("Ketvirtadienis");
            ilgisDiena--;
        } while(ilgisDiena > 0);
        System.out.println();

        //2-----------
        x = -1;
        y = -150;
        z = x;
        do{
            System.out.println(z);
            z -= 5;
        } while(z > y);
        System.out.println();

        //3-----------
        x = 1;
        y = 200;
        z = x;
        do{
            if ( z%4 == 0 ) System.out.println(z);
            z++;
        } while(z < y);
        System.out.println();


        /*Uzduotis 03
        FOR LOOP

        1. Atspausdinkite sio menesio pavadinima
        tiek kartu, kiek zodyje yra simboliu.
                Zodzio ilgiui nustatyti naudokite metoda.

        2. Atspausdinkite kas antra skaiciu seka
        mazejancia tvarka nuo -50 iki -100.

        3. Atspausdinkite skaicius, kurie dalinasi
        is penkiu. Skaiciu intervalas nuo 50 iki 250.
        Jei skaiciaus gale yra 0, atspausdinktite "Bingo"
        vietoj sio skaiciaus reiksmes.

        4.  Atspausdinkite zodi "Nebeprisikiškiakopūsteliaujantiesiems" sekanciai:
        a. kiekivena raide atskirai
        b. po tris raides atskirai*/

        //1-----------
        String sisMenuo = "Kovas";
        for (int i = 0; i < sisMenuo.length(); i++){
            System.out.println(sisMenuo);
        }
        System.out.println();

        //2-----------
        for (int i = -50; i > -100; i -= 2){
            System.out.println(i);
        }
        System.out.println();

        //3-----------
        for ( int i = 50; i < 250; i++ ){
            if (i%10 == 0){
                System.out.println("Bingo");
            } else if(i%5 == 0){
                System.out.println(i);
            }
        }
        System.out.println();

        //4-----------
        String ilgasZodis = "Nebeprisikiškiakopūsteliaujantiesiems";
        for (int i = 0; i < ilgasZodis.length(); i++){
            System.out.println(ilgasZodis.charAt(i));
        }
        System.out.println();

        int liekaSimboliu = ilgasZodis.length() % 3;
        for (int i = 0; i < ilgasZodis.length() - liekaSimboliu; i += 3){
            System.out.println(ilgasZodis.substring(i,i+3));
        }
        if (liekaSimboliu == 1){
            System.out.println(ilgasZodis.substring(ilgasZodis.length()-1));
        }else if (liekaSimboliu == 2) {
            System.out.printf(ilgasZodis.substring(ilgasZodis.length()-2),ilgasZodis.length()+1);
        }
    }
}