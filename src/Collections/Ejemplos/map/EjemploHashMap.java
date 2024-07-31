package Collections.Ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, Object> persona = new HashMap<>();
        // Las llaves deben ser unicas, si se repite la clave se sobrescribe el valor
        persona.put(null, "Prueba");
        persona.put(null, "Prueba2");
        persona.put("nombre", "Juan");
        persona.put("nombre", "Javier");
        persona.put("apellidos", "Hernandez");
        persona.put("email", "javierhernandez");
        persona.put("edad", "30");
        System.out.println("persona = " + persona);

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "Argentina");
        direccion.put("estado", "Cordoba");
        direccion.put("ciudad", "Bell Ville");
        direccion.put("calle", "Calle 1");
        direccion.put("numero", "1055");
        persona.put("direccion", direccion);
        System.out.println("persona = " + persona);

        Map<String, String> direccionPersona  = (Map<String, String>) persona.get("direccion");
        System.out.println("direccionPersona = " + direccionPersona);

        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "Sin barrio");

        System.out.println("La persona vive en " + pais + ", " + ciudad + ", " + barrio);
        // Algunos metodos importantes
        System.out.println("Values = " + persona.values());
        System.out.println("Keys = " + persona.keySet());
        System.out.println("EntrySet = " + persona.entrySet());

        System.out.println("persona.containsKey(\"email\") = " + persona.containsKey("email"));
        System.out.println("persona.containsValue(\"Prueba\") = " + persona.containsValue("Prueba"));

        System.out.println("persona.size() = " + persona.size());

        // Eliminamos un elemento
        persona.remove("email");
        System.out.println("persona = " + persona);

        // Eliminamos todos los elementos
        persona.clear();
        System.out.println("persona = " + persona);

        System.out.println("persona.isEmpty() = " + persona.isEmpty());

        // Nueva persona con nuevos datos de prueba
        Map<String, Object> persona2 = new HashMap();
        persona2.put("nombre", "Cristian");
        persona2.put("apellidos", "Hernandez");
        persona2.put("email", "cristianhernandez");
        persona2.put("edad", "30");
        System.out.println("persona2 = " + persona2);

        // Iterar con Collection
        Collection<Object> valores = persona2.values();
        for (Object valor : valores) {
            System.out.println("valor = " + valor);
        }

        // Iterar con Map
        for (Map.Entry<String, Object> entry : persona2.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        Set<String> llaves = persona2.keySet();
        for (String llave : llaves) {
            System.out.println("llave = " + llave);
        }

        for(Map.Entry<String, Object> par: persona2.entrySet()){
            System.out.println(par.getKey() + " = " + par.getValue());
        }

        for (String llave: persona2.keySet()) {
            Object valor = persona2.get(llave);
            System.out.println("llave = " + llave + ", valor = " + valor);
        }

        System.out.println("Iterar con forEach");
        persona2.forEach((llave, valor) -> System.out.println("llave = " + llave + ", valor = " + valor));

        System.out.println("Total de elementos = " + persona2.size());
        System.out.println("Contiene elementos? = " + !persona2.isEmpty());

        // Modificar elementos
        persona2.replace("email", "cristianhernandez2");
        System.out.println("persona2 = " + persona2);

        persona2.replace("email", "cristianhernandez", "nuevoemail2");
        System.out.println("persona2 = " + persona2);
    }
}