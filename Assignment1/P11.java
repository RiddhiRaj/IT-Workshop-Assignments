public class P11 {
    public static void main(String[] args) {
        float percentage = Float.parseFloat(args[0]);
		if(percentage >= 90)
			System.out.println("\nGrade A for scoring " + percentage + "% of marks.\n");
		else if(percentage >= 80)
			System.out.println("\nGrade B for scoring " + percentage + "% of marks.\n");
		else if(percentage >= 70)
			System.out.println("\nGrade C for scoring " + percentage + "% of marks.\n");
		else if(percentage >= 60)
			System.out.println("\nGrade D for scoring " + percentage + "% of marks.\n");
		else if(percentage >= 40)
			System.out.println("\nGrade E for scoring " + percentage + "% of marks.\n");
		else
			System.out.println("\nGrade F for scoring " + percentage + "% of marks.\n");
    }
}
