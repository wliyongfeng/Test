package li.test.examples.json.expense;

import java.util.Calendar;

public class JsonProcessorTest {
    
    private ExpenseDto createExpenseDto() {
        return new ExpenseDto("Li yongfeng", 60, "买菜", Calendar.getInstance());
    }

}
