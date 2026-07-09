package lab;

/**
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    /**
     * เช็คค่าว่าตรงกับ  key ไหม
     * @param arr ไม่เท่ากับ null
     * @param key ค่าที่ต้องการจะหา
     * @return หาตำแหน่ง key ถ้าไม่เจอจะแสดงผลมาเป็น -1
     * @throws -1 ถ้า key arr!=null retrun ค่าที่ต้องการ
     */
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     *สูตรหาค่าพื้นที่วงกลม
     * @param radius ต้อง >= 0
     * @return หาค่าพื้นที่วงกลม
     * @throws error เมื่อ resuat  มีค่า >0
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
   /**
    * ตัดช่องว่างหน้าหลัง แปลงตัวพิมพ์เล็ก
    * @param s ช้อความเท่ากับ null
    * @return ถ้า == null จะเป็นข้อความว่าตัวอักษรพิมพ์เล็ก ไม่มีหน้าหลัง
    *
    */
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
