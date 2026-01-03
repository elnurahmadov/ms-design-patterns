package az.ingress.factory;

import static az.ingress.factory.ProgrammingLanguage.JAVA;

public class Software {
    public static void main(String[] args) {
        var developerFactory = createDeveloperFactoryByLanguage(JAVA); // hard code because there is no input value
        var developer = developerFactory.createDeveloper();
        developer.writeCode();
    }

    private static DeveloperFactory createDeveloperFactoryByLanguage(ProgrammingLanguage language) {
        return switch (language) {
            case JAVA -> new JavaDeveloperFactory();
            case KOTLIN -> new KotlinDeveloperFactory();
        };
    }
}
