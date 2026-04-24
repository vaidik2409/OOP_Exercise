# SET-3 (Basic OOP concepts-1)

---

## Practical 10: Bank Account with Static Interest Rate

**Problem Statement:**
Design a class `BankAccount` with `account_holder_name` and `balance`. Use a **static variable** `interest_rate` common to all accounts. Implement methods to calculate and display the interest earned. Include a **static method** to update the interest rate.

**Sample Output:**
```text
Enter the interest rate for all accounts (%): 7

Enter account holder name for account 1: vaidik
Enter balance for account 1: 100000

Enter account holder name for account 2: manav
Enter balance for account 2: 200000

Account 1 Details:
Account Holder: vaidik
Balance: 100000.0
Interest Rate: 7.0%
Interest Earned: 7000.0

Account 2 Details:
Account Holder: manav
Balance: 200000.0
Interest Rate: 7.0%
Interest Earned: 14000.0
```

---

## Practical 11: College Admission using Inner Class

**Problem Statement:**
Write a Java program to model a college admission system using **inner classes**. Create an outer class `College` with `collegeName`, and an inner class `Admission` with student-specific details (`studentName`, `course`). Allow input and display of student information along with the college name.

**Sample Output:**
```text
Enter college name: ssasit              

1. Add Student
2. Display All Students
3. Exit
Enter your choice: 1
Enter student name: vaidik
Enter course to enroll: computer engineering

1. Add Student
2. Display All Students
3. Exit
Enter your choice: 1     
Enter student name: manav
Enter course to enroll: Information Technology

1. Add Student
2. Display All Students
3. Exit
Enter your choice: 2

--- College: ssasit ---

Student 1 Details:
Student Name: vaidik
Course Enrolled: computer engineering

Student 2 Details:
Student Name: manav
Course Enrolled: Information Technology

1. Add Student
2. Display All Students
3. Exit
Enter your choice: 3
Exiting program...
```

---

## Practical 12: Method Overloading for 3D Shape Volumes

**Problem Statement:**
Write a Java program that demonstrates **method overloading** to calculate the volume of different 3D shapes. Implement overloaded methods `calculateVolume()` for:

* Cube (side length)
* RectangularCube (length, width, height)
* Sphere (radius)

**Sample Output:**
```text
How many shapes do you want to calculate volumes for? 3

Shape 1:
Enter shape type (cube/rectangle/sphere): cube
Enter side of cube: 26
Shape 1:
Enter shape type (cube/rectangle/sphere): cube
Enter side of cube: 26
Enter side of cube: 26
Volume of Cube: 17576.0

Shape 2:
Enter shape type (cube/rectangle/sphere): rectangle
Enter length: 22
Enter width: 64
Enter height: 41
Volume of Rectangular Cube: 57728.0

Shape 3:
Enter shape type (cube/rectangle/sphere): sphere
Enter radius of sphere: 15
Volume of Sphere: 14137.166941154068
```
