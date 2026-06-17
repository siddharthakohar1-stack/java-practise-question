//Siddhartha Kohar - 116234
public class LibrarySystemApp {
    public static void main(String[] args) {

        // Polymorphic Array: Mixing structurally distinct classes under a shared Interface type
        Searchable[] libraryCatalog = {
                new EBook("Java Deep Dive", "Object-oriented structures, interfaces, and patterns."),
                new PhysicalBook("The Clean Coder", "Aisle 12, Tier 3")
        };

        String searchToken = "interface";
        System.out.println("=== Global Library Index Query: '" + searchToken + "' ===");

        // Unified loop executing distinctly adapted actions 
        for (Searchable item : libraryCatalog) {
            item.search(searchToken);
            System.out.println("-----------------------------------------------------");
        }
    }
}