package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    @Override
    public void create(String sport)
    {
        System.out.println("************");
        athlete.display(sport);
        System.out.println("************\n");
    }

    @Override
    public void display(String sport)
    {

    }
}
