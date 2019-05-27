package webservice;
import javax.jws.WebService;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;

@WebService
public class EchoTime
  {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

    public String echo(String chaine)
      {
          return chaine;
      }
    public String getTimeByZone(String zone)
    {
        if(zone.equals("FR"))
        {
            LocalDateTime now = LocalDateTime.now();
            return dtf.format(now);
        }
        else
          return "erreur";

    }
}
