package be.vdab;

import java.math.BigDecimal;

public abstract class Tegel {
    protected BigDecimal prijs;

    public Tegel(BigDecimal prijs) {
        this.prijs = prijs;
    }

    public BigDecimal getPrijs() {
        return prijs;
    }
    
    public abstract int getOppervlakte();
}