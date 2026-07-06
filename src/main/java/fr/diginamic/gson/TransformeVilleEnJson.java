package fr.diginamic.gson;

import com.google.gson.Gson;

public class TransformeVilleEnJson {

        public static void main(String[] args) {
            Gson gson = new Gson();
            Personne p = new Personne("DURAND",25); // Objet simple

            String json = gson.toJson(p);  // Conversion en JSON
            System.out.println(json);
        }
    }