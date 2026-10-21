# Programming Coursework: Web Development, Python and Java

Coursework from Brigham Young University–Hawaii: web development (CS 140, Fall 2025), Java (CS 202) and Python (CS 205). The repository holds the web development activities, projects and final project, plus the Python and Java lab programs, including a keyboard-controlled maze game.

## Skills practised

- Semantic HTML: headings, lists, links, tables, forms, images, audio and video
- CSS: selectors, the box model, positioning, Flexbox and Grid, print and responsive stylesheets
- Bootstrap framework and form handling with JavaScript (saved as JSON)
- Python: functions, loops, file input and output, command-line arguments, string processing, recursion and sorting algorithms
- Java: Swing graphics, arrays and `ArrayList`s, conditionals, reading files with `Scanner`, exception handling, and object-oriented design (classes, interfaces, abstract classes, inheritance, polymorphism, method overriding) with mouse and keyboard event handling
- Version control with Git and GitHub, using VS Code and Notepad++

## Repository structure

| Folder | What's inside |
|---|---|
| [`activities/`](activities/) | 14 short web development exercises, one skill per folder |
| [`projects/`](projects/) | 8 larger multi-file web projects plus two stand-alone pages |
| [`final/`](final/) | Final project proposal and the finished multi-page website |
| [`python-labs/`](python-labs/) | 4 Python lab programs and their input files |
| [`java-labs/`](java-labs/) | Java lab programs, images and data files |

## Web development (CS 140)

### Activities

| Folder | Topic |
|---|---|
| `learnhtml` | HTML tags, links, lists and page structure |
| `learncss` | CSS basics |
| `cssselectors` | CSS selectors |
| `boxmodel` | The CSS box model |
| `positioning` | CSS positioning |
| `flex` | Flexbox layout |
| `grid` | CSS Grid layout |
| `bootstrap` | Bootstrap framework |
| `images` | Images and favicons |
| `backgroundimages` | Background images |
| `tables` | HTML tables |
| `form` | HTML form with JavaScript handling |
| `video` | Embedding audio and video |
| `printpage` | Print and responsive stylesheets |

### Projects

| Folder | Description |
|---|---|
| `flexandgrid` | Page layout using Flexbox and Grid |
| `formprocessing` | Form with JavaScript processing |
| `forms` | HTML forms styled with CSS |
| `interests` | Personal interests page with a hero section |
| `myfamily` | Family page with a print stylesheet |
| `pagelayout` | Multi-section page layout |
| `phototour` | Multi-page photo tour with a home page and five location pages |
| `tables` | Styled HTML tables |

Two stand-alone pages, `internet.html` and `profilepage.html`, are also in the `projects/` folder.

### Final project

The [`final/`](final/) folder has a proposal page and a multi-page website on car maintenance and repairs. The site has an About page, a cost guide, DIY guides, a photo gallery, and contact and sign-up pages with JavaScript form handling.

## Python labs (CS 205)

| File | What it does |
|---|---|
| `lab.py` | Function that prints a name a set number of times, with an input-validation loop (commented out) |
| `lab2.py` | Reads a file named on the command line, counts the `8`s and adds up every digit |
| `lab3.py` | Reads a text file and labels each line `STATEMENT` or `NOT A STATEMENT` using rules about question marks, question words and pronouns |
| `lab4.py` | Reads integers from a file (one per line) and sorts them with a recursive quicksort |

Run any lab from its folder with a file name, for example:

```
python lab2.py input2-1.txt
```

## Java labs (CS 202)

### Basics and loops

| File | What it does |
|---|---|
| `hello.java`, `lab1.java`, `Seasider.java` | First programs: printing a message, and Swing windows that draw a knock-knock joke with `drawString` (`Seasider` is a second copy of the joke program) |
| `SheepFun.java` | Swing drawing of a sheep on a grassy background using ovals and rectangles |
| `LoopLab.java` | Draws an n × n multiplication or addition table with nested loops, with the size and mode chosen in dialog boxes |
| `MyArtwork.java` | Practice with `String` arrays, `split` and `for`, `while` and `do`-`while` loops |
| `Cookies.java` | Swing drawing of a snack-stand scene using shapes, colours, lines and text |
| `ConditionalLab.java` | Nested `if`/`else if` logic on user input from dialog boxes to choose which message and image to display |

### Methods, arrays and files

| File | What it does |
|---|---|
| `MethodExample.java` | Methods that call other methods (a birthday song) |
| `MethodsLab.java` | Reads drawing commands (`COLOR`, `CIRCLE`, `TRIANGLE`) from a text file, parses them with `split`, and draws the shapes using helper methods |
| `ArraysLab.java` | Reads shapes from a text file (one shape per line: a point count, then x y pairs) into two-dimensional arrays and draws each one as connected lines |
| `FileExample.java` | Reads names and ages from `friends.txt` into two `ArrayList`s with `Scanner`, with exception handling and a `continue` to skip an entry |

### Object-oriented programming

| File | What it does |
|---|---|
| `LemonadeStand.java` | Reusable class version of the stand, with private fields, two constructors, setters and a `draw` method |
| `Punch.java` | Scene with two `LemonadeStand` objects, customised through a constructor and setters |
| `LittlePrince.java`, `AsteroidB612.java` | A class with private fields, two constructors and a `draw` method, used to build a Swing scene with two objects |
| `Drawable.java` | Interface declaring a `draw(Graphics)` method |
| `Pokemon.java` | Abstract class with private fields, constants, an initializer block, overloaded constructors and an abstract `greeting` method |
| `Bulbasaur.java`, `Charmander.java`, `Pichu.java` | Subclasses of `Pokemon` showing inheritance, overloaded constructors and method overriding |
| `FunWithPokemon.java` | Swing app that keeps different `Pokemon` subclasses in one `ArrayList` (polymorphism) and handles mouse clicks and dragging |

### Maze game

| File | What it does |
|---|---|
| `Maze.java` | Keyboard-controlled maze game on a 4 × 4 grid of connected rooms (a two-dimensional array). One character moves with the arrow keys, picks up a sword and reaches the goal. A second character moves with W, A, S and D and defeats the first if it is unarmed. Includes win and lose dialogs and a game reset |
| `Room.java` | Implements `Drawable`. Each room links to its neighbours through north, south, east and west exits (two-way connections) and draws its walls and hallways based on which exits exist |
| `Sprite.java` | Abstract class implementing `Drawable`. Tracks the current room, draws an image centred in it, and moves between rooms only where an exit exists |
| `Nephi.java`, `Laban.java`, `Plates.java`, `Sword.java` | Subclasses of `Sprite` that load images and track state, such as whether a sword has been picked up |

### Data files

- Drawing files: `cis202.txt`, `happyface.txt`, `super.txt`, `square.txt` and `triangles.txt`. The first line holds the canvas width and height, then each line is one shape: a point count followed by x y pairs. `ArraysLab` reads shape lines only, so delete the first line of a copy of a file before using it with that program.
- Command files for `MethodsLab`: `david.txt`, `guy.txt`, `pumpkin.txt` and `superman.txt`, made of `COLOR`, `CIRCLE` and `TRIANGLE` lines.
- `friends.txt` for `FileExample`: names and ages.

To compile and run (needs a recent JDK, version 25 or newer):

```
javac *.java
java Maze
```

## Tools

HTML, CSS, JavaScript, Bootstrap, Python, Java, Git, GitHub, Visual Studio Code, Notepad++
