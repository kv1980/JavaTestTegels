package be.vdab;

import java.math.BigDecimal;

public class DriehoekigeTegel extends Tegel{
    private final double lengte;
    private final double breedte;

    public DriehoekigeTegel(BigDecimal prijs, double lengte, double breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public double getOppervlakte() {
        return lengte*breedte/2;
    }
}