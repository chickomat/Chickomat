import java.util.*;
import processing.serial.*;


 boolean mouseIsInside(float x1,  float y1, float x2, float y2)
    {
        float lowX = Math.min(x1, x2);
        float lowY = Math.min(y1, y2);
        float highX = Math.max(x1, x2);
        float highY = Math.max(y1, y2);

        return (mouseX > lowX && mouseX < highX && mouseY > lowY && mouseY < highY);
    }
    