<<<<<<< HEAD
package comparator;

import java.util.Comparator;

public class NomeComparator implements Comparator<comparator.Estudante> {
    @Override
    public int compare(comparator.Estudante estudante1, comparator.Estudante estudante2) {
        return estudante1.getNome().compareTo(estudante2.getNome());
    }
=======
package comparator;

import java.util.Comparator;

public class NomeComparator implements Comparator<comparator.Estudante> {
    @Override
    public int compare(comparator.Estudante estudante1, comparator.Estudante estudante2) {
        return estudante1.getNome().compareTo(estudante2.getNome());
    }
>>>>>>> 1e1c18c3eb413298ea5853c8171ec752d41ec282
}