package Classes;

/** класс Обычный клиент */
public class OrdinaryClient extends Actor {

    /**
     * Базовый конструктор класса
     * @param name Имя
     */
    public OrdinaryClient(String name)
    {
        super(name);
    }

    /** Переопределение метода для получение Имени */
    @Override
    public String getName() {        
        return super.name;
    }

    /** переопределение метода: сделал ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: забрал ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }
    
    /** Сеттер. переопределение метода : сделал заказ  */
    @Override
    public void setMakeOrder(boolean makeOrder) {
       super.isMakeOrder = makeOrder;
    }

    /** Сеттер.перопределение метода: получил заказ */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
       super.isTakeOrder = pickUpOrder;   
    }

    /** переопределение метода: получить Клиент */
    @Override
    public Actor getActor() {
        return this;
    }

    /** переопределение метода: есть ли заявка на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /* переопределение метода забрал ли деньги */
    @Override
    public boolean isTakeCash() {
        return super.isTakeCash;
    }

    /* переопределение метода сделал заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /* переопределение метода забрать деньги */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
    }
    
}