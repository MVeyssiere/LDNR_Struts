package actions;

import com.opensymphony.xwork2.ActionSupport;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 *
 * @author Herbert Caffarel <herbert.caffarel@cicef.pro>
 */
public class AboutAction extends ActionSupport {

    private static int visits = 0;

    @Override
    public String execute() throws Exception {
        return SUCCESS;
    }

    public String getToday() {
        visits++;
        return LocalDate.now().format(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM));
    }

    public int getVisits() {
        return visits;
    }

}
