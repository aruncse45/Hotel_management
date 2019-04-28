/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.room.management;

/**
 *
 * @author Arun kundu
 */
public class HotelRoomManagement {
    public static login log = new login();
   
    public static manager managerpage =new manager();
    public static admin adminpage =new admin();
    public static admin_db admin_db_page = new admin_db();
    public static manager_db manager_db_page = new manager_db();
    public static all_information_db all_information_db_page = new all_information_db();
    public static user userpage = new user();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        log.setVisible(true);
    }

    static Object userpage() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
