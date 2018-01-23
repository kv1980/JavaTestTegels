package be.vdab;

import java.math.BigDecimal;

public class DriekhoekigeTegel extends Tegel{
    private final double lengte;
    private final double breedte;

    public DriekhoekigeTegel(BigDecimal prijs, double lengte, double breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double getOppervlakte() {
        return lengte*breedte/2;
    }
}