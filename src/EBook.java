//Siddhartha Kohar - 116234
class EBook implements Searchable {
    private String title;
    private String digitalTextContent;

    public EBook(String title, String digitalTextContent) {
        this.title = title;
        this.digitalTextContent = digitalTextContent;
    }

    @Override
    public void search(String keyword) {
        System.out.println("Initiating full-text scan across EBook: \"" + title + "\"...");

        // Simulating text searching logic
        if (digitalTextContent.toLowerCase().contains(keyword.toLowerCase())) {
            System.out.println("-> Success: Keyphrase found instantly in digital file chapters.");
        } else {
            System.out.println("-> Phrase match not detected in digital string files.");
        }
    }
}

// Concrete sibling implementation using physical storage lookup logic
class PhysicalBook implements Searchable {
    private String title;
    private String shelfLocation; // e.g., "Aisle 4, Shelf C"

    public PhysicalBook(String title, String shelfLocation) {
        this.title = title;
        this.shelfLocation = shelfLocation;
    }

    @Override
    public void search(String keyword) {
        System.out.println("Checking central card catalog system for Physical Book: \"" + title + "\"...");
        System.out.println("-> Cross-referencing index records for metadata matching: '" + keyword + "'");
        System.out.println("-> Physical copy location mapped to: [" + shelfLocation + "]");
    }
}