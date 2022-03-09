package mao.spring_mvc_formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Project name(项目名称)：Spring_MVC_Formatter
 * Package(包名): mao.spring_mvc_formatter
 * Class(类名): MyFormatter
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/3/9
 * Time(创建时间)： 12:48
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Component
public class MyFormatter implements Formatter<Date>
{
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Override
    public Date parse(String text, Locale locale) throws ParseException
    {
        return dateFormat.parse(text);
    }

    @Override
    public String print(Date object, Locale locale)
    {
        return dateFormat.format(object);
    }
}
