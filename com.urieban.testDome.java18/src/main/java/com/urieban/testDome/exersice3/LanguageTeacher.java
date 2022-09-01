package com.urieban.testDome.exersice3;

public class LanguageTeacher extends LanguageStudent {
	
	public boolean teach(LanguageStudent student, String language) {
		Boolean canTeach = this.getLanguages().contains(language);
		if(canTeach)
			student.addLanguage(language);
		return canTeach;
	}
	
	public static void main(String[] args) {
      LanguageTeacher teacher = new LanguageTeacher();
      teacher.addLanguage("English");

      LanguageStudent student = new LanguageStudent();
      teacher.teach(student, "English");

      for(String language : student.getLanguages())
          System.out.println(language);
    }

}
