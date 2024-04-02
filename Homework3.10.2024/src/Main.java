import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Profesor profesor1 = new Profesor();
        profesor1.setAddress("Bucuresti");
        profesor1.setAge(31);
        profesor1.setCnp(1940429152496L);
        profesor1.setFirstName("Danila");
        profesor1.setLastName("Alexandru");
        Curs matematica = new Curs();
        matematica.setTipCurs(Cursuri.MATH);
        matematica.setProfesor(profesor1);
        matematica.setDescriere("Invatam sa adunam");

        Curs computerScience = new Curs();
        computerScience.setTipCurs(Cursuri.COMPUTER_SCIENCE);
        computerScience.setProfesor(profesor1);
        computerScience.setDescriere("Invatam sa adunam");

        Curs physics = new Curs();
        physics.setTipCurs(Cursuri.PHYSICS);
        physics.setProfesor(profesor1);
        physics.setDurata(60);

        List<Curs> listaCursuri = new ArrayList<>();
        listaCursuri.add(matematica);
        listaCursuri.add(computerScience);
        listaCursuri.add(physics);
        Elev elev1 = new Elev();
        elev1.setAddress("Timisoara");
        elev1.setLastName("Stoian");
        elev1.setCursuri(listaCursuri);
        elev1.setFirstName("Mihai");

        System.out.println(elev1.getCursuri());
        System.out.println(elev1);



    }
}
