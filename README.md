# Intern Tul process  
![Tul Logo](https://uploads-ssl.webflow.com/6317bc1b5fff7dde9f3b4156/63e165cc0d83c45f1d13b413_TUL_Mesa%20de%20trabajo%201.png)  
______________________________________________________________________  
## Exercise: Determine if a Binary Tree is a Binary Search Tree (BST)

### Explanation

- Why i chose this exercise?  
I chose this exercise because validating whether a binary tree is a binary search tree is an interesting and fundamental problem in computer science and i have worked in it before.

- how i solved this excersice?  
I solved the exercise using a recursive function that checks the conditions of a BST while traversing the tree.
______________________________________________________________________  
### Solution

1. I created a `TreeNode` class to represent the tree nodes, which includes the properties `data`, `left`, and `right`.

2. I implemented the `isBST` function in Python to check if the tree is a BST. This function calls a private method `isBSTValid` that performs the recursive verification.

3. The `isBSTValid` method compares the current node's value with `minValue` and `maxValue`. As the tree is traversed, these values are updated to ensure that the BST conditions are met.
______________________________________________________________________
### Instructions to Run the Code

- 1. Make sure you have NetBeans installed on your system.

- 2. Clone this repository from GitHub:

   ```
  git clone https://github.com/Karolart/Intern_TUL_assessment.git 
   ```

- 3. Navigate to the repository directory:

   ```
   cd src/Main.java
   ```

- 4. Run the code in Java:

   ```
   Run Main.java
   ```

- 5. You will see a message indicating whether the tree is a BST or not.
  ______________________________________________________________________
  ## Languages and Tools:  
  - :coffee: Java, NetBeans
  ______________________________________________________________________
  ## Autors:
  - LinkedIn: [karolart](https://www.linkedin.com/in/karolart/)
  - Discord: Karola#4030


