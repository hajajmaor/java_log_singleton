# java log singleton

## What's the project about?

- Singeleton.
- How to log java code.
- How to save this log to a file.

---

## Getting Started

before getting started, please ensure you installed java JDK on you machine by using

```
javac --version
```

```
#clone repo
git clone https://github.com/hajajmaor/java_log_singleton.git
```

---

<center>
<H2>run with cli</H2>
</center>

```
cd java_log_singleton/src

#create binary file from java code
javac App.java

#if you want to create the binary in a diffrent folder use:
javac -d {path_you_want} App.java

#run the binary file
java App
```

<center>
<H2>run with ide</H2>
</center>

comman IDEs:

- [VSCode]
- [IDEA]

open the directory with your ide and run:

- [VSCode] - press ctrl+F5 (in MacOS: cmd+F5)

- [IDEA] - shift+F10

---

## What should happen?

1. Create a directory called `logs`.
2. Create a file called `log_file.log`.
3. you can change those names inside `src/MyLogger.java` in the privte constructor `private MyLogger()`.
4. as you develop the app, remember to log things like `user inputs`, `HTTP requests`, `status of transaction`, `Database connection`, things you need to check and ensure your application works at it's best!!!

## Folder Structure

The workspace contains two folders by default, where:

- `src`: where the magic happens
- `lib`: the folder to maintain dependencies - future use

## License

[MIT]

[//]: #
[vscode]: https://code.visualstudio.com/
[idea]: https://www.jetbrains.com/idea/
[mit]: https://choosealicense.com/licenses/mit/
