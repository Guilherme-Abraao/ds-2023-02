package org.example;

import java.util.ArrayList;
import java.util.List;

public class ConcreteObservable implements Observable{

    private final String identificador;
    private List<InterfaceObserver> observers = new ArrayList<>();

    public ConcreteObservable(String identificador) {
        this.identificador = identificador;
    }

    public void addObserver(InterfaceObserver observer) {

        System.out.println(observer.getClass().getName());

        if (observer.getClass().isAnnotationPresent(Observer.class)) {

            Observer observerAnnotation = observer.getClass().getAnnotation(Observer.class);

            if (observerAnnotation.observado().equals(identificador)) {
                observers.add(observer);
                System.out.println("Observer adicionado");

            } else {
                throw new IllegalArgumentException("Identificador do Observer não coincide com o identificador do Observable.");
            }

        } else {
            throw new IllegalArgumentException("A classe observadora não possui a anotação @Observer.");
        }
    }

    public void addObserverSemIdentificador(InterfaceObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notificar() {
        for (InterfaceObserver i : observers){
            i.atualizar();
        }
    }
}
