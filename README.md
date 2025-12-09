# **Student Scoresheet – Java Console Application**

A Java console application that manages and displays academic records for a class of **12 students** across **6 subjects**, calculating totals, averages, and assigning letter grades based on performance.

---

##  **Overview**

This program captures, processes, and displays student academic performance in a structured and formatted report. It is ideal for teachers who want a quick digital scoresheet for class assessments.

---

##  **File Information**

| Field | Description |
|-------|-------------|
| **Filename** | `student_scoresheet.java` |
| **Language** | Java |
| **Class Name** | `student_scoresheet` |
| **Type** | Console Application |

---

##  **Purpose**

This program acts as a digital academic scoresheet that allows educators to:

- Record student information and subject scores  
- Automatically compute total marks and averages  
- Assign letter grades based on performance  
- Generate a full formatted class report  
- View class-level statistics and grade distribution  

---

##  **Features**

### **1. School Information Input**  
Collects key administrative details:
- School Name  
- Teacher Name  
- Grade Level  
- Academic Year  

---

### **2. Student Data Collection**  
For exactly **12 students**, the program records:
- Student Name  
- Scores for 6 subjects:  
  - English  
  - Math  
  - History  
  - Geography  
  - Science  
  - Programming  

---

### **3. Automated Calculations**

#### **Individual Student Metrics**
- **Total Score** → Sum of all 6 subjects (max 600)
- **Letter Grade (Rank)** based on total score:

| Grade | Range | Percentage |
|--------|--------|--------------|
| **A** | ≥ 540 | 90–100% |
| **B** | 480–539 | 80–89% |
| **C** | 420–479 | 70–79% |
| **D** | 360–419 | 60–69% |
| **F** | < 360 | Below 60% |

#### **Class Statistics**
- Subject totals (sum across all students)  
- Subject averages  
- Class total  
- Class average  
- Grade count distribution (A, B, C, D, F)  

---

### **4. Formatted Report Output**

The program prints a structured academic report containing:

- Header with school information  
- Table of students showing:
  - Name  
  - Scores for all 6 subjects  
  - Total score  
  - Letter rank  
- Footer showing:
  - Subject totals  
  - Subject averages  
  - Class average  
  - Grade distribution summary  

---

##  **Data Structures Used**

### **Arrays**

| Array Name | Type | Size | Purpose |
|------------|-------|-------|----------|
| `StudentNames` | String[] | 12 | Student names |
| `English` | float[] | 12 | English scores |
| `Math` | float[] | 12 | Math scores |
| `Science` | float[] | 12 | Science scores |
| `History` | float[] | 12 | History scores |
| `Geography` | float[] | 12 | Geography scores |
| `Programming` | float[] | 12 | Programming scores |
| `studentTotal` | float[] | 12 | Total per student |
| `studentRank` | String[] | 12 | Letter grades |
| `subjectTotals` | float[] | 6 | Total per subject |
| `subjectAverages` | float[] | 6 | Subject averages |

### **Variables**
- `countA`, `countB`, `countC`, `countD`, `countF` – grade counters  
- `classTotal` – sum of all student totals  
- `classAverage` – overall average  
- `scanner` – for input  

---

##  **Program Flow**

1. Initialize grade counters  
2. Input school information  
3. Loop 12 times to collect student details and subject marks  
4. Process records:  
   - Calculate totals  
   - Determine grade  
   - Accumulate subject totals  
5. Compute class totals and averages  
6. Print formatted report  

---

##  **Input Requirements**

### **School Information**
- School Name  
- Teacher Name  
- Grade (Integer)  
- Year (Integer)  

### **Per Student (12 Students)**
- Student Name  
- Scores in the 6 subjects (Float values, typically 0–100)  

---

##  **Output Format**

### **Header**
- School name  
- Teacher name  
- Grade  
- Year  

### **Student Table**
Columns include:
- Student Name (20 chars wide)  
- English  
- Math  
- History  
- Geography  
- Science  
- Programming  
- Total  
- Rank  

### **Footer**
- Subject totals  
- Subject averages  
- Class total  
- Class average  
- Grade distribution summary  

---

##  **Grading System**

| Grade | Score Range | Percentage |
|--------|--------------|--------------|
| **A** | 540–600 | 90–100% |
| **B** | 480–539 | 80–89% |
| **C** | 420–479 | 70–79% |
| **D** | 360–419 | 60–69% |
| **F** | 0–359 | 0–59% |

---

##  **Technical Notes**

- Uses **Scanner** for input  
- Uses `printf()` for aligned formatting  
- Clears input buffer using `nextLine()`  
- Uses format specifiers such as:  
  - `%.2f` → two decimal places  
  - `%-20s` → left-aligned text  
  - `%10.2f` → right-aligned numeric values  

---

##  **Dependencies**

- `java.util.Scanner` (standard Java library)

---

