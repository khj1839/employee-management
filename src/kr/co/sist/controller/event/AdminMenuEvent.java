package kr.co.sist.controller.event;

import kr.co.sist.view.admin.AdminMenu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Desc : 관리자 로그인 메뉴 화면에 보이는 내용의 이벤트처리
 * 작성일 : 2024.03.18
 * 작성자 : 고한별
 */
public class AdminMenuEvent extends WindowAdapter implements ActionListener {
    private AdminMenu adminMenu;

    public AdminMenuEvent(AdminMenu adminMenu) {
        this.adminMenu = adminMenu;
    }

    /**
     * Desc : 각각의 버튼에 연결되는 이벤트 관리
     * @param e the event to be processed
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == adminMenu.getEmployeeInformationJbtn()){
            System.out.println("사원정보 연결");
        }
        if (e.getSource() == adminMenu.getWorkAttendanceJbtn()){
            System.out.println("근태관리 연결");
        }
        if (e.getSource() == adminMenu.getDocumentsJbtn()){
            System.out.println("문서관리 연결");
        }
        if (e.getSource() == adminMenu.getCloseJbtn()){
            closeFrame();
        }
        if (e.getSource() == adminMenu.getPasswordJbtn()){
            System.out.println("비밀번호 변경 연결");
        }
    }

    /**
     * Desc : 타이틀 바의 x 누를 경우 창 닫기 기능
     * @param e the event to be processed
     */
    @Override
    public void windowClosing(WindowEvent e) {
        closeFrame();
    }

    /**
     * Desc : 창 닫기 *******구현필요
     */
    public void closeFrame(){
        adminMenu.dispose();
    }
}