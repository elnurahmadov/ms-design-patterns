package az.ingress.abstract_factory.banking;

import az.ingress.abstract_factory.Developer;
import az.ingress.abstract_factory.ProductOwner;
import az.ingress.abstract_factory.ProjectTeamFactory;
import az.ingress.abstract_factory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProductOwner getProductOwner() {
        return new BankingPO();
    }
}
