package somesalary;

public enum Level {
    SENIOR("SE"), MIDDLE("M"), JUNIOR("J"), TRAINEE("TR");


    Level(String somelevel) {
        this.somelevel = somelevel;
    }

    private String somelevel;

}
