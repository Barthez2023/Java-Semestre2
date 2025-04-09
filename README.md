# Java-Semestre2
Dan sce ripo il ya me s code sjava de la deuxieme annee semestre 2

Dans le projet System enreigistrement , nous avons creer un systeme qui recupere les donnes et les stcike dans une fichier txt et dans un fichier excel.
Pour le stockage dans le fichier txt  nous avons utilise les bibliotheque 
            (FileOutputStream fos = new FileOutputStream("Veir.txt",true);
            OutputStreamWriter wr=new OutputStreamWriter(fos,Charset.forName("ISO-8859-9"));
            BufferedWriter bw =new BufferedWriter(wr);)
ceux qui nous permet d'ecrire dans le fichier txt.

Pour le stockage dans le fichier excel noui savon sajoute rune bibliothe dans notre projet aui permet a java de gerer l'appel des fichier excel.Il s'agit de la biblitheque ***org.apache.poi***  et dans notre fichier pom.xml nous avons ajouter cette bibliotheque d ela maniere suivante
(<dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>3.13-beta1</version>
            <type>jar</type>
        </dependency>
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.4.1</version>
        </dependency>
        <!-- Dépendances de poi-ooxml -->
        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi</artifactId>
            <version>5.4.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml</artifactId>
            <version>5.4.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.poi</groupId>
            <artifactId>poi-ooxml-full</artifactId>
            <version>5.4.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.xmlbeans</groupId>
            <artifactId>xmlbeans</artifactId>
            <version>5.1.1</version>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-collections4</artifactId>
            <version>4.4</version>
        </dependency>

        <dependency>
            <groupId>org.apache.commons</groupId>
            <artifactId>commons-compress</artifactId>
            <version>1.26.0</version>
        </dependency>)
a l'interieur de des balise <dependencies> </dependencies> et ensuite on a "Faire un clique droit sur le dossier de notre project pui sclique sur l'option clean and Build."
L'ajout de cette bibliotheque nous permet de manipuler les fichier exceld e la maniere suivante :
        Workbook workbook = new XSSFWorkbook();                        // Créer un nouveau fichier Excel
        Sheet sheet = workbook.createSheet("Feuille1");                 // creer une nouvelle feuille

        // Écrire une ligne
        Row row = sheet.createRow(0);               //  creation de la ligne ligne 0
        Cell cell1 = row.createCell(0);             //creation de la colonne  colonne 0
        Cell cell2 = row.createCell(1);             //  idem colonne 1
        Cell cell3 = row.createCell(2);             //  idem colonne 2
        Cell cell4 = row.createCell(3);             //  idem colonne 3
        Cell cell5 = row.createCell(4);             //  idem colonne 4
        Cell cell6 = row.createCell(5);             //  idem colonne 5
        Cell cell7 = row.createCell(6);             //  idem colonne 6
        Cell cell8 = row.createCell(7);             //  idem colonne 7
        Cell cell9 = row.createCell(8);             //  idem colonne 8
        
        cell1.setCellValue("Ad      ");             // on ajoute des element a la colonne 1
        cell2.setCellValue("Soyad    ");            // idem colonne 2
        cell3.setCellValue("Telefon    ");          // idem colonne 3
        cell4.setCellValue("Durum     ");           // idem colonne 4
        cell5.setCellValue("Kan Grupu  ");          // idem colonne 5
        cell6.setCellValue("Il         ");          // idem colonne 6
        cell7.setCellValue("Ilce      ");           // idem colonne 7
        cell8.setCellValue("Adress     ");          // idem colonne 8
        cell9.setCellValue("Ilgi     ");            // idem colonne 9

et ainsi de suite on creer une ligne apres on creer une colonne et on ajoute des elements aux colonnes.
        
        
