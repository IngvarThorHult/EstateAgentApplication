import java.text.DecimalFormat;

public class EstateAgentPrinting {
    double[][] propertySales;
    double[] totalSales;
    String[] estateAgents;

    EstateAgent agent;

    public EstateAgentPrinting(double[][] propertySales, double[] totalSales, String[] estateAgents){
        this.propertySales = propertySales;
        this.totalSales = totalSales;
        this.estateAgents = estateAgents;
        agent = new EstateAgent();
    }
    public void printHeading() {
        System.out.println("ESTATE AGENTS SALES REPORT");
        System.out.println();
        System.out.println("/t/t/t JAN" + "/t/t/t" + "FEB" + "/t/t/t" + "MAR");
        System.out.println("-----------------------------------------" +
                "--------------------------------");


    }
    public void printPropertySales(){
        for(int x = 0; x < estateAgents.length; x++){
            System.out.print(estateAgents[x] + "/t");
            totalSales[x] += agent.EstateAgentSales(propertySales[x]);
            for(int y = 0; y < totalSales.length; y++){
                System.out.print("/t R" + propertySales[x][y] + "/t");
            }
            System.out.println();
        }
        System.out.println();
    }
    public void printTotalAgentSales(){
        String pattern = "###.###.###";
        DecimalFormat df = new DecimalFormat(pattern);
        for(int i = 0; i < estateAgents.length; i++) {
            System.out.println("Total Property sales for " +
                    estateAgents[i] + " = R " + df.format((totalSales[i])));
        }
        System.out.println();
    }
    public void printTotalAgentCommission(){
        String pattern = "###.###.###";
        DecimalFormat df = new DecimalFormat(pattern);
        for(int i = 0; i < estateAgents.length; i++) {
            System.out.println(" sales commission for " +
                    estateAgents[i] + " = R " + df.format(agent.EstateAgentCommission(totalSales[i])));
        }
        System.out.println();


    }
    public void printTopAgent(){
        int topPosition = agent.TopEstateAgent(totalSales);
        System.out.println("Top performing estate agent: " + estateAgents[topPosition]);


    }


}
