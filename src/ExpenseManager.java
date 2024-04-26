import java.util.List;
import java.util.Map;

public class ExpenseManager {
    private List<Map<String, Double>> expenses;

    public ExpenseManager() {
        // Inicializar la lista de gastos
        this.expenses = new ArrayList<>();
    }

    public void addExpense(Map<String, Double> expense) {
        // Agregar un gasto a la lista
        this.expenses.add(expense);
    }

    public List<Map<String, Double>> getExpenses() {
        // Obtener todos los gastos registrados
        return this.expenses;
    }

    public Map<String, Double> summarizeExpensesByCategory() {
        // Sumarizar los gastos por categoría
        Map<String, Double> summary = new HashMap<>();
        for (Map<String, Double> expense : this.expenses) {
            for (Map.Entry<String, Double> entry : expense.entrySet()) {
                String categoria = entry.getKey();
                double gastos = entry.getValue();
                summary.put(category, summary.getOrDefault(categoria, 0.0) + gastos);
            }
        }
        return summary;
    }
}
