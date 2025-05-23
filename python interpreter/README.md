🧠 Simple Interpreter
A basic interpreter implemented in Python that supports variable assignments, arithmetic operations, and print statements using an Abstract Syntax Tree (AST) structure. This project includes a lexer, parser, AST node definitions, and an interpreter that executes code line by line.

🚀 Features
✅ Variable declaration and assignment using let

✅ Arithmetic operations: +, -, *, /

✅ Print statements using print(...)

✅ Handles multiple sequential statements separated by semicolons

✅ Whitespace tolerant

✅ Custom lexer, parser, and interpreter components

📁 Project Structure
graphql
Copy
Edit
.
├── lexer.py           # Tokenizes source code
├── parser.py          # Builds AST from tokens
├── ast_nodes.py       # Defines AST node classes
├── interpreter.py     # Walks AST and executes code
├── main.py            # Entry point for running the interpreter
├── README.md          # Project documentation
📘 Language Syntax
