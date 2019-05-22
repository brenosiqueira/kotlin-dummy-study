Depois organizo melhor

# complila e inclui dependencias no kotlin no jar
```sh
kotlinc hello.kt  -include-runtime -d hello.jar
java -jar hello.jar 
```

kotlinc -help

# complila sem inclui dependencias no kotlin no jar
```sh
kotlinc hello.kt -d helloNoRuntime.jar
kotlin -classpath hello.jar HelloKt
```

##### shell
kotlinc-jvm

##### script
vim list_folders.kts 
kotlinc -script list_folders.kts ~/dev/workspaces/java_intellij/
kotlinc -script list_folders.kts /home/brenosiqueira/dev/workspaces/java_intellij/



Based: https://try.kotlinlang.org/#/Examples

Another: https://play.kotlinlang.org/byExample/01_introduction/02_Functions

