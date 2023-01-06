package mk.fcse.musicplatformbackend.model.helper;

import lombok.Data;

@Data
public class MusicProfessionalHelper {

    private String musicProfessionalName;
    private String musicProfessionalSurname;
    private String musicProfessionalProfession;

    public MusicProfessionalHelper(String musicProfessionalName, String musicProfessionalSurname, String musicProfessionalProfession) {
        this.musicProfessionalName = musicProfessionalName;
        this.musicProfessionalSurname = musicProfessionalSurname;
        this.musicProfessionalProfession = musicProfessionalProfession;
    }

}
