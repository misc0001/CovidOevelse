public class Covid19Data {
    private String region;
    private String ageGroup;
    private int confirmedCases;
    private int deaths;
    private int intensiveCare;
    private String Dato;

    public Covid19Data(String region, String ageGroup, int confirmedCases, int deaths, int intensiveCare, String dato) {
        this.region = region;
        this.ageGroup = ageGroup;
        this.confirmedCases = confirmedCases;
        this.deaths = deaths;
        this.intensiveCare = intensiveCare;
        this.Dato = dato;
    }

    public String getRegion() {
        return region;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "Region='" + region + '\'' +
                ", Aldersgruppe='" + ageGroup + '\'' +
                ", bekræftedeTilfælde=" + confirmedCases +
                ", døde=" + deaths +
                ", IndlagtePåIntensivAfdeling=" + intensiveCare +
                ", Dato='" + Dato + '\'' +
                '}';
    }
}
