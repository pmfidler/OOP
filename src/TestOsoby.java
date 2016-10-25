/**
 * Created by piotr on 2016-10-25.
 */
public class TestOsoby {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Osoba tato = new Osoba();
        tato.imie="Jan";
        tato.nazwisko="Kowalski";
        tato.wiek=35;

        Osoba corka = new Osoba();
        corka.imie="Alicja";
        corka.nazwisko="Kowalska";
        corka.wiek=10;

        Osoba syn = new Osoba();
        syn.imie="Wojtek";
        syn.nazwisko="Ludzinski";
        syn.wiek=17;

        Osoba synowa = new Osoba();
        syn.imie="Iza";
        syn.nazwisko="Wiecka";
        syn.wiek=37;

        System.out.println(tato.pelnoletnia());
        System.out.println(corka.pelnoletnia());
        System.out.println(syn.pelnoletnia());
        System.out.println(synowa.pelnoletnia());

    }
}
