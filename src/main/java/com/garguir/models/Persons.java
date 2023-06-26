package com.garguir.models;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    private static final int QUANTITY = 50000000;
    private static final PersonsJson personsJson = new PersonsJson();

    private List<Person> persons;

    public Persons(){
        this.persons = new ArrayList<>(QUANTITY);
        for(int i=0;i<QUANTITY;i++){
            this.persons.add(personsJson.getRandomPerson());
        }
    }
    public Persons(int quantity){
        this.persons = new ArrayList<>();
        for(int i=0;i<quantity;i++){
            this.persons.add(personsJson.getRandomPerson());
        }
    }

    public Persons(Person p){
        this.persons.add(p);
    }

    public void addPerson(Person p){
        this.persons.add(p);
    }

    public Person getLastPerson(){
        return this.persons.get(this.persons.size()-1);
    }

    public int getPersonsSize(){
        return this.persons.size();
    }

    public void listPersons(){
        this.persons.forEach(System.out::println);
    }

    public List<Person> getPersons() {
        return this.persons;
    }
    public Person getPerson(int i) {
        return this.persons.get(i);
    }

    public Person findPersonWhile(Person person){
        Person p;
        int i=0;
        while(i < this.persons.size()){
            p = this.persons.get(i);
            if(p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName())){
                return p;
            }
            i++;
        }
        return null;
    }

    public Person findPersonFor(Person person) {
        Person p;
        for(int i=0; i < this.persons.size();i++) {
            p = this.persons.get(i);
            if (p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                return p;
        }
        return null;
    }

    public Person findPersonEnhancedFor(Person person) {
        for (Person p : this.persons)
            if (p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                return p;

        return null;
    }

    public boolean findPersonWithStreamAnyMatch(Person person) {
        return this.persons.stream()
                .anyMatch(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()));
    }

    public Person findPersonWithStream(Person person) {
        return this.persons.stream()
                .filter(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                .findFirst()
                .orElse(null);
    }

    public String findStreet(char c){
        return this.persons.stream()
                .map(Person::getAddress)
                .map(Address::getStreetName)
                .filter(street -> street.charAt(0) == c)
                .findFirst()
                .orElse("");
    }

    public List<String> findStreets(char c){
        return this.persons.stream()
                .map(Person::getAddress)
                .map(Address::getStreetName)
                .filter(street -> street.charAt(0) == c)
                .toList();
    }
}
