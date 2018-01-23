package be.vdab;

import java.math.BigDecimal;

public class RechthoekigeTegel extends Tegel {
    private final double lengte;
    private final double breedte;

    public RechthoekigeTegel(BigDecimal prijs, double lengte, double breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double getOppervlakte() {
        return lengte*breedte;
    }
}