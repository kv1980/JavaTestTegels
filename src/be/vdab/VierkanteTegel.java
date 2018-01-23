package be.vdab;

import java.math.BigDecimal;

public class VierkanteTegel extends Tegel {
    private final double zijde;

    public VierkanteTegel(BigDecimal prijs, double zijde) {
        super(prijs);
        this.zijde = zijde;
    }

    @Override
    public double getOppervlakte() {
        return zijde*zijde;
    }
}
