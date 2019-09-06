package com.lambdaschool.solution;

public class MyApplication implements Processor
{
    // Field - Type: AthleteCreation, Name: aCreate
    private AthleteCreation aCreate;

    // Methods
    public MyApplication(AthleteCreation aCreate) {
        this.aCreate = aCreate;
    }

    // Override Processor Method displayAthlete - return
    @Override
    public void displayAthlete()
    {
        System.out.println("*******");
        aCreate.displayAthlete();
        System.out.println("*******\n");
    }
}
