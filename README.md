# Binary Search Tree

A Java console-based application that demonstrates the implementation of a Binary Search Tree (BST) using Object-Oriented Programming principles. This project covers the fundamental operations of a Binary Search Tree, including node insertion, tree construction, size calculation, and element searching. The implementation is organized through multiple use cases developed using a Git feature branch workflow.

---

## About the Project

A Binary Search Tree (BST) is a non-linear data structure that stores elements in a hierarchical order, allowing efficient insertion and searching operations. This project is designed to provide a practical understanding of BST implementation in Java by progressively introducing its core operations.

The project begins with creating a simple Binary Search Tree by inserting the root and child nodes. It is then extended to construct a complete tree while verifying the total number of nodes using a size method. Finally, recursive searching is implemented to determine whether a given element exists in the tree.

Each use case is implemented in a separate feature branch and merged into the development branch, demonstrating both Java programming concepts and Git version control practices.

---

## Topics Covered

- Binary Search Tree
- Node Creation
- Node Insertion
- Tree Size Calculation
- Recursive Searching
- Tree Traversal Concepts
- Object-Oriented Programming
- Recursion

---

## Project Highlights

- Binary Search Tree implementation from scratch
- Recursive node insertion
- Size calculation of the tree
- Recursive search operation
- Feature branch development workflow
- Modular and reusable Java code

---

## Use Cases Implemented

| Use Case | Description |
|----------|-------------|
| UC1 | Create a Binary Search Tree by inserting the root node followed by left and right child nodes |
| UC2 | Construct a complete Binary Search Tree and calculate the total number of nodes using the size method |
| UC3 | Search for an element recursively to determine whether it exists in the Binary Search Tree |

---

## Features

- Create a Binary Search Tree
- Insert nodes while maintaining BST properties
- Count the total number of nodes
- Search for a specific element recursively
- Beginner-friendly implementation
- Modular Java code

---

## Technologies Used

- Java
- Object-Oriented Programming (OOP)
- Data Structures and Algorithms
- Recursion
- Git
- GitHub

---

## Project Structure

```text
BinarySearchTree/
│
├── src/
│   └── com/
│       └── bridgelabz/
│           └── binarysearchtree/
│               └── BinarySearchTree.java
│
├── README.md
└── .gitignore
```

---

## Objectives

- Understand the Binary Search Tree data structure.
- Learn how BST operations are implemented in Java.
- Analyze the time complexity of BST operations.
- Strengthen problem-solving skills using tree-based data structures.
- Gain practical experience with recursion and node manipulation.

---

## How to Run

### Clone the Repository

```bash
git clone https://github.com/Pavi512/BinarySearchTree.git
```

### Navigate to the Project Directory

```bash
cd BinarySearchTree
```

### Compile

```bash
javac src/Main.java src/com/bridgelabz/binarysearchtree/BinarySearchTree.java
```

### Run

```bash
java -cp src Main
```

---

## Time Complexity

| Operation | Average Case | Worst Case |
|-----------|--------------|------------|
| Search | O(log n) | O(n) |
| Insert | O(log n) | O(n) |
| Size | O(n) | O(n) |

The average-case complexity assumes the Binary Search Tree is reasonably balanced.

---

## Git Workflow

The project follows a feature branch workflow.

- main – Initial project setup
- dev – Development branch
- feature/UC1BST
- feature/UC2BST
- feature/UC3BST

Each feature branch introduces a new Binary Search Tree operation. After successful implementation and testing, the feature branch is merged into the `dev` branch, ensuring incremental development and a clean Git history.

---

## Learning Outcomes

After completing this project, you will be able to:

- Understand the Binary Search Tree data structure.
- Implement node insertion in a BST.
- Calculate the size of a Binary Search Tree.
- Perform recursive search operations.
- Analyze the performance of BST operations.
- Apply Object-Oriented Programming principles to data structures.
- Develop Java applications using a Git feature branch workflow.

---

## Repository

This repository demonstrates the implementation of Binary Search Tree operations through incremental development. Each use case builds upon the previous implementation, making it easier to understand BST concepts, recursion, and Object-Oriented Programming while following industry-standard Git workflows.

---

## License

This project is intended for educational and learning purposes.

---

## Author

Gondi Pavithra

GitHub: https://github.com/Pavi512
