package utils;

import com.google.gson.Gson;
import lombok.Getter;
import reqres_color_objects.ColorDataList;
import reqres_user_objects.UserDataList;

public class ReqresTestUtils {

    @Getter
    private static int id;
    @Getter
    private static String email;
    @Getter
    private static String firstName;
    @Getter
    private static String lastName;
    @Getter
    private static String avatar;
    @Getter
    private static String name;
    @Getter
    private static int year;
    @Getter
    private static String color;
    @Getter
    private static String pantoneValue;

    public static void getUserData(String body, int num) {
        UserDataList userDataList = new Gson().fromJson(body, UserDataList.class);
        id = userDataList.getData().get(num).getId();
        email = userDataList.getData().get(num).getEmail();
        firstName = userDataList.getData().get(num).getFirstName();
        lastName = userDataList.getData().get(num).getLastName();
        avatar = userDataList.getData().get(num).getAvatar();
    }

    public static void getColorData(String body, int num) {
        ColorDataList colorDataList = new Gson().fromJson(body, ColorDataList.class);
        id = colorDataList.getData().get(num).getId();
        name = colorDataList.getData().get(num).getName();
        year = colorDataList.getData().get(num).getYear();
        color = colorDataList.getData().get(num).getColor();
        pantoneValue = colorDataList.getData().get(num).getPantoneValue();
    }
}
