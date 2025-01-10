import java.util.ArrayList;

public class Gestion {
    import ArrayList;
import java.util.List;

    public class PersonnelManager {
        private List<Employee> employees = new ArrayList<>();

        // Créer un employé
        public void createEmployee(String name, String position) {
            Employee employee = new Employee(name, position);
            employees.add(employee);
        }

        // Modifier un employé
        public void modifyEmployee(int id, String newName, String newPosition) {
            for (Employee emp : employees) {
                if (emp.getId() == id) {
                    emp.setName(newName);
                    emp.setPosition(newPosition);
                    break;
                }
            }
        }

        // Supprimer un employé
        public void deleteEmployee(int id) {
            employees.removeIf(emp -> emp.getId() == id);
        }

        // Visualiser les informations d’un employé
        public Employee viewEmployee(int id) {
            for (Employee emp : employees) {
                if (emp.getId() == id) {
                    return emp;
                }
            }
            return null;
        }

        // Afficher l’historique d’un employé
        public List<Project> getEmployeeHistory(int id) {
            Employee emp = viewEmployee(id);
            return emp != null ? emp.getProjectHistory() : null;
        }
    }

}
