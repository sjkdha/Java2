package com.learn.a01oopextensdemo7;

public class employee {
    private String Id;
    private  String name;
    private String work;

    public employee() {
    }

    public employee(String id, String name, String work) {
        this.Id = id;
        this.name = name;
        this.work = work;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public void workNess(){
        System.out.println("员工在工作");
    }
}
