package Tourists;


import Locations.*;

public class Lukban implements Tourist {

    static int budget = 1000;


    public void visit() {
        System.out.print("Enjoying my travel");
    }

    public void visit(Vigan vigan) {
        System.out.println("My budget is " + getBudget());

        if ( budget >= vigan.airFare  ){
            System.out.println("I will go to vigan" );
            budget -= vigan.airFare;
            checkBudget();
        }else{
            System.out.println(" My budget is not enough" );
            budget = 0;
        }

     

    }

    public void visit(Cebu cebu) {

        if(budget >cebu.airFare){
            System.out.println("I will eat lechon in Cebu");
            budget -= cebu.airFare;
            checkBudget();
        }else{
            System.out.println("My budget is not enough");
            budget = 0;
        }

        
    }
    public void visit(Davao davao) {
        if(budget >davao.airFare){
            System.out.println("I will eat lots of durian in Davao");
            budget -= davao.airFare;
            checkBudget();
        }else{
            System.out.println("My budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Palawan palawan) {
        if(budget >palawan.airFare){
            System.out.println("Im finally here palawan!");
            budget -= palawan.airFare;
            checkBudget();
        }else{
            System.out.println("My budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Masbate masbate) {
        if(budget >masbate.airFare){
            System.out.println("I will go to my girlfriend here in Masbate");
            budget -= masbate.airFare;
            
            checkBudget();
        }else{
            System.out.println("My budget is not enough");
            budget = 0;
        }

        
    }

    public void visit(Boracay boracay) {
        if(budget >boracay.airFare){
            System.out.println("Boracay I'm back!");
            budget -= boracay.airFare;

            checkBudget();
        }else{
            System.out.println("My budget is not enough");
            budget = 0;
        }

       
    }

    public void checkBudget() {
        System.out.println("my budget is " + budget);
    }

    public static int getBudget() {
        return budget;
    }


}