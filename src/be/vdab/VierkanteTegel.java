package be.vdab;

import java.math.BigDecimal;

public class VierkanteTegel extends Tegel {
    private final int zijde;

    public VierkanteTegel(BigDecimal prijs, int zijde) {
        super(prijs);
        this.zijde = zijde;
    }

    @Override
    public int getOppervlakte() {
        return zijde*zijde;
    }
}
