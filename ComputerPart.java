package work5.task1;

/**
 * Інтерфейс ComputerPart (Element)
 * Описує компонент комп'ютерної системи.
 * Вимагає реалізації методу accept() для шаблону Visitor.
 */
public interface ComputerPart {
    /**
     * Метод "прийому" відвідувача (Visitor).
     * @param visitor Об'єкт відвідувача, який виконує операцію.
     */
    void accept(ComputerPartVisitor visitor);
}