package com.garguir.models;

import java.util.ArrayList;
import java.util.List;

public class PersonList {

    private static final PersonsJson personListJson = new PersonsJson();
    private static final int QUANTITY = 50000000;
    private final List<Person> personList = new ArrayList<>(QUANTITY);

    public PersonList(){
        for(int i=0;i<QUANTITY;i++){
            this.personList.add(personListJson.getRandomPerson());
        }
    }
    public PersonList(int quantity){
        for(int i=0;i<quantity;i++){
            this.personList.add(personListJson.getRandomPerson());
            //System.out.println(this.personList.get(i));
        }
    }

    public PersonList(Person p){
        this.personList.add(p);
    }

    public void addPerson(Person p){
        this.personList.add(p);
    }

    public Person getLastPerson(){
        return this.personList.get(this.personList.size()-1);
    }

    public int getPersonsSize(){
        return this.personList.size();
    }

    public void listPersons(){
        this.personList.forEach(System.out::println);
    }

    public List<Person> getPersons() {
        return this.personList;
    }
    public Person getPerson(int i) {
        return this.personList.get(i);
    }

    public Person findPersonWhile(Person person){
        Person p;
        int i=0;
        while(i < this.personList.size()){
            p = this.personList.get(i);
            if(p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName())){
                return p;
            }
            i++;
        }
        return null;
    }

    public Person findPersonFor(Person person) {
        Person p;
        for(int i=0; i < this.personList.size();i++) {
            p = this.personList.get(i);
            if (p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                return p;
        }
        return null;
    }

    public Person findPersonEnhancedFor(Person person) {
        for (Person p : this.personList)
            if (p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                return p;

        return null;
    }

    public boolean findPersonWithStreamAnyMatch(Person person) {
        return this.personList.stream()
                .anyMatch(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()));
    }

    public Person findPersonWithStream(Person person) {
        return this.personList.stream()
                .filter(p -> p.getName().equals(person.getName()) && p.getLastName().equals(person.getLastName()))
                .findFirst()
                .orElse(null);
    }

    public String findStreet(char c){
        return this.personList.stream()
                .map(Person::getAddress)
                .map(Address::getStreetName)
                .filter(street -> street.charAt(0) == c)
                .findFirst()
                .orElse("");
    }

    public List<String> findStreets(char c){
        return this.personList.stream()
                .map(Person::getAddress)
                .map(Address::getStreetName)
                .filter(street -> street.charAt(0) == c)
                .toList();
    }    
}
