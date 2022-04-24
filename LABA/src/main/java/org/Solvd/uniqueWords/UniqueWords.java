package org.Solvd.uniqueWords;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.commons.io.FileUtils;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class UniqueWords {
    private static final Logger LOGGER = LogManager.getLogger(UniqueWords.class);

    //Read the file and count the number of words
    public static void main (String[] args) {
        String txt="";
        try {
            txt = FileUtils.readFileToString(new File("src/main/Resources/TestOraclesPlanningforTestAutomation.txt"), "UTF-8").toLowerCase();
        } catch (IOException e) {
            LOGGER.error(e);
        }
        int c=0;

        HashMap<String,Integer> results= new HashMap<String,Integer>();
        txt = txt.replaceAll("\\,"," ");
        txt = txt.replaceAll("\\."," ");
        txt = txt.replaceAll("\\-"," ");
        txt = txt.replaceAll("\\?"," ");
        txt = txt.replaceAll("\\¿"," ");
        txt = txt.replaceAll("\\("," ");
        txt = txt.replaceAll("\\)"," ");
        String[] arraytxt = txt.split(" ");
        for (String word : arraytxt){
            if(results.containsKey(word)){
                results.put(word, results.get(word)+1);
            }else
                results.put(word, 1);
            c++;
        }
        try {
            FileUtils.writeStringToFile(new File("src/main/Resources/results.txt"), "There are "+ c+" unique words\n"+"List of words found in the article and number of ocurrences:"+ results.toString(), "UTF-8");
            LOGGER.info("There are "+ c+" unique words");
        } catch (IOException e) {
            LOGGER.error(e);
        }
    }
}


