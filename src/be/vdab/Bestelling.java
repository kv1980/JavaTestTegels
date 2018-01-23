package be.vdab;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Bestelling {
    private Map<Tegel,Integer> bestellingMap = new HashMap<>();
    
    public void detailToevoegen(Tegel eenTegel, int aantal){
        bestellingMap.put(eenTegel,aantal);
    }
    
    public void WijzigAantalVanDetail(Tegel eenTegel, int aantal){
        bestellingMap.put(eenTegel,aantal);
    }
    
    public int getOppervlakte(){
        return bestellingMap.keySet().stream()
                                     .mapToInt(eenTegel -> eenTegel.getOppervlakte()*bestellingMap.get(eenTegel))
                                     .sum();    
    }
    
    public BigDecimal getTeBetalen(){
        return bestellingMap.keySet().stream()
                                     .map(eenTegel -> eenTegel.getPrijs().multiply(BigDecimal.valueOf(bestellingMap.get(eenTegel))))  
                                     .reduce(BigDecimal.ZERO,(totalePrijs,subTotaalPerTegel) -> totalePrijs.add(subTotaalPerTegel));
    }
}