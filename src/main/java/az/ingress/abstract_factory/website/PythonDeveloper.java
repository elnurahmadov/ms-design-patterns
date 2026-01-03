package az.ingress.abstract_factory.website;

import az.ingress.abstract_factory.Developer;

public class PythonDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Python Developer write code");
    }

}
