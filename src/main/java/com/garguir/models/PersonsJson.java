package com.garguir.models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PersonsJson {
    private static String PATH_RESOURCES = System.getProperty("user.dir")+"/src/main/resources";
    private static String PATH_PERSONS = "/persons.json";

    private List<Person> personList = new ArrayList<>();

    public PersonsJson(){
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader(PATH_RESOURCES+PATH_PERSONS));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject jsonPersons;

            JSONArray jsonArray = (JSONArray) jsonObject.get("persons");
            Iterator iterator = jsonArray.iterator();
            Addresses addressList = new Addresses();
            while(iterator.hasNext()){
                jsonPersons = (JSONObject) iterator.next();
                this.personList.add(new Person((String)jsonPersons.get("dni"), jsonPersons.get("name").toString(), (String)jsonPersons.get("last_name"), addressList.getRandomAddress(), ((String)jsonPersons.get("date")).substring(0,10)));
            }

        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
    }

    public Person getRandomPerson(){
        return this.personList.get((int)(Math.random()*this.personList.size()));
    }
}
