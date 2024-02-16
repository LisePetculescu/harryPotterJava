package edu.hogwarts.data;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class InitData {

        public Course getPotionClass() {
            // houses:
            House slytherin = new House("Slytherin", "Salazar Slytherin", new String[]{"Green", "Silver"});
            House gryffindor = new House("Gryffindor", "Godric Gryffindor", new String[]{"Red", "Gold"});
            House hufflepuff = new House("Hufflepuff", "Helga Hufflepuff", new String[]{"Yellow", "Black"});
            House ravenclaw = new House("Ravenclaw", "Rowena Ravenclaw", new String[]{"Blue", "Bronze"});

            // teachers:
            HogwartsTeacher horaceSlughorn = new HogwartsTeacher("Horace", "", "Slughorn", "Professor",
                    LocalDate.of(1920, Month.JANUARY, 1), LocalDate.of(1981, Month.JUNE, 30), slytherin, false);

            // list of students from 1991
            List<HogwartsStudent> hogwartsStudents1991 = new ArrayList<>();

            // students from Gryffindor
            hogwartsStudents1991.add(new HogwartsStudent("Harry", "James", "Potter", 1991, 1998, true, gryffindor, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Hermione", "Jean", "Granger", 1991, 1998, true, gryffindor, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Ronald", "Bilius", "Weasley", 1991, 1998, true, gryffindor, false, null));

            // students from Hufflepuff
            hogwartsStudents1991.add(new HogwartsStudent("Cedric", "", "Diggory", 1991, 1998, true, hufflepuff, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Hannah", "", "Abbott", 1991, 1998, true, hufflepuff, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Ernie", "", "Macmillan", 1991, 1998, true, hufflepuff, false, null));

            // students from Ravenclaw
            hogwartsStudents1991.add(new HogwartsStudent("Luna", "", "Lovegood", 1991, 1998, true, ravenclaw, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Cho", "", "Chang", 1991, 1998, true, ravenclaw, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Terry", "", "Boot", 1991, 1998, true, ravenclaw, false, null));

            // students from Slytherin
            hogwartsStudents1991.add(new HogwartsStudent("Draco", "", "Malfoy", 1991, 1998, true, slytherin, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Pansy", "", "Parkinson", 1991, 1998, true, slytherin, false, null));
            hogwartsStudents1991.add(new HogwartsStudent("Vincent", "", "Crabbe", 1991, 1998, true, slytherin, false, null));

            // Subjects:
            Subject potions = new Subject("Potions", 2, true);

            // teaching Materials:
            TextBook potionTextBook = new TextBook("Potion Making: A Beginner's Guide", false, true, true, "Essential textbook for potion-making class", "Potion Making: A Beginner's Guide", "Miranda Goshawk", "Broom Publishing", 1994);
            Tool cauldron = new Tool("Cauldron", true, true, false, "Required for brewing potions", "Standard size cauldron for potion brewing");
            Wand wand = new Wand("Potion Master's edu.hogwarts.data.Wand", false, true, true, "Essential tool for potion masters", 12.5, "Yew", "Dragon heartstring");
            Ingredient boomslangSkin = new Ingredient("Boomslang Skin", true, true, false, "Rare and difficult to obtain ingredient", "Boomslang Skin", 2.5, "ounces");

            // list of teaching materials:
            List<TeachingMaterial> potionMaterials = Arrays.asList(potionTextBook, cauldron, wand, boomslangSkin);

            // courses:

            return new Course(potions, horaceSlughorn, hogwartsStudents1991.toArray(new HogwartsStudent[0]), potionMaterials.toArray(new TeachingMaterial[0]));
        }

}
