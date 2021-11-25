public enum Gender {
    MALE("МУЖСКОЙ", ""),
    FEMALE("ЖЕНСКИЙ", "а"),
    UNKNOWN("НЕИЗВЕСТНО", ""),
    ATTACKHELICOPTER8AH64APACHE("БОЕВОЙ ВЕРТОЛЕТ 8 AH-64 Apache", "");

    private final String gender;
    private final String genderCase;

    Gender(String gender, String genderCase) {
        this.gender = gender;
        this.genderCase = genderCase;
    }

    public String getGender() {
        return gender;
    }

    public String getGenderCase() {
        return genderCase;
    }
}
