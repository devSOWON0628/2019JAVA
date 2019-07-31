import javax.swing.*;

public class MenuEx extends JFrame {
	public MenuEx() {
		setTitle("Menu 만들기 예제");
		createMenu(); // 메뉴 생성, 프레임에 삽입
		setSize(250,200);
		setVisible(true);
	}
	private void createMenu() {
		JMenuBar mb = new JMenuBar();
		JMenu screenMenu = new JMenu("Screen");

		JMenuItem nct127 = new JMenuItem("nct127");
		JMenuItem ty = new JMenuItem("태용");
		JMenuItem dy = new JMenuItem("도영");
		JMenuItem jh = new JMenuItem("재현");
		screenMenu.add(nct127);
		screenMenu.add(ty);
		screenMenu.add(dy);
		screenMenu.add(jh);
		screenMenu.addSeparator(); // 분리선 삽입
		screenMenu.add(new JMenuItem("정우"));

		mb.add(screenMenu);
		mb.add(new JMenu("Edit")); 
		mb.add(new JMenu("Source"));
		mb.add(new JMenu("Project"));
		mb.add(new JMenu("Run"));
	
		setJMenuBar(mb);
	}
	public static void main(String [] args) {
		new MenuEx();
	}
}
