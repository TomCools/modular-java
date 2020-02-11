# Setup Repo

This repository contains the base framework I use to demo Java Modular Applications

Work in Progress!

## Notes

- Had to use a higher Maven Compiler version to decently support Modules (>3.8.0)
- Writing the created JAR files to a different location
- Kept getting a module-path error with kotlin. Had to disable kotlin plugin completely: https://intellij-support.jetbrains.com/hc/en-us/community/posts/360000891860-Kotlin-Compile-Error


## Commands
### Running Java Modular Jars
java --module-path app-console.jar;domain.jar;infra-duvel.jar --module app.console/pub.console.Main
or if in correct folder
java --module-path . --module app.console/pub.console.Main

### Modules
java --list-modules

java --describe-module java.se

jdeps (-summary) NAME.jar

jdeps -s --module-path . app-console.jar

### JLink

jlink --add-modules java.base --output C:\Users\tomco\javamod-demo\newjre
jlink -p . --add-modules app.console --output <path>

jlink -p . --add-modules app.console,infra.duvel --launcher start=app.console/pub.console.Main --output c:\users\tomco\javamod-demo\runnable