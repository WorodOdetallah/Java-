/*הגדרת המחלקה DrivingTest
הגדרת התכונות
♦ pass – מערך ממוין המכיל את מספרי הנבחנים שעברו.
הגדרת הפעולות
♦ פעולה בונה – הפעולה מקבלת מערך ממוין המכיל את מספרי הנבחנים שעברו את הטסט,
ומעתיקה אותו למערך pass .בחרנו להעתיק את המערך כדי להגן עליו מפני שינוי מבחוץ.
♦ didIPass – פעולה המקבלת מספר נבחן ומחזירה "אמת" אם מספר זה נמצא במערך
העוברים ו"שקר" אחרת. בפעולה זו נוכל לבצע חיפוש בינרי מכיוון שהמערך ממוין.
 */
public class DrivingTest {
    private int[] pass;

    public DrivingTest(int[] p) {
        pass = new int[p.length];
        for (int i = 0; i < p.length; i++) {
            pass[i] = p[i];
        }
    }

    public boolean didPass(int num) {
        int middle;
        int low = 0;
        int high = pass.length - 1;
        while (low <= high) {
            middle = (low + high) / 2;
            if (pass[middle] == num)
                return true;
            else {
                if (pass[middle] > num)
                    high = middle - 1;
                else
                    low = middle + 1;
            }
        }
        return false;
    }
}
