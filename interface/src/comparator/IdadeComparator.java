<<<<<<< HEAD
package comparator;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Integer.compare(estudante1.getIdade(), estudante2.getIdade());
    }
}

=======
package comparator;

import java.util.Comparator;

public class IdadeComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Integer.compare(estudante1.getIdade(), estudante2.getIdade());
    }
}

>>>>>>> 1e1c18c3eb413298ea5853c8171ec752d41ec282
