public class EstateAgentApplication {
    public static void main(String[] args)
    {
        double[][] propertySales = {{800000, 1500000, 2000000},
                {700000, 1200000, 1600000}};
        double[] totalSales = new double[3];
        String[] estateAgents = {"Joe Bloggs", "Jane Doe"};

        EstateAgentPrinting printing = new EstateAgentPrinting(propertySales, totalSales, estateAgents);
        printing.printHeading();
        printing.printPropertySales();
        printing.printTotalAgentSales();
        printing.printTotalAgentCommission();
        printing.printTopAgent();
    }
}