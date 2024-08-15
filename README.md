# 🎯 Percentage Calculator in Java

Welcome to the **Percentage Calculator** repository! This simple yet powerful program allows you to calculate your percentage based on the marks entered for five subjects. Whether you're a student or just someone looking to brush up on Java, this project is a perfect blend of logic and learning.

## 🚀 Getting Started

### Prerequisites:
- **Java Development Kit (JDK)** installed.
- A **Java IDE** (like IntelliJ IDEA, Eclipse) or simply a text editor with command line.

### Running the Program:
1. Clone the repository or download the code.
2. Open the project in your preferred IDE or compile using the terminal.
3. Run the `percentagecal` class.
4. Enter the marks for each subject as prompted.
5. Get your percentage calculated instantly! 🎉

## 💡 Code Breakdown

### Variables:
- **`sub1, sub2, sub3, sub4, sub5`**: These are `float` variables that store the marks for each subject. The use of `float` ensures that decimal values can be handled efficiently.

### Main Method:
- The **`main`** method is the starting point of the program. Here, we initialize the Scanner for input and guide the user through the process of entering their marks.

### Input Validation:
- The program uses `while(true)` loops for each subject to ensure that the marks entered are valid (i.e., less than or equal to 100). If invalid marks are entered, the user is prompted to try again.

### Percentage Calculation:
- The total marks are summed up and divided by 500 (since each subject is out of 100, and there are 5 subjects). The result is then multiplied by 100 to get the percentage.
  
```java
System.out.println("Your Percentage is " + (sub1+sub2+sub3+sub4+sub5)/500 * 100 +" %");
```

### Scanner Closure:
- The **`sc.close()`** command ensures that the Scanner is closed after input is complete, which is a good practice in Java programming.

## 🌀 Program Flow:

1. **Welcome Message**: The program greets the user and explains the task.
2. **Marks Entry**: The user is prompted to enter marks for each subject. 
3. **Validation**: If marks are invalid (greater than 100), the user is asked to re-enter them.
4. **Calculation**: Once valid marks are entered for all subjects, the percentage is calculated.
5. **Result Display**: The calculated percentage is displayed in a formatted manner.

## 🎨 Pro-Tips:

- **Input Validation**: Ensure that your marks are between 0 and 100.
- **Code Optimization**: Although the code works perfectly, you can try reducing redundancy by combining the loops into a function. 

## 📂 Directory Structure:

```bash
.
├── percentagecal.java
└── README.md
```
## 🤝 Contribute

Got ideas to optimize this code? Feel free to **fork the repository**, make improvements, and send a **pull request**. Whether it's refactoring the code, adding new features, or enhancing input validation, your contributions are always welcome!

## 🔗 Connect

If you found this project helpful or have any questions, feel free to reach out or follow me for more projects like this!

## 👨‍💻 About the Developer:

Crafted by **TechyDi**, a passionate Computer Science student with a knack for solving problems through code. Follow my journey as I explore Java, build cool projects, and share my knowledge with the world.

If you like what you see, don’t forget to **star the repository** ⭐ and follow me on GitHub!

---