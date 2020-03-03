package com.gnail.sergick6690;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        String str = getJson("D:\\JAVA\\JavaProAll\\JSON\\json.txt");
        Gson gson = new GsonBuilder().create();
        Person person = (Person) gson.fromJson(str,Person.class);
        System.out.println(person.toString());

        }

    public static String getJson (String url){
        File file = new File(url);
        StringBuilder sb = new StringBuilder();
        try(BufferedReader br = new BufferedReader(new FileReader(file))){
           String str;
            for (;(str= br.readLine())!=null;){
                sb.append(str);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        return sb.toString();
    }
}
