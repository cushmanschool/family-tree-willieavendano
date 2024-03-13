public class FamilyTreeTester {
    public static void main(String[] args) {
        FamilyTree familyTree = new FamilyTree();

        // Add family members
        // Note: Implementation will depend on the constructors and methods you define.
        familyTree.addMember(new Person("John Doe", 40, null)); // Assuming null parent for the root person
        familyTree.addMember(new ExtendedFamilyMember("Jane Doe", 38, "John Doe", "Spouse"));
        familyTree.addMember(new Person("Jimmy Doe", 18, "John Doe"));

        // Search for a family member and display their lineage
        familyTree.searchAndDisplayLineage("Jimmy Doe");

        // Display the entire family tree
        familyTree.displayFamilyTree();
        
        System.out.println("Family tree testing completed successfully.");
    }
}
