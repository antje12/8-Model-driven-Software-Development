package examples.decisiondiagram;

import examples.decisiondiagram.dsl.DecisionDiagramDSL;
import examples.decisiondiagram.dsl.DecisionDiagramExecutor;
import examples.decisiondiagram.metamodel.DecisionDiagramMetamodel;

public class StudentLife extends DecisionDiagramDSL {
	public DecisionDiagramMetamodel build() {
		return
		decisiondiagram("Student life").
		  initial("How do you imagine your student life").
		    option("The main thing is to have the best time of my life").to("BestTime").
		    option("It's just the beginning of my dream career").to("DreamCareer").
		    option("Student life? I am interested in the curriculum and the degree").to("NoLife").
		  question("BestTime","What do you want to be doing during your studies?").
			option("Lots of parties and Friday beers, no time to study").to("GiveUp").
			option("Lots of books and curricular activities is the best").to("BeAStudent").
		  question("DreamCareer","And what does the beginning of your dream career look like").
		    option("Takings lots of interesting courses like MDSD").to("BeAStudent").
		    option("Everything except the MDSD course!").to("GiveUp").
		  goal("BeAStudent","Be a student").
		  goal("GiveUp","Don't be a student").
		  goal("NoLife","Go study - but a beer once in a while is OK").
		  done();
	}
	public static void main(String argv[]) {
		StudentLife s = new StudentLife();
		DecisionDiagramMetamodel mm = s.build();
		DecisionDiagramExecutor exec = new DecisionDiagramExecutor(mm);
		exec.run();
	}
}
