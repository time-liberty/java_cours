package SEMINAR2;

import org.json.simple.JSONObject;

class Task_2 {
    public static void main(String[] args) {
        JSONObject resultJson = new JSONObject();

        resultJson.put("name", "foo");
        resultJson.put("num", 100);
        resultJson.put("is_vip",true);
        resultJson.put("nickname",null);
        System.out.println(resultJson.toString());
    }
}
