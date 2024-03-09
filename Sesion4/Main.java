public class Main {
   static Exercise1 instExercise1 = new Exercise1();
   static Exercise2 instExercise2 = new Exercise2();
   static Agenda inst_agenda = new Agenda();
   static ListaTareas inst_ListaTareas = new ListaTareas();

   public static void main(String[] args) {
       instExercise1.showExercise1();
       instExercise2.showExercise2();
       inst_agenda.inPutData();
      inst_ListaTareas.inPutDataList();
   }

}