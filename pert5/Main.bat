@echo off

REM Mengompilasi file Teks.java, Colors.java, dan Utama.java ke direktori bin
javac .\*.java

REM Menjalankan program dengan classpath menunjuk ke folder bin
java TransaksiJual

pause