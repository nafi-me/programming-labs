package entity;

import java.util.Objects;

public abstract class Person {
    protected String name;
    protected Disposition disposition;

    public Person(String name, Disposition disposition) {
        this.name = name;
        this.disposition = disposition;
    }

    public String getName() {
        return name;
    }

    public Disposition getDisposition() {
        return disposition;
    }

    // Абстрактный метод, задающий поведение персонажа
    public abstract void act();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(name, person.name) &&
                disposition == person.disposition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, disposition);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "name='" + name + '\'' +
                ", disposition=" + disposition +
                '}';
    }
}
