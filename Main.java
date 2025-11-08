public class Main{
    public static void main(String[] args) {
        String trackingCode = "ID-90345-WEIGHT:25.87";
        String[] parts = trackingCode.split("[-:]");
        int trackingId = Integer.parseInt(parts[1]);
        double weight = Double.parseDouble(parts[3]);
        int nextTrackingId = trackingId + 1;
        int weightWithoutDecimal = (int) weight;
        System.out.println("Next tracking id: " + nextTrackingId);
        System.out.println("Weight without decimal point: " + weightWithoutDecimal);
    }
}
