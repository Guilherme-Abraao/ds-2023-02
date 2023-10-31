<<<<<<< HEAD
package comparator;

import java.util.Comparator;

public class SobrenomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return estudante1.getSobrenome().compareTo(estudante2.getSobrenome());
    }
}

=======
package comparator;

import java.util.Comparator;

public class SobrenomeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return estudante1.getSobrenome().compareTo(estudante2.getSobrenome());
    }
}

>>>>>>> 1e1c18c3eb413298ea5853c8171ec752d41ec282
