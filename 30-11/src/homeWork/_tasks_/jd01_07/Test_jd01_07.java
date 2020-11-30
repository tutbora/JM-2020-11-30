package homeWork._tasks_.jd01_07;


import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

@SuppressWarnings("all")

//поставьте курсор на следующую строку и нажмите Ctrl+Shift+F10
public class Test_jd01_07 {

    @Test(timeout = 5000)
    public void testTaskA1_double__Scalar() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double.class);
        System.out.println("Создание переменной типа Scalar на основе числа 0.12345");
        Object scalar=c.newInstance(0.12345);
        System.out.println("было выполнено успешно. \nТестирование вывода значения 0.12345 через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение 0.12345", "0.12345", scalar.toString());
        System.out.println("выполнено успешно. Scalar="+scalar);
    }

    @Test(timeout = 5000)
    public void testTaskA2_Scalar__Scalar() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double.class);
        Object scalar=c.newInstance(0.12345);
        c=ok.aClass.getDeclaredConstructor(ok.aClass);
        System.out.println("Создание переменной типа Scalar на основе объекта Scalar(0.12345)");
        scalar=c.newInstance(scalar);
        System.out.println("было выполнено успешно. \nТестирование вывода значения 0.12345 через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение 0.12345", "0.12345", scalar.toString());
        System.out.println("выполнено успешно. Scalar="+scalar);
    }

    @Test(timeout = 5000)
    public void testTaskA3_String__Scalar() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(String.class);
        System.out.println("Создание переменной типа Scalar на основе строки 0.12345");
        Object scalar=c.newInstance("0.12345");
        System.out.println("было выполнено успешно. \nТестирование вывода значения 0.12345 через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение 0.12345", "0.12345", scalar.toString());
        System.out.println("выполнено успешно. Scalar="+scalar);
    }



    @Test(timeout = 5000)
    public void testTaskB1_double__Vector() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double[].class);
        System.out.println("Создание переменной типа Vector на основе массива {1,2,4}");
        Object vector=c.newInstance(new double[]{1,2,4});
        System.out.println("было выполнено успешно. \nТестирование вывода значения {1,2,4} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {1.0, 2.0, 4.0}", "{1.0, 2.0, 4.0}", vector.toString());
        System.out.println("выполнено успешно. Vector="+vector);
    }

    @Test(timeout = 5000)
    public void testTaskB2_Vector__Vector() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double[].class);
        Object vector=c.newInstance(new double[]{1,2,4});
        c=ok.aClass.getDeclaredConstructor(ok.aClass);
        System.out.println("Создание переменной типа Vector на основе объекта Vector({1,2,4})");
        vector=c.newInstance(vector);
        System.out.println("было выполнено успешно. \nТестирование вывода значения {1,2,4} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {1.0, 2.0, 4.0}", "{1.0, 2.0, 4.0}", vector.toString());
        System.out.println("выполнено успешно. Vector="+vector);
    }

    @Test(timeout = 5000)
    public void testTaskB3_String__Vector() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(String.class);
        System.out.println("Создание переменной типа Vector на основе строки {1,2,4}");
        Object vector=c.newInstance("{1,2,4}");
        System.out.println("было выполнено успешно. \nТестирование вывода значения {1,2,4} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {1.0, 2.0, 4.0}", "{1.0, 2.0, 4.0}", vector.toString());
        System.out.println("выполнено успешно. Vector="+vector);
    }


    @Test(timeout = 5000)
    public void testTaskC1_double__Matrix() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double[][].class);
        System.out.println("Создание переменной типа Matrix на основе массива {{1,2},{3,4}}");
        Object matrix=c.newInstance(new Object[]{new double[][]{{1,2},{3,4}}});
        System.out.println("было выполнено успешно. \nТестирование вывода значения {{1,2},{3,4}} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {{1.0, 2.0}, {3.0, 4.0}}", "{{1.0,2.0},{3.0,4.0}}", matrix.toString().replaceAll(" ",""));
        System.out.println("выполнено успешно. Matrix="+matrix);
    }

    @Test(timeout = 5000)
    public void testTaskC2_Matrix__Matrix() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(double[][].class);
        Object matrix=c.newInstance(new Object[]{new double[][]{{1,2},{3,4}}});
        c=ok.aClass.getDeclaredConstructor(ok.aClass);
        System.out.println("Создание переменной типа Matrix на основе объекта Matrix({{1,2},{3,4}})");
        matrix=c.newInstance(matrix);
        System.out.println("было выполнено успешно. \nТестирование вывода значения {{1,2},{3,4}} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {{1.0, 2.0}, {3.0, 4.0}}", "{{1.0,2.0},{3.0,4.0}}", matrix.toString().replaceAll(" ",""));
        System.out.println("выполнено успешно. Matrix="+matrix);
    }

    @Test(timeout = 5000)
    public void testTaskC3_String__Matrix() throws Exception {
        Test_jd01_07 ok=run("",false);
        assertEquals("У вас неверное наследование", "Var", ok.aClass.getSuperclass().getSimpleName());

        Constructor c=ok.aClass.getDeclaredConstructor(String.class);
        System.out.println("Создание переменной типа Matrix на основе строки {{1,2},{3,4}}");
        Object matrix=c.newInstance("{{1,2},{3,4}}");
        System.out.println("было выполнено успешно. \nТестирование вывода значения {{1,2},{3,4}} через метод toString()");
        System.out.flush();
        assertEquals("Не было получено ожидаемое значение {{1.0, 2.0}, {3.0, 4.0}}", "{{1.0,2.0},{3.0,4.0}}", matrix.toString().replaceAll(" ",""));
        System.out.println("выполнено успешно. Matrix="+matrix);
    }




    /*
===========================================================================================================
НИЖЕ ВСПОМОГАТЕЛЬНЫЙ КОД ТЕСТОВ. НЕ МЕНЯЙТЕ В ЭТОМ ФАЙЛЕ НИЧЕГО.
Но изучить как он работает - можно, это всегда будет полезно.
===========================================================================================================
 */
    //-------------------------------  методы ----------------------------------------------------------
    private Class findClass(String SimpleName) {
        String full = this.getClass().getName();
        String dogPath = full.replace(this.getClass().getSimpleName(), SimpleName);
        try {
            return Class.forName(dogPath);
        } catch (ClassNotFoundException e) {
            fail("\nERROR:Тест не пройден. Класс " + SimpleName + " не найден.");
        }
        return null;
    }

    private Method checkMethod(String className, String methodName, Class<?>... parameters) throws Exception {
        Class aClass = this.findClass(className);
        try {
            methodName = methodName.trim();
            Method m;
            if (methodName.startsWith("static")) {
                methodName = methodName.replace("static", "").trim();
                m = aClass.getDeclaredMethod(methodName, parameters);
                if ((m.getModifiers() & Modifier.STATIC) != Modifier.STATIC) {
                    fail("\nERROR:Метод " + m.getName() + " должен быть статическим");
                }
            } else
                m = aClass.getDeclaredMethod(methodName, parameters);
            m.setAccessible(true);
            return m;

        } catch (NoSuchMethodException e) {
            System.err.println("\nERROR:Не найден метод " + methodName + " либо у него неверная сигнатура");
            System.err.println("ERROR:Ожидаемый класс: " + className);
            System.err.println("ERROR:Ожидаемый метод: " + methodName);
            return null;
        }
    }

    private Method findMethod(Class<?> cl, String name, Class... param) {
        try {
            return cl.getDeclaredMethod(name, param);
        } catch (NoSuchMethodException e) {
            fail("\nERROR:Тест не пройден. Метод " + cl.getName() + "." + name + " не найден\n");
        }
        return null;
    }

    private Object invoke(Method method, Object o, Object... value) {
        try {
            method.setAccessible(true);
            return method.invoke(o, value);
        } catch (Exception e) {
            System.out.println(e.toString());
            fail("\nERROR:Не удалось вызвать метод " + method.getName() + "\n");
        }
        return null;
    }


    //метод находит и создает класс для тестирования
    //по имени вызывающего его метода, testTaskA1 будет работать с TaskA1
    private static Test_jd01_07 run(String in) {
        return run(in, true);
    }

    private static Test_jd01_07 run(String in, boolean runMain) {
        Throwable t = new Throwable();
        StackTraceElement trace[] = t.getStackTrace();
        StackTraceElement element;
        int i = 0;
        do {
            element = trace[i++];
        }
        while (!element.getMethodName().contains("test"));

        String[] path = element.getClassName().split("\\.");
        String nameTestMethod = element.getMethodName();
        String clName = nameTestMethod.replace("test", "");
        clName = clName.replaceFirst(".+__", "");
        clName = element.getClassName().replace(path[path.length - 1], clName);
        System.out.println("\n---------------------------------------------");
        System.out.println("Старт теста для " + clName);
        if (!in.isEmpty()) System.out.println("input:" + in);
        System.out.println("---------------------------------------------");
        return new Test_jd01_07(clName, in, runMain);
    }

    //-------------------------------  тест ----------------------------------------------------------
    public Test_jd01_07() {
        //Конструктор тестов
    }

    //переменные теста
    private String className;
    private Class<?> aClass;
    private PrintStream oldOut = System.out; //исходный поток вывода
    private PrintStream newOut; //поле для перехвата потока вывода
    private StringWriter strOut = new StringWriter(); //накопитель строки вывода

    //Основной конструктор тестов
    private Test_jd01_07(String className, String in, boolean runMain) {
        //this.className = className;
        aClass = null;
        try {
            aClass = Class.forName(className);
            this.className = className;

        } catch (ClassNotFoundException e) {
            fail("ERROR:Не найден класс " + className + "\n");
        }
        InputStream reader = new ByteArrayInputStream(in.getBytes());
        System.setIn(reader);   //перехват стандартного ввода
        System.setOut(newOut);  //перехват стандартного вывода

        if (runMain) //если нужно запускать, то запустим, иначе оставим только вывод
            try {
                Class[] argTypes = new Class[]{String[].class};
                Method main = aClass.getDeclaredMethod("main", argTypes);
                main.invoke(null, (Object) new String[]{});
                System.setOut(oldOut); //возврат вывода, нужен, только если был запуск
            } catch (Exception x) {
                x.printStackTrace();
            }
    }


    //проверка вывода
    private Test_jd01_07 is(String str) {
        assertTrue("ERROR:Ожидается такой вывод:\n<---начало---->\n" + str + "<---конец--->",
                strOut.toString().equals(str));
        return this;
    }

    private Test_jd01_07 include(String str) {
        assertTrue("ERROR:Строка не найдена: " + str + "\n", strOut.toString().contains(str));
        return this;
    }

    private Test_jd01_07 exclude(String str) {
        assertTrue("ERROR:Лишние данные в выводе: " + str + "\n", !strOut.toString().contains(str));
        return this;
    }


    //логический блок перехвата вывода
    {
        newOut = new PrintStream(new OutputStream() {
            private byte bytes[] = new byte[1];
            private int pos = 0;

            @Override
            public void write(int b) throws IOException {
                if (pos == 0 && b == '\r') //пропуск \r (чтобы win mac и linux одинаково работали
                    return;
                //ок. теперь можно делать разбор
                if (pos == 0) { //определим кодировку https://ru.wikipedia.org/wiki/UTF-8
                    if ((b & 0b11110000) == 0b11110000) bytes = new byte[4];
                    else if ((b & 0b11100000) == 0b11100000) bytes = new byte[3];
                    else if ((b & 0b11000000) == 0b11000000) bytes = new byte[2];
                    else bytes = new byte[1];
                }
                bytes[pos++] = (byte) b;
                if (pos == bytes.length) { //символ готов
                    String s = new String(bytes); //соберем весь символ
                    strOut.append(s); //запомним вывод для теста
                    oldOut.append(s); //копию в обычный вывод
                    pos = 0; //готовим новый символ
                }
            }
        });
    }
}
