# Lox Programming Language

from [Crafting Interpreters](http://craftinginterpreters.com)

## [Map of the Territory](http://craftinginterpreters.com/a-map-of-the-territory.html)
Here we learn some basic understanding of how compiler / interpreter pipeline work. Just the rough idea but decent enough for further understanding of the topic.

General pipeline of a language (in place of terms compiler / interpreter) are :
1. Scanning / Lexing
2. Parsing
3. Static Analysis
4. Intermediate Representation
5. Optimisation
6. Code Generation

## Project

From Root Project

### Build
```
./gradlew lox
```

### Run
```
java -jar build/libs/lox.jar
```

### Testing
```
# https://docs.gradle.org/current/userguide/java_testing.html
./gradlew test
```

## Scanning / Lexing
Convert source sequence of characters to sequence of tokens.

Example
```
# Source
var userName = "Hello World";
var age = 12;

# Lexemes
> var userName = "Hello World";
VAR var null
IDENTIFIER userName null
EQUAL = null
STRING "Hello World" Hello World
SEMICOLON ; null
EOF  null
> var age = 12;
VAR var null
IDENTIFIER age null
EQUAL = null
NUMBER 12 12.0
SEMICOLON ; null
EOF  null
```