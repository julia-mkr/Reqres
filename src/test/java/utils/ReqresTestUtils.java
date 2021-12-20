package utils;

import com.google.gson.Gson;
import lombok.Getter;
import reqres_color_objects.ColorData;
import reqres_color_objects.ColorDataList;
import reqres_user_objects.UserData;
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

    public static UserData getUserData(String body, int num) {
        UserData userData = new UserData();
        UserDataList userDataList = new Gson().fromJson(body, UserDataList.class);
        userData.setId(userDataList.getData().get(num).getId());
        userData.setEmail(userDataList.getData().get(num).getEmail());
        userData.setFirstName(userDataList.getData().get(num).getFirstName());
        userData.setLastName(userDataList.getData().get(num).getLastName());
        userData.setAvatar(userDataList.getData().get(num).getAvatar());
        return userData;
    }

    public static ColorData getColorData(String body, int num) {
        ColorData colorData = new ColorData();
        ColorDataList colorDataList = new Gson().fromJson(body, ColorDataList.class);
        colorData.setId(colorDataList.getData().get(num).getId());
        colorData.setName(colorDataList.getData().get(num).getName());
        colorData.setYear(colorDataList.getData().get(num).getYear());
        colorData.setColor(colorDataList.getData().get(num).getColor());
        colorData.setPantoneValue(colorDataList.getData().get(num).getPantoneValue());
        return colorData;
    }
}
