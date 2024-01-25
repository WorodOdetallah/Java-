/* matrix: מערך דו-ממדית המכיל איברים מטיפוס ממשי
isMatrixSeries : פעולה בוליאנית הבודקת אם המטריציה היא "סדרתית" פעולה זו משתמשת בתבנית האם כל הערכים בסדרה מקיימים תנאי נבצע זאת כך :
1: עבור כל שורה במטריציה נבצע :
1:1 אם השורה אינה סדרה חשבונית נחזיר "שקר"
1:2 נחזיר "אמת"
isRowArithmetic: פעולה בוליאנית המקבלת מספר שורה ובודקת אם היא סדרה חשבונית או לאץ פעולה זו שימושית רק לצורך ביצוע הפעולה
isMatrixSeries
ולכן היא תוגדר כפרטית . האלגוריתם למימוש פעולה זו ישתמש בצבנית המוכרת לנו מעבר על זוגות סמוכים בסדרה .
 */
public class Serial{
    private double [][] matrix;
    public Serial (int n , int m) {
        matrix = new double[n][m];
    }
    // פעולת גישה לעדכון איבר במטריציה
    public void setVal(int row, int col, int val) {
        matrix[row][col] = val;
    }
    // פעולה פרטית תבדוק אם השורה הנתונה היא סדרה חשבונית
    private boolean isRowArithmetic(int row){
        double distance = matrix[row][1] - matrix[row][0];
        for (int i = 2; i < matrix[row].length; i++)
            if (matrix[row][i] - matrix[row][i-1] != distance)
                return false;
        return true;
        }
        //פעולה תבדוק אם המטריציה היא "סדרתית"
    public boolean isMatrixSeries() {
        for (int i = 0; i < matrix.length; i++) {
            if (!isRowArithmetic(i))
                return false;
        }
        return true;
    }

}
