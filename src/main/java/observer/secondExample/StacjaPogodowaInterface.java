package observer.secondExample;

public interface StacjaPogodowaInterface {

    void dodajOdbiorce(CzytnikTemperatury ct);
    void usunOdbiorce(CzytnikTemperatury ct);
    void powiadom();
}
