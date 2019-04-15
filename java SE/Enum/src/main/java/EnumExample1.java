public class EnumExample1 {

    public static void main(String[] args) {
        Level level = Level.Easy;
        switch (level) {
            case Easy:
                System.out.println("kolay");
                break;
            case Medium:
                System.out.println("orta");
                break;
            case Hard:
                System.out.println("zor");
                break;
            default:
                break;
        }

    }
}
