package az.ingress.abstract_factory.website;

import az.ingress.abstract_factory.Developer;
import az.ingress.abstract_factory.ProductOwner;
import az.ingress.abstract_factory.ProjectTeamFactory;
import az.ingress.abstract_factory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PythonDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new WebsitePO();
    }
}
