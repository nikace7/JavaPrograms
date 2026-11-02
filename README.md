# JavaPrograms

A comprehensive repository of **Object-Oriented Programming**, **Advanced Java (Swing / AWT)**, **Enterprise Web Architectures (Servlets & JSP)**, and **Database Persistence (JDBC / RowSet)** implementations.

<br/>

[![Java SE](https://img.shields.io/badge/Java_SE-17%2B-005222?style=flat-square&logo=openjdk&logoColor=f7f5f1)](https://www.oracle.com/java/)
&nbsp;
[![Enterprise](https://img.shields.io/badge/Enterprise-Servlets_·_JSP-005222?style=flat-square)](https://jakarta.ee/)
&nbsp;
[![GUI Architecture](https://img.shields.io/badge/GUI-Swing_·_AWT-15181e?style=flat-square)](https://docs.oracle.com/javase/tutorial/uiswing/)
&nbsp;
[![Database](https://img.shields.io/badge/Database-JDBC_·_RowSet-15181e?style=flat-square&logo=mysql&logoColor=f7f5f1)](https://docs.oracle.com/javase/tutorial/jdbc/)
&nbsp;
[![Curriculum](https://img.shields.io/badge/Tribhuvan_University-BSc_CSIT-007136?style=flat-square)](https://prime.edu.np)
&nbsp;
[![Build](https://img.shields.io/badge/Build-Apache_Ant-15181e?style=flat-square&logo=apacheant&logoColor=f7f5f1)](https://ant.apache.org/)

---

### Overview

This repository archives systematic implementations across the Java software development spectrum—spanning core language foundations, desktop event-driven GUI systems, relational database transactional handling, and enterprise server-side web development. Developed as part of the **BSc Computer Science and Information Technology (BSc CSIT)** curriculum at **Prime College, Tribhuvan University**.

---

### Module Breakdown

```
JavaPrograms/
├── Java Practices/            # Core Java, Design Patterns, OOP, I/O & Exceptions
├── AdvancedJavaLabA/          # Advanced Java Labs: Swing, Event Delegation & JDBC
├── PrimeCSITA/                # Jakarta EE / Web Architecture: Servlets & JSP
└── JavaApplication1/          # NetBeans Application Sandbox
```

---

### 1. Core Java & Object-Oriented Design (`Java Practices/`)
Standalone programs illustrating design patterns, memory semantics, and core libraries:
- **OOP Principles:** Abstract classes, multiple inheritance via interfaces, method overloading/overriding, and dynamic method dispatch.
- **Exception Architecture:** Custom user-defined exception hierarchies (e.g., `AgeError`), multi-catch blocks, and resource cleanup with `try-with-resources`.
- **I/O Streams & Serialization:** Byte streams (`FileInputStream`/`FileOutputStream`), character streams (`BufferedReader`/`FileWriter`), and binary object persistence via `Serializable` (`ObjectOutputStream`/`ObjectInputStream`).
- **Multithreading:** Thread lifecycle management via `Thread` subclassing and `Runnable` implementations, synchronization primitives, and inter-thread communication.

---

### 2. Advanced Desktop & Event-Driven Systems (`AdvancedJavaLabA/`)
A structured NetBeans project demonstrating desktop software engineering with Java Foundation Classes:

#### Lab 2: Layout Managers & Complex Swing Containers
- Form creation with advanced layout algorithms: `BorderLayout`, `FlowLayout`, `GridLayout`, `GridBagLayout`, `BoxLayout`, and `CardLayout`.
- Rich components: `JTable` with custom table models, `JTree` hierarchy nodes, `JTabbedPane`, `JMenuBar`, `JMenu`, `JMenuItem`, and context menus.

#### Lab 3: Java Event Delegation Model
- Separation of event sources and listeners adhering to the observer design pattern.
- Implementations of `ActionListener`, `ItemListener`, `FocusListener`, `KeyListener`, `MouseListener`, `MouseMotionListener`, and `WindowListener`.
- Reducing boilerplate using adapter classes (`WindowAdapter`, `MouseAdapter`).
- Complex GUI calculators and interactive validators with dynamic event handling.

#### Lab 4: JDBC Relational Persistence & Data-Bound Forms
- **Statement vs. PreparedStatement:** SQL query execution with parameter binding to prevent SQL injection vulnerabilities.
- **Scrollable & Updatable ResultSets:** Moving cursor pointers (`first()`, `last()`, `absolute()`) and performing in-place record mutations.
- **RowSet Implementations:** Disconnected database access using `JdbcRowSet` and `CachedRowSet`.
- **Desktop Database Integration (`SwingFo.java`):** End-to-end CRUD desktop application binding Swing text inputs directly to a relational SQL database.

---

### 3. Server-Side Enterprise Architecture (`PrimeCSITA/`)
Enterprise web development components configured for servlet containers (Apache Tomcat):
- **HTTP Servlets:** Request handling (`doGet`, `doPost`), query parameter parsing, and response header control.
- **Session Tracking Mechanisms:** Comparative implementations of `HttpSession`, client-side cookies, hidden form fields, and URL rewriting.
- **JavaServer Pages (JSP):** Directive declarations, scriptlets, expression language (EL), and JSP standard actions (`<jsp:include>`, `<jsp:forward>`).
- **MVC Pattern:** Request routing through servlets as controllers and dispatching to JSP views via `RequestDispatcher`.

---

### Project Structure

```
JavaPrograms/
├── AdvancedJavaLabA/
│   ├── src/
│   │   ├── advancedjavalab2/  # Swing layouts, menus, toolbars, tables
│   │   ├── advancedJavaLab3/  # Event listeners (Action, Mouse, Key, Window)
│   │   └── advancedJavaLab4/  # JDBC CRUD, PreparedStatements, RowSets
│   ├── nbproject/             # NetBeans project configuration
│   └── build.xml              # Apache Ant build script
├── Java Practices/            # Core Java scripts (.java and compiled .class)
│   ├── AbstractClassDemo.java
│   ├── AgeError.java
│   ├── WindowEventDemo.java
│   └── ...
├── PrimeCSITA/                # Java EE Web Project
│   ├── src/java/com/          # Servlets, filters, and controller classes
│   ├── web/                   # JSP pages, HTML assets, and WEB-INF/web.xml
│   ├── nbproject/
│   └── build.xml
└── README.md
```

---

### Compilation & Execution

#### Running Individual Practices (CLI / VS Code)
Compile and execute any standalone program with the Java Development Kit (JDK 17+):
```bash
cd "Java Practices"
javac AbstractClassDemo.java
java AbstractClassDemo
```

#### Running NetBeans / Ant Projects
Open the repository root in **Apache NetBeans**, or build and run directly via Apache Ant:
```bash
# Build and run AdvancedJavaLabA
cd AdvancedJavaLabA
ant compile
ant run

# Build the Web Application WAR for Tomcat
cd ../PrimeCSITA
ant dist
```

---

### Author

**Nikesh Khatri**  
Software Engineer — Kathmandu, Nepal  
- Website: [nikeshkhatri.com.np](https://nikeshkhatri.com.np)  
- GitHub: [@nikace7](https://github.com/nikace7)  
- LinkedIn: [Nikesh Khatri](https://www.linkedin.com/in/nikesh-khatri-2b04582a9/)  
- Email: [khatrinikace@gmail.com](mailto:khatrinikace@gmail.com)
