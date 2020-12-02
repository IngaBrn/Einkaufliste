
/**
 * @author 
 * @version 
 */
public class Einkaufsliste
{
    // Bezugsobjekte

    // Attribute
    List<Produkt> produktliste;

    // Konstruktor
    public Einkaufsliste()
    {
        produktliste = new List();
    }

    // Dienste
    public void fuegeProduktHinzu(Produkt p)
    {
        produktliste.append(p);
    }
    
    public void loescheProdukt(Produkt art)
    {
        while(produktliste.hasAccess())
        {
            if(produktliste.equals(art))
            {
            break;
        }
        }
        
        while(produktliste.hasAccess())
        {
            if(produktliste.equals(art))
            {
                produktliste.remove();
            }
        }
    }
    
    public void gebeProduktAus()
    {
    
    }
}
