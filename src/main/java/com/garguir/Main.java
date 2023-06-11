package com.garguir;

import com.garguir.models.Person;
import com.garguir.models.Persons;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class Main {

    private static final Logger LOGGER = Logger.getLogger("Efficiency Control");
    public static final int QUANTITY = 19000000;
    public static final int X = 3;

    public static final String DOUBLE_LINE = "========================================================================================================================================================================";

    public static final String SIMPLE_LINE = "------------------------------------------------------------------------------------";


    public static void main(String[] args) {
        LOGGER.info("Efficiency Control");
        int randomNumber;
        long startTime;
        Person person;
        Person personToSearch = new Person();
        List<String> streets = new ArrayList<>(10);
        Persons testStreets = new Persons(200);
        streets = testStreets.findStreets('1');
        streets.forEach(System.out::println);
        /*
        for (int i = 0; i < X; i++){
            Persons personsWhile = new Persons(QUANTITY);
            Persons personsFor = new Persons(QUANTITY);
            Persons personsEnhancedFor = new Persons(QUANTITY);
            Persons personsStreamAnyMatch = new Persons(QUANTITY);
            Persons personsStream = new Persons(QUANTITY);

            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);
            System.out.println("Iteration " + (i + 1));
            System.out.println(SIMPLE_LINE);
            System.out.println(SIMPLE_LINE);

            // select a random number for concat with name to search
            randomNumber = (int)(Math. random()*QUANTITY+1);
            //randomNumber = QUANTITY-1;

            // Run find method with While

            //person = personsWhile.getLastPerson();
            person = personsWhile.getPerson(randomNumber);
            personToSearch.setLastName(person.getLastName());
            personToSearch.setName((i==X-1)?person.getName()+1:person.getName());
            System.out.println("Searching: " + person);
            startTime = System.currentTimeMillis();
            Person personWhile = personsWhile.findPersonWhile(personToSearch);
            if (personWhile!=null) {
                System.out.print("Find with While in ");
            } else {
                System.out.print("Not found with While in ");
            }
            System.out.println(System.currentTimeMillis() - startTime + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(personToSearch);
            System.out.println("Persona encontrada: ");
            System.out.println(personWhile);
            System.out.println(DOUBLE_LINE);


            // Run find method with for

            //person = personsFor.getLastPerson();
            person = personsFor.getPerson(randomNumber);
            personToSearch.setLastName(person.getLastName());
            personToSearch.setName((i==X-1)?person.getName()+1:person.getName());
            System.out.println("Searching: " + person);
            startTime = System.currentTimeMillis();
            Person personFor = personsFor.findPersonFor(personToSearch);
            if (personFor!=null) {
                System.out.print("Find with For in ");
            } else {
                System.out.print("Not found with For in ");
            }
            System.out.println(System.currentTimeMillis() - startTime + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(personToSearch);
            System.out.println("Persona encontrada: ");
            System.out.println(personFor);
            System.out.println(DOUBLE_LINE);


            // Run find method with enhanced for

            //person = personsEnhancedFor.getLastPerson();
            person = personsEnhancedFor.getPerson(randomNumber);
            personToSearch.setLastName(person.getLastName());
            personToSearch.setName((i==X-1)?person.getName()+1:person.getName());
            System.out.println("Searching: " + person);
            startTime = System.currentTimeMillis();
            Person personEnhancedFor = personsEnhancedFor.findPersonEnhancedFor(personToSearch);
            if (personEnhancedFor!=null) {
                System.out.print("Find with Enhanced For in ");
            } else {
                System.out.print("Not found with Enhanced For in ");
            }
            System.out.println(System.currentTimeMillis() - startTime + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(personToSearch);
            System.out.println("Persona encontrada: ");
            System.out.println(personEnhancedFor);
            System.out.println(DOUBLE_LINE);


            // Run find method with lamda anyMatch

            //person = personsLamdaAnyMatch.getLastPerson();
            person = personsStreamAnyMatch.getPerson(randomNumber);
            personToSearch.setLastName(person.getLastName());
            personToSearch.setName((i==X-1)?person.getName()+1:person.getName());
            System.out.println("Searching: " + person);
            startTime = System.currentTimeMillis();
            boolean foundIt = personsStreamAnyMatch.findPersonWithStreamAnyMatch(personToSearch);
            if (foundIt) {
                System.out.print("Find with lamdaAnyMatch in ");
            } else {
                System.out.print("Not found with lamdaAnyMatch in ");
            }
            System.out.println(System.currentTimeMillis() - startTime + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(personToSearch);
            System.out.println("Persona encontrada?: "+foundIt);
            System.out.println(DOUBLE_LINE);

            // Run find method with lamda

            //person = personsStream.getLastPerson();
            person = personsStream.getPerson(randomNumber);
            personToSearch.setLastName(person.getLastName());
            personToSearch.setName((i==X-1)?person.getName()+1:person.getName());
            System.out.println("Searching: " + person);
            startTime = System.currentTimeMillis();
            Person personStream = personsStream.findPersonWithStream(personToSearch);
            if (personStream!=null) {
                System.out.print("Find with lamda in ");
            } else {
                System.out.print("Not found with lamda in ");
            }
            System.out.println(System.currentTimeMillis() - startTime + "ms");
            System.out.println("Persona buscada en posición: " + randomNumber);
            System.out.println(personToSearch);
            System.out.println("Persona encontrada: ");
            System.out.println(personStream);
            System.out.println(DOUBLE_LINE);
        }
         */
    }
}