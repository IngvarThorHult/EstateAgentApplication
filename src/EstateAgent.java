public class EstateAgent implements IEstateAgent {
    @Override
    public double EstateAgentSales(double[] propertySales) {
        double totalSales = 0.0;
        for (int x = 0; x < propertySales.length; x++) {
            totalSales += propertySales[x];
        }
        return totalSales;
    }

    @Override
    public double EstateAgentCommission(double propertySales) {
        double totalCommission = propertySales * 2 / 100;
        return totalCommission;
    }

    @Override
    public int TopEstateAgent(double[] totalSales) {
        int topPosition = 0;
        double topSale = totalSales[0];
        for (int x = 0; x < totalSales.length; x++) {
            if (totalSales[x] > topSale) {
                topPosition = x;
            }
        }
        return topPosition;
    }
}