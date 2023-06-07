package com.garguir;

import com.garguir.models.Person;
import com.garguir.models.Persons;

import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger("Efficiency Control");
    public static final int QUANTITY = 19000000;

    public static final String DOUBLE_LINE = "========================================================================================================================================================================";

    public static final String SIMPLE_LINE = "------------------------------------------------------------------------------------";


    public static void main(String[] args) {
        LOGGER.info("Efficiency Control");

        Person person;
        for (int i = 0; i < 3; i++){
            Persons personsWhile = new Persons(QUANTITY);
            Persons personsFor = new Persons(QUANTITY);
            Persons personsEnhancedFor = new Persons(QUANTITY);
            Persons personsLamdaAnyMatch = new Persons(QUANTITY);
            Persons personsLamda = new Persons(QUANTITY);

            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);
            System.out.println("Iteration " + (i + 1));
            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);

            // select a random number for concat with name to search
            int randomNumber = (int)(Math. random()*QUANTITY+1);
            //int randomNumber = QUANTITY-1;

            // Run find method with While

            //person = personsWhile.getLastPerson();
            person = personsWhile.getPerson(randomNumber);
            System.out.println("Searching: " + person);
            long startTimeHSWhile = System.currentTimeMillis();
            Person personWhile = personsWhile.findPersonWhile(person);
            if (personWhile!=null) {
                System.out.print("Find with While in ");
            } else {
                System.out.print("Not found with While in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSWhile + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(person);
            System.out.println("Persona encontrada: ");
            System.out.println(personWhile);
            System.out.println(DOUBLE_LINE);


            // Run find method with for

            //person = personsFor.getLastPerson();
            person = personsFor.getPerson(randomNumber);
            System.out.println("Searching: " + person);
            long startTimeHS = System.currentTimeMillis();
            Person personFor = personsFor.findPersonFor(person);
            if (personFor!=null) {
                System.out.print("Find with For in ");
            } else {
                System.out.print("Not found with For in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHS + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(person);
            System.out.println("Persona encontrada: ");
            System.out.println(personFor);
            System.out.println(DOUBLE_LINE);


            // Run find method with enhanced for

            //person = personsEnhancedFor.getLastPerson();
            person = personsEnhancedFor.getPerson(randomNumber);
            System.out.println("Searching: " + person);
            long startTimeHSEnhancedFor = System.currentTimeMillis();
            Person personEnhancedFor = personsEnhancedFor.findPersonEnhancedFor(person);
            if (personEnhancedFor!=null) {
                System.out.print("Find with Enhanced For in ");
            } else {
                System.out.print("Not found with Enhanced For in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSEnhancedFor + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(person);
            System.out.println("Persona encontrada: ");
            System.out.println(personEnhancedFor);
            System.out.println(DOUBLE_LINE);


            // Run find method with lamda anyMatch

            //person = personsLamdaAnyMatch.getLastPerson();
            person = personsLamdaAnyMatch.getPerson(randomNumber);
            System.out.println("Searching: " + person);
            long startTimeHSLamdaAnyMatch = System.currentTimeMillis();
            boolean foundIt = personsLamdaAnyMatch.findPersonWithLambdaAnyMatch(person);
            if (foundIt) {
                System.out.print("Find with lamdaAnyMatch in ");
            } else {
                System.out.print("Not found with lamdaAnyMatch in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamdaAnyMatch + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(person);
            System.out.println("Persona encontrada?: "+foundIt);
            System.out.println(DOUBLE_LINE);

            // Run find method with lamda

            //person = personsLamda.getLastPerson();
            person = personsLamda.getPerson(randomNumber);
            System.out.println("Searching: " + person);
            long startTimeHSLamda = System.currentTimeMillis();
            Person personStream = personsLamda.findPersonWithLambda(person);
            if (personStream!=null) {
                System.out.print("Find with lamda in ");
            } else {
                System.out.print("Not found with lamda in ");
            }
            System.out.println(System.currentTimeMillis() - startTimeHSLamda + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(person);
            System.out.println("Persona encontrada: ");
            System.out.println(personStream);
            System.out.println(DOUBLE_LINE);
        }
    }
}