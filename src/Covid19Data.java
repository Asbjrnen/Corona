public class Covid19Data {
    private String region;
    private String aldersgruppe;
    private int BTIAlt;
    private int døde;
    private int ICU;
    private int indlagte;
    private String dato;


    public Covid19Data(String region, String aldersgruppe, int BTIAlt, int døde, int ICU, int indlagte, String dato) {
        this.region = region;
        this.aldersgruppe = aldersgruppe;
        this.BTIAlt = BTIAlt;
        this.døde = døde;
        this.ICU = ICU;
        this.indlagte = indlagte;
        this.dato = dato;
    }

    @Override
    public String toString() {
        return "Covid19Data{" +
                "region='" + region + '\'' +
                ", aldersgruppe='" + aldersgruppe + '\'' +
                ", BTIAlt=" + BTIAlt +
                ", døde=" + døde +
                ", ICU=" + ICU +
                ", indlagte=" + indlagte +
                ", dato='" + dato + '\'' +
                '}';
    }
}
