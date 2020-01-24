package dbesan.lab6.a1.techs.HouseTechs.LivingRoom.diff.WorkTech;

import dbesan.lab6.a1.techs.HouseTechs.LivingRoom.diff.Work;

public class PC extends Work {
    private double scrsize;
    private String ProcessorName;
    private int ProcessorPower;
    private String name;
    private int power;

    public PC(String name, int power, double scrsize, String processorName, int processorPower) {
        super(name, power);
        this.scrsize = scrsize;
        ProcessorName = processorName;
        ProcessorPower = processorPower;
    }

    public double getScrsize() {
        return scrsize;
    }

    public String getProcessorName() {
        return ProcessorName;
    }

    public int getProcessorPower() {
        return ProcessorPower;
    }

    public void setScrsize(double scrsize) {
        this.scrsize = scrsize;
    }

    public void setProcessorName(String processorName) {
        ProcessorName = processorName;
    }

    public void setProcessorPower(int processorPower) {
        ProcessorPower = processorPower;
    }


}
