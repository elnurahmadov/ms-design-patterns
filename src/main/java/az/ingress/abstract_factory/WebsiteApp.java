package az.ingress.abstract_factory;

import az.ingress.abstract_factory.website.WebsiteTeamFactory;

public class WebsiteApp {
    public static void main(String[] args) {
        var projectTeamFactory = new WebsiteTeamFactory();
        var developer = projectTeamFactory.getDeveloper();
        var tester = projectTeamFactory.getTester();
        var po = projectTeamFactory.getProductOwner();

        System.out.println("Building website application");

        developer.writeCode();
        tester.testCode();
        po.manageProduct();
    }
}
