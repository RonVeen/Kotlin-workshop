import org.jetbrains.annotations.NotNull;

import java.util.Objects;

public class JavaPerson {

    private String naam;
    private String voornaam;
    private String email;
    private String telefoon;

    public JavaPerson() {
        this("", "", "", "");
    }

    public JavaPerson(String naam, String voornaam, String email, String telefoon) {
        this.naam = naam;
        this.voornaam = voornaam;
        this.email = email;
        this.telefoon = telefoon;
    }

    @NotNull
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    @NotNull
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefoon() {
        return telefoon;
    }

    public void setTelefoon(String telefoon) {
        this.telefoon = telefoon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaPerson that = (JavaPerson) o;
        return Objects.equals(naam, that.naam) &&
                Objects.equals(voornaam, that.voornaam) &&
                Objects.equals(email, that.email) &&
                Objects.equals(telefoon, that.telefoon);
    }

    @Override
    public int hashCode() {
        return Objects.hash(naam, voornaam, email, telefoon);
    }

    @Override
    public String toString() {
        return "JavaPerson{" +
                "naam='" + naam + '\'' +
                ", voornaam='" + voornaam + '\'' +
                ", email='" + email + '\'' +
                ", telefoon='" + telefoon + '\'' +
                '}';
    }
}
