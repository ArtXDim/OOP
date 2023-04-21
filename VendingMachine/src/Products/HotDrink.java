package Products;

/** 
 * Базовый класс продукта HotDrink
*/
public class HotDrink extends Product{

    /** объем напитка (100,200,300)*/
    private int volume;
    /**температура напитка (hot "99-60", warm "59-30", cold "29-15")*/
    private String temperature;

    /**
    * конструктор продукта 4 параметра
    * @param name - наименование продукта
    * @param price - цена продукта
    * @param volume - объем продукта
    * @param temperature - температура продукта
    */
    public HotDrink(String name, double price, int volume, String temperature) { 
        super(name, price);      
        // инициализируем объём
        this.volume = volume;
        // инициализируем температуру
        this.temperature = temperature;
    }

    /** Метод получения объема напитка;
    * @return объем продукта
    */
    public int getVolume() {
        return this.volume;
    }

    /** Метод назначения объема;
    * @param volume задание значения объема
    */
    public void setVolume(int volume){
        this.volume = volume;
    }

    /** Метод получения температуры напитка;
    *  @return температура продукта
    */

    public String getTemperature(){
        return this.temperature;
    }

    /** Метод назначения температуры
    *@param temperature продукта
    */
    public void setTemperature(String temperature){
        this.temperature= temperature;
    }


    /**
     * Переопределение вывода продукта
     */

    @Override
    public String toString()
    {
        return  "HotDrink{" +
        "name='" + super.getName() + '\'' +
        ", cost=" + super.getPrice() +
        ", volume=" + volume + 
        ", temperature = " + temperature +  
        '}';
    }
    
}