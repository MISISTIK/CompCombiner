package homework;

import homework.classes.*;

public class MainCompCombiner {
    public static void main(String[] args) {
        //--------------CPU-----------------
        Intel cpu1 = new Intel("Intel Core I9-7900X", "X299");
        AMD cpu2 = new AMD("Ryzen Threadripper 1950X", "X399");
        //----------Motherboards------------
        ASUS mb1 = new ASUS("ASUS TUF X299", "Mark 2");
        MSI mb2 = new MSI("MSI X399", "SLI Plus");

        CompCombiner compCombiner = new CompCombiner();
        compCombiner.loadCPUs(cpu1, cpu2);
        compCombiner.loadMotherboards(mb1, mb2);
        compCombiner.listAll();
        compCombiner.doCombine();

    }

}
