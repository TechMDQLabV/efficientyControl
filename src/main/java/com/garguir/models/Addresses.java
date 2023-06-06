package com.garguir.models;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Addresses {
    private static String PATH_RESOURCES = System.getProperty("user.dir")+"/src/main/resources";
    private static String PATH_ADDRESSES = "/addresses.json";

    private List<Address> addresses = new ArrayList<>();

    public Addresses(){
        JSONParser parser = new JSONParser();
        try{
            Object obj = parser.parse(new FileReader(PATH_RESOURCES+PATH_ADDRESSES));
            JSONObject jsonObject = (JSONObject) obj;
            JSONObject jsonAddress;

            JSONArray jsonArray = (JSONArray) jsonObject.get("addresses");
            Iterator iterator = jsonArray.iterator();
            while(iterator.hasNext()){
                jsonAddress = (JSONObject) iterator.next();
                this.addresses.add(new Address((String)jsonAddress.get("street_name"), jsonAddress.get("street_number").toString(), (String)jsonAddress.get("city_name")));
            }

        }catch (Exception ex){
            System.err.println("Error: "+ex);
        }
    }

    public Address getAddress(int position){
        return this.addresses.get(position);
    }

    public Address getRandomAddress(){
        return this.addresses.get((int)(Math.random()*this.addresses.size()));
    }
}
