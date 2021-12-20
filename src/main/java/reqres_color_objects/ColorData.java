package reqres_color_objects;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class ColorData {

    int id;
    String name;
    int year;
    String color;
    @SerializedName("pantone_value")
    String pantoneValue;
}

