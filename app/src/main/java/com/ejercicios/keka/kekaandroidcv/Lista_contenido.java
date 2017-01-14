package com.ejercicios.keka.kekaandroidcv;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Keka on 31/12/2016.
 */

public class Lista_contenido {
    /**
     * Donde se guardan las entradas de la lista.
     */
    public static ArrayList<Lista_entrada> ENTRADAS_LISTA = new ArrayList<Lista_entrada>();

    /**
     * Donde se asigna el identificador a cada entrada de la lista
     */
    public static Map<String, Lista_entrada> ENTRADAS_LISTA_HASHMAP = new HashMap<String, Lista_entrada>();

    /**
     * Creamos est�ticamente las entradas
     */
    static {
        aniadirEntrada(new Lista_entrada("0", R.mipmap.monchito, "Experiencia1", "Aqui iría el texto y la descripción de lo que sea"));
        aniadirEntrada(new Lista_entrada("1", R.mipmap.monchito, "Experiencia2","Segundo loquesea"));
        aniadirEntrada(new Lista_entrada("2", R.mipmap.monchito, "CUERVO", "El cuervo com�n (Corvus corax) es una especie de ave paseriforme de la familia de los c�rvidos (Corvidae). Presente en todo el hemisferio septentrional, es la especie de c�rvido con la mayor superficie de distribuci�n. Con el cuervo de pico grueso, es el mayor de los c�rvidos y probablemente la paseriforme m�s pesada; en su madurez, el cuervo com�n mide entre 52 y 69 cent�metros de longitud y su peso var�a de 0,69 a 1,7 kilogramos. Los cuervos comunes viven generalmente de 10 a 15 a�os pero algunos individuos han vivido 40 a�os. Los juveniles pueden desplazarse en grupos pero las parejas ya formadas permanecen juntas toda su vida, cada pareja defendiendo un territorio. Existen 8 subespecies conocidas que se diferencian muy poco aparentemente, aunque estudios recientes hayan demostrado diferencias gen�ticas significativas entre las poblaciones de distintas regiones."));
        aniadirEntrada(new Lista_entrada("3", R.mipmap.monchito, "FLAMENCO", "Los fenicopteriformes (Phoenicopteriformes), los cuales reciben el nombre vulgar de flamencos, son un orden de aves neognatas, con un �nico g�nero viviente: Phoenicopterus. Son aves que se distribuyen tanto por el hemisferio occidental como por el hemisferio oriental: existen cuatro especies en Am�rica y dos en el Viejo Mundo. Tienen cr�neo desmognato holorrino, con 16 a 20 v�rtebras cervicales y pies anisod�ctilos."));
        aniadirEntrada(new Lista_entrada("4", R.mipmap.monchito, "KIWI", "Los kiwis (Apterix, gr. 'sin alas') son un g�nero de aves paleognatas compuesto por cinco especies end�micas de Nueva Zelanda.1 2 Son aves no voladoras peque�as, aproximadamente del tama�o de una gallina. Antes de la llegada de los humanos alrededor del a�o 1300, en Nueva Zelanda los �nicos mam�feros que hab�a eran murci�lagos, y los nichos ecol�gicos que en otras partes del mundo eran ocupados por animales tan diversos como caballos, lobos y ratones fueron utilizados en Nueva Zelanda por p�jaros (y en menor proporci�n por ciertas especies de reptiles). La denominaci�n kiwi es maor�, idioma del pueblo hom�nimo de linaje malayopolinesio que coloniz� Nueva Zelanda antes de la llegada de los europeos."));
        aniadirEntrada(new Lista_entrada("5", R.mipmap.monchito, "LORO", "Las Psit�cidas (Psittacidae) son una familia de aves psitaciformes llamadas com�nmente loros o papagayos, e incluye a los guacamayos, las cotorras, los periquitos, los agapornis y formas afines."));
        aniadirEntrada(new Lista_entrada("6", R.mipmap.monchito, "PAVO", "Pavo es un g�nero de aves galliformes de la familia Phasianidae, que incluye dos especies, el pavo real com�n (Pavo cristatus) y el pavo real cuelliverde (Pavo muticus)."));
    }


    /** A�ade una entrada a la lista
     * @param entrada Elemento que a�adimos a la lista
     */
    private static void aniadirEntrada(Lista_entrada entrada) {
        ENTRADAS_LISTA.add(entrada);
        ENTRADAS_LISTA_HASHMAP.put(entrada.id, entrada);
    }

    /**
     * Representa una entrada del contenido de la lista
     */
    public static class Lista_entrada {
        public String id;
        public int idImagen;
        public String textoEncima;
        public String textoDebajo;

        public Lista_entrada (String id, int idImagen, String textoEncima, String textoDebajo) {
            this.id = id;
            this.idImagen = idImagen;
            this.textoEncima = textoEncima;
            this.textoDebajo = textoDebajo;
        }
    }

    public class ENTRADA_LISTA_HASMAP {

    }
}
