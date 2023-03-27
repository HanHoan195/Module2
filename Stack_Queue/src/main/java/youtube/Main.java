package youtube;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // mặc định userList lưu Object
        ArrayList userList = new ArrayList<>();
        userList.add("Hoàn");
        userList.add(new User());
        userList.add(new Employee());

        //gọi phương thức tinhTien()
        for (int i= 0; i< userList.size();i++){
            if (userList.get(i) instanceof User){
                ((User) userList.get(i)).tinhTien();
            }
        }

        //quy định danh sách chỉ thuộc một loại dữ liệu
        ArrayList<User> userArrayList = new ArrayList<>();
        //hhi compile đa đc xác định kiểu dữ liệu
        userArrayList.add(new User());
        //không cần ép kiểu
        userArrayList.get(1).tinhTien();

    }
}
