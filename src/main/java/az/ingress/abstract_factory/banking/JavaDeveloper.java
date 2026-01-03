package az.ingress.abstract_factory.banking;

import az.ingress.abstract_factory.Developer;

public class JavaDeveloper implements Developer {

    @Override
    public void writeCode() {
        System.out.println("Java Developer write code");
    }

}
