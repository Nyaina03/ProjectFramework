package verifier;

import etu001956.framework.ModelView;
import etu001956.framework.annotation.*;
import verifier.AnnotationVerifier;
import etu001956.test_framework.Emp;

public class AnnotationVerifierTest {

    public static void main(String[] args) {
        AnnotationVerifier verifier = new AnnotationVerifier();
        String expectedUrl = "/url3";

        ModelView result = verifier.checkMethods(Emp.class, expectedUrl);

        // Vérification manuelle sans utiliser les assertions de JUnit
        if (result != null) {
            if (result.getViewUrl().equals(expectedUrl)) {
                System.out.println("Le test a réussi.");
            } else {
                System.out.println("Erreur : L'URL de la vue ne correspond pas.");
            }
        } else {
            System.out.println("Erreur : Aucun modèle retourné par la vérification des méthodes.");
        }
    }
}
