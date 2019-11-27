package miagem1;

import org.junit.Before;

import org.junit.Test;
import static org.junit.Assert.*;

public class QuestionAChoixExclusifTest {


        private QuestionAChoixExclusif uneQuestion;

        @Before
        public void setUp () throws Exception {
            //Instantialiser objet de type QACE
            uneQuestion = new QuestionAChoixExclusif ("un énoncé", 2);
        }

        @Test
        public void testGetEnonce () {
            //when : on demande l'énoncé de la question
            String resEnonce = uneQuestion.getEnonce();
            //then : énoncé non null
            assertNotNull(resEnonce);
            //and : énoncé égal à celui entré
            assertEquals(resEnonce, "un énoncé");
        }

        @Test
        public void testGetScoreIndice() {
            //when : un étudiant fournit l'indice correspondant à la bonne réponse
            int indiceEtudiant = 2;
            //and : on demande le calcul de son score
            Float resScore = uneQuestion.getScoreForIndice(indiceEtudiant);
            //then : le résultat obtenu est 100
            assertEquals(new Float (100f), resScore);

            //when : un étudiant fournit une mauvaise réponse
            indiceEtudiant=0;
            //and : on demande le calcul de son score
            resScore=uneQuestion.getScoreForIndice(indiceEtudiant);
            //then : le résultat obtenu est 0
            assertEquals(new Float(0f), resScore);

        }
    }
