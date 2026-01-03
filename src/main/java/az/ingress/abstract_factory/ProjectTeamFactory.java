package az.ingress.abstract_factory;

public interface ProjectTeamFactory {
    Developer getDeveloper();
    Tester getTester();
    ProductOwner getProductOwner();
}
