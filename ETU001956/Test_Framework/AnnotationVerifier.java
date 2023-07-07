package verifier;
import etu001956.framework.annotation.Url;
import etu001956.framework.ModelView;

public class AnnotationVerifier {

public ModelView checkMethods(Class<?> clazz, String url) {
    ModelView modelView = null;

    // Vérifier les méthodes annotées dans la classe
    for (java.lang.reflect.Method method : clazz.getDeclaredMethods()) {
        if (method.isAnnotationPresent(Url.class)) {
            Url urlAnnotation = method.getAnnotation(Url.class);
            String methodUrl = urlAnnotation.value();

            if (methodUrl.equals(url)) {
                // Si l'URL correspond, créer un objet ModelView
                modelView = new ModelView("Données du modèle", url);
                break;
            }
        }
    }

    return modelView;
}

}
