package menuADT;

public interface Menu<E> {
    boolean addContact();

    boolean viewContact();

    boolean deleteContact();

    boolean searchContact();
}
