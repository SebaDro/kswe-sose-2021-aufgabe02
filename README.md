# KSwe SoSe 2021 - Aufgabe 2

Ziel dieser Aufgabe soll es sein, den Workflow beim Arbeiten mit einem Versionskontrollsystem nachzuvollziehen.
Um die wichtigsten Kommandos kennenzulernen, soll dabei explizit mit der Kommandozeile
(Windows Powershell, Linux Bash oder Git Bash) gearbeitet werden.

## Aufgabe 2a): Git Basics

### Beschreibung

Es soll ein einfaches Java-Projekt erstellt werden, das als Git Repository initialisiert wird, um die Dateien einer
Versionsverwaltung hinzuzufügen. Schließlich soll das gesamte Projekt in einem Remote Repository bei GitLab gehostet werden.

### Vorgehensweise
Im Folgenden erfolgt die Beschreibung der Vorgehensweise unter Benennung der notwendigen Git Kommandos, die jedoch noch
nicht vollständig sind. Für eine detaillierte Beschreibung der Verwendung der Kommandos sei daher auf die
[Git Reference Documentation](https://git-scm.com/docs) verwiesen. Alle Git-Kommandos müssen im Root-Verzeichnis des
Java-Projekts ausgeführt werden! Achtet auch darauf, welche Hinweise euch die GitBash gibt, solltet ihr einmal einen 
Befehl nicht korrekt angegeben haben.

1. Git-Umgebung einrichten  
Installationsdateien für Git können unter folgendem Link heruntergeladen werden:
[git-scm.com/download/win](https://git-scm.com/download/win). Nach erfolgter Installation von Git kann über die
Kommandozeile mit dem Befehl `git --version` getestet werden, ob die Installation erfolgreich war (ggf. muss das
Installationsverzeichnis von Git der _PATH_ Variable hinzugefügt werden, damit Git-Befehle global in der Kommandozeile
aufgerufen werden können).  
 
2. Java Kommandozeilenprogramm  
Erstellt mit der IDE eures Vertrauens (Eclipse, Netbeans, IntelliJ, ...) ein einfaches Java Projekt mit einer
ausführbaren Klasse, die beim Ausführen "Hello Git!" ausgibt.

3. Lokales Git Repository initialisieren (über Git Bash)  
`git init`  

4. Dateien von der Versionsverwaltung ausschließen  
Erstellt eine _.gitignore_, die alle Dateien und Ordner enthält, die nicht von der Versionsverwaltung berücksichtigt
werden sollen. Für nützliche Patterns siehe: [.gitignore Reference](https://git-scm.com/docs/gitignore). Templates für
eine Vielzahl von Programmiersprachen und IDEs gibt's unter: https://github.com/github/gitignore  
Schließlich sollen lediglich der Ordner `src/`, einschließlich aller Java-Dateien, und die `.gitignore` von Git
getracked werden. Mit `git status` kann geprüft werden, welche Dateien aktuell berücksichtigt werden und welchen Status
diese aktuell aufweisen.

5. Dateien tracken (über Git Bash)    
`git add`

6. Commit erstellen (über Git Bash)    
`git commit`

7. Remote Repository bei GitLab anlegen  
Meldet euch bei GitLab an und erstellt ein eigenes neues Projekt. Das Projekt enthält ein Remote Repository, das ihr
nutzen sollt um das lokale Java Projekt dort zu hosten. Achtet beim Anlegen darauf, dass das Projekt beim Anlegen leer
bleibt (GitLab fragt z.B., ob das Projekt mit einer README.md angelegt werden soll. Das sollte nich erfolgen)!  

8. Änderungen in Remote Repository hochladen (über Git Bash)  
* Remote Repository dem Java Projekt hinzufügen  
`git remote add`
* Änderungen ins Remote Repository hochladen  
`git push`

9. Änderungen im Remote Repository vornehmen   
Ändert die ausführbare Klasse direkt in GitLab über den *GitLab Editor*, so dass zusätzlich "Hello GitLab!" ausgegeben wird.

10. Änderungen in lokales Repository einpflegen (über Git Bash)  
* `git pull` im lokalen Repository

## Aufgabe 2b) Git Merging

### Beschreibung

Es soll ein Merging von verschiedenen Git-Branches, die Konflikte enthalten, erfolgen. 
Die _merge conflicts_ sollen mit `git mergetool` in der (Git) Bash oder innerhalb einer IDE (Eclipse, IntelliJ, Netbeans)
gelöst werden.

### Vorgehensweise
1. Für die Nutzung von `git mergetool` unter Windows empfiehlt sich das Tool [KDiff3](http://kdiff3.sourceforge.net/).
Eine Anleitung zur Konfiguration findet ihr unter: https://stackoverflow.com/questions/33308482/git-how-configure-kdiff3-as-merge-tool-and-diff-tool.
Ihr könnt euch bei der Anpassung der _.gitconfig_ auch an das folgende Snippet halten, bei dem lediglich die Pfade zu eurer
KDiff3 Installation angepasst werden müssen: [.gitconfig Snippet](https://gitlab.fbg-hsbo.de/kswe-sose-2021/aufgabe02/snippets/7)  
Die `.gitconfig` ist üblicherweise in eurem $HOME-Verzeichnis zu finden. Falls ihr eure _.gitconfig_ nicht findet, könnt
ihr auch `git config --list --show-origin` aufrufen. Damit erhaltet ihr eine Liste aller aktuellen Konfigurationsparameter,
zusammen mit dem Pfad zur Konfigurationsdatei. Hier solltet ihr u.A. auch mehrere Einträge finden, die zu eurer _.gitconfig_ 
führen.

2. Sowohl der Branch `master` als auch der Branch `feature/point-distance` in diesen Repository haben
die Funktion `double distanceTo(Point other)` implementiert. Klont das Repository mit `git clone` in einen beliebigen
lokalen Ordner. Entscheidet anschließend, welcher der beiden Branches die richtige Lösung enthält und merged entsprechend.  
Dokumentationen zum Mergen mit Git findet Ihr unter https://git-scm.com/docs/git-merge und
https://git-scm.com/book/de/v2/Git-Branching-Einfaches-Branching-und-Merging.

### Ergebnis
Bei Ausführung von `Conflicts.java` sollte als Entfernung ungefähr `60232` ausgegeben werden.