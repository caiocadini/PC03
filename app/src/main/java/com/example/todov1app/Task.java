package com.example.todov1app;

import java.io.Serializable;

public class Task implements Serializable {
    String name, description, priority;

    public Task(String name, String description, String priority) {
        this.name = name;
        this.description = description;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {return priority;}

    public void setPriority(String priority){this.priority = priority;}

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean prioritizeTask(){
       String tPriority = getPriority();
       switch (tPriority){
           case ("High"):
               //Atualização falhou
               return false;
           case("Medium"):
               setPriority("High");
               //Atualização funcionou
               return true;
           case("Low"):
               setPriority("Medium");
               return true;
       }
       return false;
    }

    @Override
    public String toString() {
        return getName();
    }
}
