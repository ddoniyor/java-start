import java.io.Console;
import java.io.FileInputStream;
import java.lang.reflect.Array;
import java.util.Scanner;
/*
public class javaStart{
    public static void main(String[] args) {
        int x = 1;
        while (x < 3) {
            System.out.print("Doo");
            System.out.print("Bee");
            x = x + 1;
        }
        if (x ==3) {
            System.out.print("Do");
        }
    }
}*/
/*
public class javaStart {
    public static void main (String[] args) {
        int beerNum = 99;
        String word = "бутылки";
        while (beerNum > 0) {
            if (beerNum ==1) {
                word = "бутылка"; // В единственном чыс
            }

            //System.out.println (beerNum + " " + word + " пива на стене");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьми одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0 ) {
                System.out.println(beerNum + " " + word + " пива на стене");
            } else {
                System.out.println("Нет бутылок пива на стене");
            } // Конец else
        } // Конец цикла wfci:
    } // Конец метода main
} // Коней класса*/
/*
public class javaStart {
    public static void main (String[] args) {
        //Создайте три набора слов для выбора. Добавляйте собственные слова!
        String[] wordListOne = {"круглосуточный", "трех-звенный",
                "30000-футовьй", "взаимный", "обовдный выигрыш", "фронтэнд",
                "на основе веб-технологий", "проникащий", "умный", "шестьсит", "метод критического пути", "динамичный"};
        String[] wordListTwo = {"уполномоченный", "трудный",
                "чистый продукт", "ориентированный", "центральный",
                "распределенный", "кластеризованный", "фирменный",
                "нестандартный ум", "позиционированный", "сетевой",
                "сфокусированный", "использованный с выгодой", "выровненный",
                "нацеленный на", "общий", "совместный", "ускоренный"};
        String[] wordListThree = {"процесс", "пункт разгрузки",
                "выход из положения", "тип структуры", "талант", "подход",
                "уровень завоеванного внимания", "портал", "период времени",
                "обзор", "образец", "пункт следования"};

        // Вычисляем, сколько слов в каждом списке
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        //Генерируемтри случайных числа
        int randl = (int) (Math.random() * oneLength) ;
        int rand2 = (int) (Math.random() * twoLength) ;
        int rand3 = (int) (Math.random() * threeLength);

        //Теперь строим фразу
        String phrase = wordListOne[randl] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

        //Выводимфразу на экран
        System.out.println("Все, что нам нужно, - это " + phrase);
    }}*/
/*
TODO: FIRST EXC DONE!
public class javaStart {
    public static void main (String[] args) {
        int x = 3;
        while (x>0) {

            if(x>2){
                System.out.print("a");

            }
            if(x==2){
                System.out.print("b c");

            }

            if(x==1){
                System.out.print("d");
                x = x - 1;
            }
            x = x - 1;
            if(x>0) {
                System.out.print("-");
            }else{
                System.out.print("");
            }
        }
    }}*/
/*
class GuessGame {
    */
/*Player p1;
    Player p2;
    Player p3;*//*

    public void startGame(){
        Player p1 = new Player() ;
        Player p2 = new Player();
        Player p3 = new Player();

        int guessp1 = 0;
        int guessp2 = 0;
        int guessp3 = 0;

        boolean plisRight = false;
        boolean p2isRight = false;
        boolean p3isRight = false;

        int targetNumber = (int) (Math.random() * 10) ;
        System.out.println("Я загадываю число от 0 до 9...");
        while(true){
            System.out.println("Число, хоторое нужно угадать, — " + targetNumber);
            p1.guess();
            p2.guess();
            p3.guess();

            guessp1 = p1.number;
            System.out.println("Первый игрок думает, что это " +guessp1);
            guessp2 = p2.number;
            System.out.println ("Второй игрок думает, что это "+guessp2);
            guessp3 = p3.number;
            System.out.println("Третий игрок думает, что это " +guessp3);
            if (guessp1 == targetNumber) {
                plisRight = true;
            }
            if (guessp2 == targetNumber) {
                p2isRight = true;
            }
            if (guessp3 == targetNumber) {
                p3isRight = true;
            }
            if (plisRight || p2isRight || p3isRight) {

                System.out.println("У нас есть победитель!");
                if(plisRight==true) {
                    System.out.println("Первый игрок угадал!");
                }
                if(p2isRight==true) {
                    System.out.println("Второй игрок угадал!");
                }
                if(p3isRight==true) {
                    System.out.println("Третий игрок угадал!");
                }
                System.out.println(" Конец игры. ");
                break;
            }else{
                System.out.println ("Игроки должны попробовать еще раз.");
            }
        }
    }
}
class Player {
    int number =0; // Здесь хранится вариант числа
    public void guess() {
        //number = (int) (Math.random() * 10);
        Scanner inn = new Scanner(System.in);
        number = inn.nextInt();
        System.out.println("Думаю, это число " + number);
    }
}
public class javaStart {
    public static void main (String[] args) {
        GuessGame game = new GuessGame();
        game.startGame();
    }
}*/
/*
public class javaStart{

    public static void main(String[] args) {

        Account acc1 = new Account("1876", 4500);
        Account acc2 = new Account("3476", 1500);

        Transaction<Account> tran1 = new Transaction<Account>(acc1,acc2, 4000);
        tran1.execute();
        tran1 = new Transaction<Account>(acc1,acc2, 50);
        tran1.execute();
    }
}
class Transaction<T extends Account>{

    private T from;     // с какого счета перевод
    private T to;       // на какой счет перевод
    private int sum;    // сумма перевода

    Transaction(T from, T to, int sum){
        this.from = from;
        this.to = to;
        this.sum = sum;
    }
    public void execute(){

        if (from.getSum() > sum)
        {
            from.setSum(from.getSum() - sum);
            to.setSum(to.getSum() + sum);
            System.out.printf("Account %s: %d \nAccount %s: %d \n",
                    from.getId(), from.getSum(),to.getId(), to.getSum());
        }
        else{
            System.out.printf("Operation is invalid");
        }
    }
}
class Account{

    private String id;
    private int sum;

    Account(String id, int sum){
        this.id = id;
        this.sum = sum;
    }

    public String getId() { return id; }
    public int getSum() { return sum; }
    public void setSum(int sum) { this.sum = sum; }
}*/
/*public class javaStart{
    public static void main(String[] args){

        int result = fact.getFactorial(-6);
        System.out.println(result);
    }
}
class fact{
    public static int getFactorial(int num){

        int result=1;
        try{
            if(num<1) throw new Exception("The number is less than 1");

            for(int i=1; i<=num;i++){

                result*=i;
            }
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
            result=num;
        }
        return result;
    }
}*/
/*
class javaStart {
    public static void main(String[] args) {

        try {
            int result = Factorial.getFactorial(-6);
            System.out.println(result);
        } catch (FactorialException ex) {

            System.out.println(ex.getMessage());
            System.out.println(ex.getNumber());
        }
    }
}
class Factorial{

    public static int getFactorial(int num) throws FactorialException{

        int result=1;
        if(num<1) throw new FactorialException("The number is less than 1",num);

        for(int i=1; i<=num;i++){

            result*=i;
        }
        return result;
    }
}

class FactorialException extends Exception{

    private int number;
    public int getNumber(){return number;}
    public FactorialException(String message, int num){

        super(message);
        number=num;
    }
}*/
/*
import java.util.ArrayList;

public class javaStart{
    public static void main(String[] args) {

        ArrayList<String> people = new ArrayList<String>();
        // добавим в список ряд элементов
        people.add("Tom");
        people.add("Alice");
        people.add("Kate");
        people.add("Sam");
        people.add(1, "Bob"); // добавляем элемент по индексу 1

        System.out.println(people.get(1));// получаем 2-й объект
        people.set(1, "Robert"); // установка нового значения для 2-го объекта

        System.out.printf("ArrayList has %d elements \n", people.size());
        for(String person : people){
            System.out.println(person);
        }
        // проверяем наличие элемента
        if(people.contains("Tom")){
            System.out.println("ArrayList contains Tom");
        }

        // удалим несколько объектов
        // удаление конкретного элемента
        people.remove("Robert");
        // удаление по индексу
        people.remove(0);

        Object[] peopleArray = people.toArray();
        for(Object person : peopleArray){
            System.out.println(person);
        }
    }
}*/
/*
import java.util.ArrayDeque;

public class javaStart{

    public static void main(String[] args) {

        ArrayDeque<String> states = new ArrayDeque<String>();
        // стандартное добавление элементов
        states.add("Germany");
        states.addFirst("France"); // добавляем элемент в самое начало
        states.push("Great Britain"); // добавляем элемент в самое начало
        states.addLast("Spain"); // добавляем элемент в конец коллекции
        states.add("Italy");

        // получаем первый элемент без удаления
        String sFirst = states.getFirst();
        System.out.println(sFirst);     // Great Britain
        // получаем последний элемент без удаления
        String sLast = states.getLast();
        System.out.println(sLast);      // Italy

        System.out.printf("Queue size: %d \n", states.size());  // 5

        // перебор коллекции
        while(states.peek()!=null){
            // извлечение c начала
            System.out.println(states.pop());
        }

        // очередь из объектов Person
        ArrayDeque<Person> people = new ArrayDeque<Person>();
        people.addFirst(new Person("Tom"));
        people.addLast(new Person("Nick"));
        // перебор без извлечения
        for(Person p : people){

            System.out.println(p.getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}
*/
/*import java.util.HashSet;

public class javaStart{

    public static void main(String[] args) {

        HashSet<String> states = new HashSet<String>();

        // добавим в список ряд элементов
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        // пытаемся добавить элемент, который уже есть в коллекции
        boolean isAdded = states.add("Germany");
        System.out.println(isAdded);    // false

        System.out.printf("Set contains %d elements \n", states.size());    // 3

        for(String state : states){

            System.out.println(state);
        }
        // удаление элемента
        states.remove("Germany");

        // хеш-таблица объектов Person
        HashSet<Person> people = new HashSet<Person>();
        people.add(new Person("donik"));
        people.add(new Person("Tom"));
        people.add(new Person("Nick"));
        for(Person p : people){

            System.out.println(p.getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}*/
/*
import java.util.*;

public class javaStart{

    public static void main(String[] args) {

        Map<Integer, String> states = new HashMap<Integer, String>();
        states.put(1, "Germany");
        states.put(2, "Spain");
        states.put(4, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        System.out.println(first);
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        // получить набор всех значений
        Collection<String> values = states.values();
        //заменить элемент
        states.replace(1, "Poland");
        // удаление элемента по ключу 2
        states.remove(2);
        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }

        Map<String, Person> people = new HashMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person{

    private String name;
    public Person(String value){

        name=value;
    }
    String getName(){return name;}
}*/
//TODO:HASH MAP
/*
import java.util.*;

public class javaStart{

    public static void main(String[] args) {

        TreeMap<Integer, String> states = new TreeMap<Integer, String>();
        states.put(10, "Germany");
        states.put(2, "Spain");
        states.put(14, "France");
        states.put(3, "Italy");

        // получим объект по ключу 2
        String first = states.get(2);
        // перебор элементов
        for(Map.Entry<Integer, String> item : states.entrySet()){

            System.out.printf("Key: %d  Value: %s \n", item.getKey(), item.getValue());
        }
        // получим весь набор ключей
        Set<Integer> keys = states.keySet();
        System.out.println("keys is" + keys);
        // получить набор всех значений
        Collection<String> values = states.values();
        System.out.println("values is" + values);

        // получаем все объекты, которые стоят после объекта с ключом 4
        Map<Integer, String> afterMap = states.tailMap(4);
        System.out.println("after map is" + afterMap);

        // получаем все объекты, которые стоят до объекта с ключом 10
        Map<Integer, String> beforeMap = states.headMap(10);
        System.out.println("Before map is" + beforeMap);

        // получим последний элемент дерева
        Map.Entry<Integer, String> lastItem = states.lastEntry();

        System.out.printf("Last item has key %d value %s \n",lastItem.getKey(), lastItem.getValue());

        Map<String, Person> people = new TreeMap<String, Person>();
        people.put("1240i54", new Person("Tom"));
        people.put("1564i55", new Person("Bill"));
        people.put("4540i56", new Person("Nick"));

        for(Map.Entry<String, Person> item : people.entrySet()){

            System.out.printf("Key: %s  Value: %s \n", item.getKey(), item.getValue().getName());
        }
    }
}
class Person{

    private String name;
    public Person(String name){

        this.name = name;
    }
    String getName(){return name;}
}*/
//TODO:ITERATOR
/*import java.util.*;

public class javaStart {

    public static void main(String[] args) {

        ArrayList<String> states = new ArrayList<String>();
        states.add("Germany");
        states.add("France");
        states.add("Italy");
        states.add("Spain");

        Iterator<String> iter = states.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next());
        }
        while(iter.next()!=null){
            System.out.println("go to next");
        }
    }
}*/
//TODO:INPUT AND OUTPUT STREAM
/*
import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        String text = "Hello world!Its me DDon "; // строка для записи
        try(FileOutputStream fos = new FileOutputStream("/home/ddoniyor/javaFile.txt");
            FileInputStream fin  = new FileInputStream("/home/ddoniyor/javaFile.txt")
        )
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            fos.write(buffer, 0, buffer.length);


            byte[] bufferr = new byte[fin.available()];
            fin.read(bufferr, 0, buffer.length);
            for(int i=0; i<bufferr.length;i++){

                System.out.print((char)bufferr[i]);
            }
            System.out.print("\n");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
        System.out.println("The file has been written");
    }
}*/
/*import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        byte[] array1 = new byte[]{1, 3, 5, 7};
        ByteArrayInputStream byteStream1 = new ByteArrayInputStream(array1);
        int b;
        while((b=byteStream1.read())!=-1){

            System.out.println(b);
        }

        String text = "Hello world!";
        byte[] array2 = text.getBytes();
        // считываем 5 символов
        ByteArrayInputStream byteStream2 = new ByteArrayInputStream(array2, 0, 10);
        int c;
        while((c=byteStream2.read())!=-1){

            System.out.println((char)c);
        }
    }
}*/


/*
public class javaStart {

    public static void main(String[] args) {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        String text = "Hello Wolrd!";
        byte[] buffer = text.getBytes();
        try{
            baos.write(buffer);
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }
        // превращаем массив байтов в строку
        System.out.println(baos.toString());

        // получаем массив байтов и выводим по символьно
        byte[] array = baos.toByteArray();
        for(byte b: array){

            System.out.print((char)b);
        }
        System.out.println();
    }
}*/

/*import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        String text = "Hello world!";
        byte[] buffer = text.getBytes();
        ByteArrayInputStream in = new ByteArrayInputStream(buffer);

        try(BufferedInputStream bis = new BufferedInputStream(in)){

            int c;
            while((c=bis.read())!=-1){

                System.out.print((char)c);
            }
        }
        catch(Exception e){

            System.out.println(e.getMessage());
        }
        System.out.println();
    }
}*/
/*import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        String text = "Hello world!"; // строка для записи
        try(FileOutputStream out=new FileOutputStream("/home/ddoniyor/javaFile.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            // перевод строки в байты
            byte[] buffer = text.getBytes();
            bos.write(buffer, 0, buffer.length);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}*/
//TODO:my own input and output stream
/*
import java.io.*;
public class javaStart{
    public static void main(String[] args){
        String text = "Don you made it like classes!";
        fileOutPut.fileOut(text);
        fileInput.fileIn();
    }
}
class fileOutPut{
    static void fileOut(String text){
        try(FileOutputStream out = new FileOutputStream("/home/ddoniyor/javaFile.txt")){
            byte[] buffer = text.getBytes();
            out.write(buffer,0,buffer.length);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}

class fileInput{
    static void fileIn(){
        try (FileInputStream in = new FileInputStream("/home/ddoniyor/javaFile.txt"))
        {
            byte[] bufferr = new byte[in.available()];
            in.read(bufferr, 0, bufferr.length);
            for(int i=0; i<bufferr.length;i++){

                System.out.print((char)bufferr[i]);
            }
            System.out.print("\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}*/

/*
import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        String text = "Привет мир!"; // строка для записи
        try(FileOutputStream fos=new FileOutputStream("/home/ddoniyor/javaFile.txt");
            PrintStream printStream = new PrintStream(fos))
        {

            printStream.println(text);
            System.out.println("Запись в файл произведена");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}
*/
//TODO:my DATAInOutStream
/*
import java.io.*;

public class javaStart {

    public static void main(String[] args) {
        Person tom = new Person("Tom", 34, 1.68, false);
        DataInOutStream.outputStream(tom);
        DataInOutStream.inputStream();
    }
}

class Person
{
    public String name;
    public int age;
    public double height;
    public boolean married;

    public Person(String n, int a, double h, boolean m)
    {
        this.name=n;
        this.height=h;
        this.age=a;
        this.married=m;
    }
}
class DataInOutStream{
    static void inputStream(){
        // обратное считывание из файла
        try(DataInputStream dos = new DataInputStream(new FileInputStream("/home/ddoniyor/data.bin")))
        {
            // записываем значения
            String name = dos.readUTF();
            int age = dos.readInt();
            double height = dos.readDouble();
            boolean married = dos.readBoolean();
            System.out.printf("Name: %s  Age: %d  Height: %f  Married: %b",
                    name, age, height, married);
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
    static void outputStream(Person tom){
        try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("/home/ddoniyor/data.bin")))
        {
            // записываем значения
            dos.writeUTF(tom.name);
            dos.writeInt(tom.age);
            dos.writeDouble(tom.height);
            dos.writeBoolean(tom.married);
            System.out.println("File has been written");
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}*/
/*
import java.io.*;

public class javaStart {

    public static void main(String[] args) {

        try(BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new FileWriter("/home/ddoniyor/javaFile.txt")))
        {
            // чтение построчно
            String text;
            while(!(text=br.readLine()).equals("ESC")){

                bw.write(text + "\n");
                bw.flush();
            }
        }
        catch(IOException ex){

            System.out.println(ex.getMessage());
        }
    }
}*/
//TODO:STERELIZATION
/*
import java.io.*;
import java.util.ArrayList;

public class javaStart {

    //@SuppressWarnings("unchecked")
    public static void main(String[] args) {

        String filename = "/home/ddoniyor/people.dat";
        // создадим список объектов, которые будем записывать
        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("Tom", 30, 175, false));
        people.add(new Person("Sam", 33, 178, true));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename)))
        {
            oos.writeObject(people);
            System.out.println("File has been written");
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        // десериализация в новый список
        ArrayList<Person> newPeople= new ArrayList<Person>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename)))
        {

            newPeople=((ArrayList<Person>)ois.readObject());
        }
        catch(Exception ex){

            System.out.println(ex.getMessage());
        }

        for(Person p : newPeople)
            System.out.printf("Name: %s \t Age: %d \n", p.getName(), p.getAge());
    }
}
class Person implements Serializable{

    private String name;
    private int age;
    private double height;
    private boolean married;

    Person(String n, int a, double h, boolean m){

        name=n;
        age=a;
        height=h;
        married=m;
    }
    String getName() {return name;}
    int getAge(){ return age;}
    double getHeight(){return height;}
    boolean getMarried(){return married;}
}*/
/*
class javaStart{
    public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            String input = in.next();
            boolean result = input.matches("(\\+*)\\d{11}");
            if(result){
                System.out.println("It is a phone number");
            }
            else{
                System.out.println("It is not a phone number!");
        }

    }
}
*/
/*
import java.util.concurrent.Exchanger;

public class javaStart {

    public static void main(String[] args) {

        Exchanger<String> ex = new Exchanger<String>();
        new Thread(new PutThread(ex)).start();
        new Thread(new GetThread(ex)).start();
    }
}

class PutThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    PutThread(Exchanger<String> ex){

        this.exchanger=ex;
        message = "Hello Java!";
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("PutThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}
class GetThread implements Runnable{

    Exchanger<String> exchanger;
    String message;

    GetThread(Exchanger<String> ex){

        this.exchanger=ex;
        message = "Hello World!";
    }
    public void run(){

        try{
            message=exchanger.exchange(message);
            System.out.println("GetThread has received: " + message);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
    }
}*/


/*import java.util.concurrent.Phaser;

public class javaStart {

    public static void main(String[] args) {

        Phaser phaser = new Phaser(1);
        new Thread(new PhaseThread(phaser, "PhaseThread 1")).start();
        new Thread(new PhaseThread(phaser, "PhaseThread 2")).start();

        // ждем завершения фазы 0
        int phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");
        // ждем завершения фазы 1
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        // ждем завершения фазы 2
        phase = phaser.getPhase();
        phaser.arriveAndAwaitAdvance();
        System.out.println("Фаза " + phase + " завершена");

        phaser.arriveAndDeregister();
    }
}

class PhaseThread implements Runnable{

    Phaser phaser;
    String name;

    PhaseThread(Phaser p, String n){

        this.phaser=p;
        this.name=n;
        phaser.register();
    }
    public void run(){

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что первая фаза достигнута
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }

        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndAwaitAdvance(); // сообщаем, что вторая фаза достигнута
        try{
            Thread.sleep(200);
        }
        catch(InterruptedException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(name + " выполняет фазу " + phaser.getPhase());
        phaser.arriveAndDeregister(); // сообщаем о завершении фаз и удаляем с регистрации объекты
    }
}*/
/*
import java.util.concurrent.locks.ReentrantLock;

public class javaStart {

    public static void main(String[] args) {

        CommonResource commonResource= new CommonResource();
        ReentrantLock locker = new ReentrantLock(); // создаем заглушку
        for (int i = 1; i < 6; i++){

            Thread t = new Thread(new CountThread(commonResource, locker));
            t.setName("Thread "+ i);
            t.start();
        }
    }
}

class CommonResource{

    int x=0;
}

class CountThread implements Runnable{

    CommonResource res;
    ReentrantLock locker;
    CountThread(CommonResource res, ReentrantLock lock){
        this.res=res;
        locker = lock;
    }
    public void run(){

        locker.lock(); // устанавливаем блокировку
        try{
            res.x=1;
            for (int i = 1; i < 5; i++){
                System.out.printf("%s %d \n", Thread.currentThread().getName(), res.x);
                res.x++;
                Thread.sleep(100);
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }
        finally{
            locker.unlock(); // снимаем блокировку
        }
    }
}*/
import java.util.stream.Stream;
/*
import java.util.*;
public class javaStart {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<String>();
        Collections.addAll(cities, "Париж", "Лондон", "Мадрид");
        cities.stream() // получаем поток
                .filter(s->s.length()==6) // применяем фильтрацию по длине строки
                .forEach(s->System.out.println(s)); // выводим отфильтрованные строки на консоль
    }
}*/

import java.util.stream.Stream;

/*
public class javaStart {

    public static void main(String[] args) {

        Stream<Integer> numbers = Stream.of(-3, -2, -1, 0, 1, 2, 3, -4, -5);
        numbers.sorted().takeWhile(n -> n < 0)
                .forEach(n -> System.out.println(n));
    }
}*/

public class javaStart{
    public static void main(String[] args){
    int [] index = new int[4];
    Scanner in = new Scanner(System.in);
    int s ;
    for(int i=0; i<4; i++){
        s = in.nextInt();
        index[i] =s;
    }

    for(int i=0; i<4; i++){
        System.out.println(index[i]);
    }
    int []mass ={1,3,4,5};
    for(int n : mass){
        System.out.println(n);
    }

}}