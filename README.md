# Zhvillimi i aplikacionit që mundëson enkriptimin me AES


Universiteti i Prishtinës - Fakulteti i Inxhinierisë Elektrike dhe Kompjuterike

#### Detyra e tretë ne lëndën: Siguria në internet

## Përmbajtja e projektit

AplikacioniAES është projekt që përdoret si aplikacion për enkriptim dhe dekriptim të tekstit që ne e dërgojmë si hyrje me çelësin përkatës.
Në këtë projekt kemi përdorur jdk19, javafx si dhe maven i cili është mjet për menaxhimin e projektit në gjuhën programuese Java i bazuar në POM (Project Object Model).

* Për të klonuar këtë projekt në mjedisin tuaj lokal, thjesht shkruani në get from version control url:
```
https://github.com/Blerina2/aplikacioniAES.git
```
* Ky projekt është ndërtuar në Intellij IDEA Ultimate (Linku per download: https://www.jetbrains.com/idea/download/#section=windows)

> **_INFO:_** Nëse jeni profesor/student mund të merrni një licencë JetBrains falas për të gjitha produktet (programming tools) duke përdorur emailin tuaj të universitetit (https://www.youtube.com/watch?v=1Bc5w05j-i8)

* Kjo mund të funksionojë në platforma të tjera nëse janë keto teknologji të instaluar:

| Technology used | Version                      | 
|-----------------|------------------------------|
| Java            | OpenJDK-19                   |  
| Maven           | build- dependency management |  
| Javafx          | 0.0.8                        |
| eu.hansolo      | 11.1                         |

## Parakushtet

##### Cilat gjëra ju nevojiten për të instaluar softuerin dhe si t'i instaloni ato


* Javafx  : (https://www.youtube.com/watch?v=XEdd5PQ34Lo)
* Maven (ne disa tools eshte buld-in) : (https://www.youtube.com/watch?v=WASIyomqarc)

<p></p>

* eu.hansolo konfigurohet duke shkuar ne file pom.xml dhe ndryshuar versionin ne 11.1:

![eu.hansolo.gif](src/main/resources/figurat/eu.hansolo.gif)

# Si punon aplikacioni

1. Duke e bërë run projektin nga klasa AesApplication.java neve do na shfaqet  nje popup:

![Aestab.png](src/main/resources/figurat/Aestab.png)

1. Key mund ta ndryshojm me kusht se duhet te jet max:128 bit

#### Per te enkriptuar nje fjali(si dhe shfaqja e mundesis se ndrimit te key) veprojm në ketë mënyrë: 

![enkriptimi.gif](src/main/resources/figurat/enkriptimi.gif)

#### Per te dekriptuar veprojm në ketë mënyrë:

![dekriptim.gif](src/main/resources/figurat/dekriptim.gif)



Projeki është punuar nga:
```
Blerina Beka
Erëza Ismajli
```

Profesori i lëndës:
 
<pre>PhD.c Mërgim Hoti </pre>
