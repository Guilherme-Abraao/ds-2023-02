<<<<<<< HEAD
package comparator;

import java.util.Comparator;

// Ordenação pela primeira nota a título de exemplo
public class NotasComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Double.compare(estudante1.getNotas()[0], estudante2.getNotas()[0]);
    }
}

=======
package comparator;

import java.util.Comparator;

// Ordenação pela primeira nota a título de exemplo
public class NotasComparator implements Comparator<Estudante> {
    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return Double.compare(estudante1.getNotas()[0], estudante2.getNotas()[0]);
    }
}

>>>>>>> 1e1c18c3eb413298ea5853c8171ec752d41ec282
