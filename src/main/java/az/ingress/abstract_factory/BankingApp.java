package az.ingress.abstract_factory;

import az.ingress.abstract_factory.banking.BankingTeamFactory;

public class BankingApp {
    public static void main(String[] args) {
        var projectTeamFactory = new BankingTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Building banking application");

        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }
}
