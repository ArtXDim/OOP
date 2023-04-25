package Classes;
/** Класс Акционных клиентов. Имплементирует родительский класс Actor */
/**
 * PromoClient
 */
public class PromoClient extends Actor{
   
    /** название акции.Поле инкапуслировано */
    private String OfferTitle;

    /** Статическое поле количество Акционных клиентов */
    private static int numberOfSpOfCl;
    static{
        numberOfSpOfCl = 0;
    }

    /**
     * базовый конструктор класса Акционный клиент. 
     * при создании нового оъекта данного класса - счетчик Количества акционных клиентов обновляет количество.
     * @param name Имя 
     * @param offerTitle название акции
     */
    public PromoClient(String name, String offerTitle) {
        super(name);
        this.OfferTitle = offerTitle;
        numberOfSpOfCl++;
    }
    
   
    /**
     * геттер метод для получения названия акции
     * @return название акции
     */
    public String getOfferTitle(){
        return this.OfferTitle;
    }

    /**
     * Геттер метод для получение количества Акционных клиенов благодаря статическому полю 
     * @return количество VIP клиентов
     */
    public int getNumOfSpecOffCl(){
        return PromoClient.numberOfSpOfCl;
    }

       /** переопределение получения имени клиента */
    @Override
    public String getName() {
        return super.getName();
    }

     /** переопределение метода: получить Клиента */
    @Override
    public Actor getActor() {
        return this;
    }
    

    /** переопределение метода: сделан ли заказ */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /** переопределение метода: получен ли заказ */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /** Сеттер. переопределение метода: заказ получен */
    @Override
    public void setTakeOrder(boolean pickUpOrder) {
        super.isTakeOrder = pickUpOrder;
        
    }

    /** Сеттер. переопределение метода: сделан заказ */
    @Override
    public void setMakeOrder(boolean makeOrder) {
        super.isMakeOrder = makeOrder;
        
    }

    /* переопределение метода сделал заявку на возврат */
    @Override
    public void setMakeReturnOrder(boolean makeReturnOrder) {
        super.isMakeReturnOrder = makeReturnOrder;
    }

    /**
     * Сеттер метод. меняет статус на: забрал деньги
     * @param takeCash значение забрал деньги
     */
    @Override
    public void setTakeCash(boolean takeCash) {
        super.isTakeCash = takeCash;
      }

      /** переопределение метода:  есть ли заявка на возврат товара */
    @Override
    public boolean isMakeReturnOrder() {
        return super.isMakeReturnOrder;
    }

    /** переопределение метода забрал ли деньги */
    @Override
    public boolean isTakeCash() {
       return super.isTakeCash;
    }

    

    

    

    
    
}