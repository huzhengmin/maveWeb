import com.gaotai.WeekDay;
import org.junit.Test;

/**
 * @author： hzm
 * @date： 2021/2/26 9:11
 * @description： TODO
 * @modifiedBy：
 * @version:
 */
public class EnumTest {
    @Test
    public void temp1()
    {
        String temp = "----------------------------------";
        //1、ordinal(),枚举顺序值
        System.out.println("枚举顺序值,"+ WeekDay.MONDAY.ordinal());//1
        System.out.println(temp);
//        /*
//         * 2、valueOf()
//         * public static <T extends Enum<T>> T valueOf(Class<T> enumType, String name)
//         * enumType -- 这是枚举类型，返回一个常量的类的对象。
//         * name -- 这是常量，要返回的名称。
//         * return:此方法返回具有指定名称的枚举类型的枚举常量。
//         * 如果你传了一个不存在的字符串，那么会抛出异常。
//         * */
        System.out.println(temp);
        WeekDay week = Enum.valueOf(WeekDay.class,WeekDay.MONDAY.name().toString());
        WeekDay week1 = WeekDay.valueOf(WeekDay.class,WeekDay.MONDAY.name());
        System.out.println("Enum.valueOf,"+week);//MONDAY
        System.out.println("WeekDay.valueOf,"+week1);//MONDAY
        System.out.println(temp);

        //3、values()
        System.out.println("WeekDay.values(),"+WeekDay.values());//返回一个WeekDay数组,[Ljavase.enumeration.WeekDay;@2a84aee7
        System.out.println(temp);
        //4、通过compareTo方法比较,实际上其内部是通过ordinal()值比较的
        System.out.println("WeekDay.MONDAY.compareTo(WeekDay.TUESDAY),"+WeekDay.MONDAY.compareTo(WeekDay.TUESDAY));//false
        System.out.println(temp);
        //5、获取该枚举对象的Class对象引用,当然也可以通过getClass方法
        Class<?> declaringClass = WeekDay.MONDAY.getDeclaringClass();
        System.out.println("获取该枚举对象的Class对象引用,"+declaringClass);//javase.enumeration.WeekDay
        System.out.println(temp);
        //6、通过getEnumConstants()获取该枚举类型的所有元素，如果Class对象不是枚举类型，则返回null。
        Object[] enumConstants = declaringClass.getEnumConstants();
        //枚举类个数,WeekDay.values().length)
        for (int i = 0; i < WeekDay.values().length; i++) {
            System.out.println("getEnumConstants,"+enumConstants[i]);//SUNDAY、MONDAY、TUESDAY、WEDNESDAY、THURSDAY、FRIDAY、SATURDAY
        }
        System.out.println(temp);
        //7、判断是否是枚举类型
        System.out.println("declaringClass.isEnum(),"+declaringClass.isEnum());//true
        System.out.println(temp);
        //8、获取枚举变量的属性
        System.out.println("编号,"+WeekDay.SATURDAY.getId()+",含义,"+WeekDay.SATURDAY.getMeaning());
        System.out.println(temp);
        System.out.println(WeekDay.SATURDAY);
    }
}
