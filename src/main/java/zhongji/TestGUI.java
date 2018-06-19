package zhongji;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 * Created by lihanqing3 on 2018/6/4.
 */
public class TestGUI {

        public static void main(String[] args) {

            JFrame f = new JFrame("LoL");
            f.setSize(400, 300);
            f.setLocation(580, 200);
            f.setLayout(null);

            final JLabel l = new JLabel();

            ImageIcon i = new ImageIcon("E:\\MyDownloads/11252436.jpg");
            l.setIcon(i);
            l.setBounds(50, 50, i.getIconWidth(), i.getIconHeight());

            JButton b = new JButton("隐藏图片");
            b.setBounds(150, 200, 100, 30);

            // 给按钮 增加 监听
            b.addActionListener(new ActionListener() {

                // 当按钮被点击时，就会触发 ActionEvent事件
                // actionPerformed 方法就会被执行
                public void actionPerformed(ActionEvent e) {
                    l.setVisible(false);
                }
            });

            f.add(l);
            f.add(b);
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

            f.setVisible(true);
        }

    }

