package com.garguir.models;

import java.util.ArrayList;
import java.util.List;

public class Persons {

    private static PersonsJson personsJson = new PersonsJson();

    private List<Person> persons = new ArrayList<>();

    public Persons() {

    }

    public Persons(int quantity){
        for(int i=0;i<quantity;i++){
            this.persons.add(personsJson.getRandomPerson());
            //System.out.println(this.persons.get(i));
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

    public boolean findPersonWithLambdaAnyMatch(Person person) {
        return this.persons.stream()
                .anyMatch(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()));
    }

    public Person findPersonWithLambda(Person person) {
        return this.persons.stream()
                .filter(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                .findFirst()
                .orElse(null);
    }
}
