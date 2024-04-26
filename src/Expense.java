package tarea_viernes;




public class Expense {
	
    private double gastos;
    private String categoria;

    
    
    public Expense(double amount, String categoria) {
        this.gastos = gastos;
        this.categoria = categoria;
    }

   
    public double getgastos() {
        return gastos;
    }

    public void setgastos(double amount) {
        this.gastos = amount;
    }

    public String getcategoria() {
        return categoria;
    }

    public void setcategoria(String category) {
        this.categoria = categoria;
    }

	public void Expense(double gastos, String categoria) {
    	
        if (gastos <= 0) {
            throw new IllegalArgumentException("La cantidad del gasto debe ser mayor que cero.");
        }
        this.gastos  = gastos;
        
        if (categoria == null || categoria.trim().isEmpty()) {
            throw new IllegalArgumentException("La categoría del gasto no puede estar vacía.");
        }
        this.categoria = categoria.trim();
    }

    }
}
	
	
	
	
	
