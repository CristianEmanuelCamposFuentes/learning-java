package Collections.Ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {

    public static void main(String[] args) {

        Map<String, String> persona = new HashMap<>();
        // Las llaves deben ser unicas, si se repite la clave se sobrescribe el valor
        persona.put(null, "Prueba");
        persona.put(null, "Prueba2");
        persona.put("nombre", "Juan");
        persona.put("nombre", "Javier");
        persona.put("apellidos", "Hernandez");
        persona.put("email", "javierhernandez");
        persona.put("edad", "30");
        System.out.println("persona = " + persona);

        System.out.println("persona.get(\"apellidos\") = " + persona.get("apellidos"));
        System.out.println("persona.get(\"email\") = " + persona.get("email"));

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
        Map<String, String> persona2 = new HashMap();
        persona2.put("nombre", "Cristian");
        persona2.put("apellidos", "Hernandez");
        persona2.put("email", "cristianhernandez");
        persona2.put("edad", "30");
        System.out.println("persona2 = " + persona2);

        // Iterar con Collection
        Collection<String> valores = persona2.values();
        for (String valor : valores) {
            System.out.println("valor = " + valor);
        }

        // Iterar con Map
        for (Map.Entry<String, String> entry : persona2.entrySet()) {
            System.out.println("entry.getKey() = " + entry.getKey());
            System.out.println("entry.getValue() = " + entry.getValue());
        }

        Set<String> llaves = persona2.keySet();
        for (String llave : llaves) {
            System.out.println("llave = " + llave);
        }

        for(Map.Entry<String, String> par: persona2.entrySet()){
            System.out.println(par.getKey() + " = " + par.getValue());
        }

        for (String llave: persona2.keySet()) {
            String valor = persona2.get(llave);
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