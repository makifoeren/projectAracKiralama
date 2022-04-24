public class AracKiralama {

    String model;
    String marka;
    String yakitTipi;
    String vites;
    double gunlukUcret;

    String alacaguGun;
    double alacagiSaat;
    String teslimedecegiGun;
    double teslimedecegiSaat;

    public AracKiralama() {
    }

    public AracKiralama(String model, String marka, String yakitTipi, String vites, double gunlukUcret) {
        this.model = marka;
        this.marka = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;

    }

    public AracKiralama(String alacaguGun, double alacagiSaat, String teslimedecegiGun, double teslimedecegiSaat) {
        this.alacaguGun = alacaguGun;
        this.alacagiSaat = alacagiSaat;
        this.teslimedecegiGun = teslimedecegiGun;
        this.teslimedecegiSaat = teslimedecegiSaat;
    }


    public double getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(double gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {


        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "AracKiralama{" +
                "model='" + model + '\'' +
                ", marka='" + marka + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }
}
