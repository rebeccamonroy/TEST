public enum WordBankType {

    EASY(new String[] { "Bear", "Elephant", "Kangaroo", "Soccer", "Journey", "Foreigner", "nose", "cheese", "mouse",
            "cookie", "milk", "snake", "ghost" }),
    DIFFICULT(new String[] { "yummy", "wave", "snowfalke", "backbone", "treasure", "garbage", "photograph", "mattress",
            "password", "electricity", "shallow" }),
    VERYDIFFICULT(
            new String[] { "discombobulate", "collywobbles", "zigzagging", "yachtsman", "wristwatch", "xylophone" });

    private String[] words;

    private WordBankType(String[] words) {
        this.words = words;
    }

    public String getRandomWord() {
        return words[((int) (Math.random() * words.length - 1))];
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
