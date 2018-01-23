package be.vdab;

import java.math.BigDecimal;

public class RechthoekigeTegel extends Tegel {
    private final int lengte;
    private final int breedte;

    public RechthoekigeTegel(BigDecimal prijs, int lengte, int breedte) {
        super(prijs);
        this.lengte = lengte;
        this.breedte = breedte;
    }

    @Override
    public int getOppervlakte() {
        return lengte*breedte;
    }
}