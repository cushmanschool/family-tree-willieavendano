# Family Tree Manager Project

## Project Overview
This project involves creating a Family Tree Manager in Java that allows users to construct, navigate, and display a family tree. The emphasis is on practicing inheritance and recursion, essential concepts in object-oriented programming and algorithmic thinking.

## Objectives
- Implement inheritance through Java classes.
- Utilize recursion for tree traversal and manipulation.
- Develop an interactive system to manage family relationships.

## Requirements

### Classes to Implement

#### Person
- The base class for individuals in the family tree.
- Fields: `name` (String), `age` (int), `parent` (Person)

#### ExtendedFamilyMember extends Person
- Represents detailed information about a family member.
- Additional Field: `relationship` (String)

### FamilyTree
- Manages the family tree structure.
- Key functionalities include adding family members, searching by name, and displaying the tree.

### Functionality
- **Add Family Members**: Implement functionality to add new `Person` or `ExtendedFamilyMember` instances to the tree, capturing family relationships.
- **Search Family Members**: Use recursion to search for members by name, displaying their lineage.
- **Display Family Tree**: Implement a recursive method to display the family hierarchy.

## Getting Started
1. Begin by defining the `Person` class, followed by `ExtendedFamilyMember` which extends `Person`.
2. Implement the `FamilyTree` class to manage the family members, including adding and searching functions.
3. Focus on utilizing recursion for searching and displaying the tree structure.

## Submission Guidelines
- Include all Java source files in your submission.
- Your code should be well-commented, explaining the implementation and logic, especially for recursive parts.
- Submit a short report detailing your design decisions, how you implemented recursion and inheritance, and any challenges you encountered.

## Additional Notes
- Consider edge cases in your tree structure, such as handling members with no known parents.
- Test your application thoroughly to ensure accuracy and robustness in tree management.
