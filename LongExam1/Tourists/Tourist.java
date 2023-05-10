package Tourists;

import Locations.Boracay;
import Locations.Locations;
import Locations.Masbate;
import Locations.Vigan;
import Locations.Palawan;
import Locations.Cebu;
import Locations.Davao;

public interface Tourist {

    int budget = 1000;

    void visit();

    void visit(Boracay boracay);

    void visit(Davao davao);

    void visit(Vigan vigan);

    void visit(Palawan palawan);

    void visit( Cebu cebu);

    void visit(Masbate masbate);

    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}