# SQL Parser Project (ANTLR4 + Java)

This project uses **ANTLR 4.13.2** to generate a SQL parser and run it using Java.

---

## Prerequisites

- Java JDK (8 or newer)
- ANTLR 4.13.2 JAR file located in the `lib/` directory
- Project structure similar to the following:

```
project-root/
├─ lib/
│  └─ antlr-4.13.2-complete.jar
├─ src/
│  ├─ antlr/
│  │  └─ Sql.g4
│  ├─ app/
│  │  └─ Main.java
│  ├─ utilsClasses/
│  └─ tests/
│     └─ test1.txt
├─ bin/
└─ README.md
```

---

## Step 1: Generate ANTLR Files

If you make **any modifications** to the `.g4` grammar files, you must regenerate the ANTLR source files.

Run the following command from the project root directory:

```bash
java -jar lib/antlr-4.13.2-complete.jar -o src/antlr -Dlanguage=Java src/antlr/Sql.g4 -visitor
```

This command:
- Generates Java source files from `Sql.g4`
- Places the generated files in `src/antlr`
- Enables the Visitor pattern

---

## Step 2: Compile the Project

Compile all Java source files using the following command:

```bash
javac -cp ./lib/antlr-4.13.2-complete.jar -d bin src/antlr/*.java src/app/*.java src/utilsClasses/*.java
```

This will:
- Include ANTLR in the classpath
- Compile all source files
- Output compiled `.class` files into the `bin/` directory

---

## Step 3: Run the Program

To run the application, execute:

```bash
java -cp ".\\lib\\antlr-4.13.2-complete.jar;.\\bin" app.Main src/tests/test1.txt
```

Where:
- `app.Main` is the main entry point of the program
- `src/tests/test1.txt` is the input file to be parsed

---

## Notes

- Always regenerate ANTLR files after editing `Sql.g4`
- Make sure the `bin/` directory exists before compiling
- Classpath separators differ by OS (`;` for Windows, `:` for Linux/macOS)

---

## Example (Linux / macOS Classpath)

```bash
java -cp "./lib/antlr-4.13.2-complete.jar:./bin" app.Main src/tests/test1.txt
```

---

## License

This project is for educational purposes.

