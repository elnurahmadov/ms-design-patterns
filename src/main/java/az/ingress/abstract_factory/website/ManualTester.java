package az.ingress.abstract_factory.website;

import az.ingress.abstract_factory.Tester;

public class ManualTester implements Tester {
    @Override
    public void testCode() {
        System.out.println("Manual Tester test code");
    }
}
