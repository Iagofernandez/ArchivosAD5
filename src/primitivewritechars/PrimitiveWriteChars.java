
package primitivewritechars;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class PrimitiveWriteChars {

   
    public static void main(String[] args) throws FileNotFoundException, IOException {
       // escritura 
        FileOutputStream escritura = null;
        BufferedOutputStream escrituraBuffer = null;
        DataOutputStream escrituraData = null;
        //lectura de los bytes recogidos
        //de un archivo Ouput 
        FileInputStream leer = null;
        BufferedInputStream leerBuffer = null;
        DataInputStream leerData = null;
       

        escritura = new FileOutputStream("/home/oracle/Desktop/Eje5/texto4.txt");
        escrituraBuffer = new BufferedOutputStream(escritura);
        escrituraData = new DataOutputStream(escrituraBuffer);

        leer = new FileInputStream("/home/oracle/Desktop/Eje5/texto4.txt");
        leerBuffer = new BufferedInputStream(leer);
        leerData = new DataInputStream(leerBuffer);

        //writeChars escribe 2 bytes por caracter ,
        
        String cadena = "o tempo está xélido";
        escrituraData.writeChars(cadena);
        escrituraData.writeChars(cadena);
        escrituraData.close();

        //readChar solo lee un caracter cada vez que se llama
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(leerData.readChar());

        }

        System.out.println("\n");

        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(leerData.readChar());

        }

      

    }

}
