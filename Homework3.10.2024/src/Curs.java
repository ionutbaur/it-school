public class Curs {
    private Cursuri tipCurs;
    private int durata;
    private String descriere;
    private Profesor profesor;

    public Cursuri getTipCurs() {
        return tipCurs;
    }

    public void setTipCurs(Cursuri tipCurs) {
        this.tipCurs = tipCurs;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public String getDescriere() {
        return descriere;
    }

    public void setDescriere(String descriere) {
        this.descriere = descriere;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    @Override
    public String toString() {
        return "Curs{" +
                "tipCurs=" + tipCurs +
                ", durata=" + durata +
                ", descriere='" + descriere + '\'' +
                ", profesor=" + profesor +
                '}';
    }
}
