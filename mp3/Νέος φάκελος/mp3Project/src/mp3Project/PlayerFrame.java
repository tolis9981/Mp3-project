package mp3Project;

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.nio.file.Paths;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.Line;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.Mixer;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class PlayerFrame extends javax.swing.JFrame {

    // Dilwsh global metablitwn
    MP3Player player;
    File songFile;
    String currentDirectory = "home.user"; // I am using home.user this will call file chooser in user documents.
    String currentPath;
    String imagePath;
    String appName = "MP3 Player";
    boolean repeat = false;
    boolean windowCollapsed = false;
    int xMouse, yMouse;

    public PlayerFrame() {
        initComponents();
       
        Title.setText(appName);

    
        songFile = new File("..\\mp3Project\\Jack Savoretti - Soldiers Eyes.mp3");

  
        String fileName = songFile.getName();
       
        SongNameLabel.setText(fileName);

        
        player = mp3Player();
        // Now add song to player as playlist.
        player.addToPlayList(songFile);

      
        currentPath = Paths.get(".").toAbsolutePath().normalize().toString();
        imagePath = "\\images";
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        songNameMainPanel = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        headerPanel = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        XButton = new javax.swing.JLabel();
        settingsBtn = new javax.swing.JLabel();
        controlPanel = new javax.swing.JPanel();
        songNameSubPanel = new javax.swing.JPanel();
        SongNameLabel = new javax.swing.JLabel();
        LoopButton = new javax.swing.JLabel();
        PauseButton = new javax.swing.JLabel();
        PlayButton = new javax.swing.JLabel();
        StopButton = new javax.swing.JLabel();
        OpenFolderButton = new javax.swing.JLabel();
        Diaxoristiko = new javax.swing.JPanel();
        volumeFullBtn = new javax.swing.JLabel();
        volumeUpBtn = new javax.swing.JLabel();
        muteBtn = new javax.swing.JLabel();
        volumeDownBtn = new javax.swing.JLabel();
        takis = new javax.swing.JLabel();

        songNameMainPanel.setBackground(new java.awt.Color(7, 63, 86));

        javax.swing.GroupLayout songNameMainPanelLayout = new javax.swing.GroupLayout(songNameMainPanel);
        songNameMainPanel.setLayout(songNameMainPanelLayout);
        songNameMainPanelLayout.setHorizontalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        songNameMainPanelLayout.setVerticalGroup(
            songNameMainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 89, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainPanel.setBackground(new java.awt.Color(131, 88, 46));

        headerPanel.setBackground(new java.awt.Color(105, 53, 0));

        Title.setFont(new java.awt.Font("Nirmala UI", 0, 18)); // NOI18N
        Title.setForeground(new java.awt.Color(212, 175, 55));
        Title.setText("Mp3 Player");
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TitleMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });

        XButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        XButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/exitfinall.png"))); // NOI18N
        XButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                XButtonMouseClicked(evt);
            }
        });

        settingsBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        settingsBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/settingsfinal.png"))); // NOI18N
        settingsBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingsBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout headerPanelLayout = new javax.swing.GroupLayout(headerPanel);
        headerPanel.setLayout(headerPanelLayout);
        headerPanelLayout.setHorizontalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28)
                .addComponent(settingsBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(XButton, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        headerPanelLayout.setVerticalGroup(
            headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanelLayout.createSequentialGroup()
                .addGroup(headerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(XButton, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(settingsBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        controlPanel.setBackground(new java.awt.Color(7, 63, 86));

        javax.swing.GroupLayout controlPanelLayout = new javax.swing.GroupLayout(controlPanel);
        controlPanel.setLayout(controlPanelLayout);
        controlPanelLayout.setHorizontalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        controlPanelLayout.setVerticalGroup(
            controlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        songNameSubPanel.setBackground(new java.awt.Color(131, 88, 46));
        songNameSubPanel.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(212, 175, 55), 1, true));

        SongNameLabel.setFont(new java.awt.Font("Nirmala UI", 0, 12)); // NOI18N
        SongNameLabel.setForeground(new java.awt.Color(212, 175, 55));
        SongNameLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SongNameLabel.setText("PLAYING");

        javax.swing.GroupLayout songNameSubPanelLayout = new javax.swing.GroupLayout(songNameSubPanel);
        songNameSubPanel.setLayout(songNameSubPanelLayout);
        songNameSubPanelLayout.setHorizontalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(songNameSubPanelLayout.createSequentialGroup()
                .addGap(195, 195, 195)
                .addComponent(SongNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(230, 230, 230))
        );
        songNameSubPanelLayout.setVerticalGroup(
            songNameSubPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SongNameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        LoopButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/loopfinal.png"))); // NOI18N
        LoopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LoopButtonMouseClicked(evt);
            }
        });

        PauseButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PauseButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/pausefinal.png"))); // NOI18N
        PauseButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PauseButtonMouseClicked(evt);
            }
        });

        PlayButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        PlayButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/playfinal.png"))); // NOI18N
        PlayButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PlayButtonMouseClicked(evt);
            }
        });

        StopButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        StopButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/stopfinal.png"))); // NOI18N
        StopButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StopButtonMouseClicked(evt);
            }
        });

        OpenFolderButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        OpenFolderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/openfilefinal.png"))); // NOI18N
        OpenFolderButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpenFolderButtonMouseClicked(evt);
            }
        });

        Diaxoristiko.setBackground(new java.awt.Color(131, 88, 46));
        Diaxoristiko.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(212, 175, 55)));

        volumeFullBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeFullBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/volumemaxfinal.png"))); // NOI18N
        volumeFullBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeFullBtnMouseClicked(evt);
            }
        });

        volumeUpBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeUpBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/volumeupfinal.png"))); // NOI18N
        volumeUpBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeUpBtnMouseClicked(evt);
            }
        });

        muteBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        muteBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/mutefinal.png"))); // NOI18N
        muteBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                muteBtnMouseClicked(evt);
            }
        });

        volumeDownBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        volumeDownBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mp3Project/images/volumedownfinal.png"))); // NOI18N
        volumeDownBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volumeDownBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout DiaxoristikoLayout = new javax.swing.GroupLayout(Diaxoristiko);
        Diaxoristiko.setLayout(DiaxoristikoLayout);
        DiaxoristikoLayout.setHorizontalGroup(
            DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(DiaxoristikoLayout.createSequentialGroup()
                .addGroup(DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(volumeUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumeDownBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeFullBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(muteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        DiaxoristikoLayout.setVerticalGroup(
            DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(DiaxoristikoLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addGroup(DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(volumeFullBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(volumeUpBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(DiaxoristikoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(volumeDownBtn, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                    .addComponent(muteBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        takis.setForeground(new java.awt.Color(212, 175, 55));
        takis.setText("loop conditioned");

        javax.swing.GroupLayout mainPanelLayout = new javax.swing.GroupLayout(mainPanel);
        mainPanel.setLayout(mainPanelLayout);
        mainPanelLayout.setHorizontalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(controlPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(headerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(songNameSubPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(takis)
                    .addGroup(mainPanelLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(LoopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(OpenFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Diaxoristiko, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        mainPanelLayout.setVerticalGroup(
            mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPanelLayout.createSequentialGroup()
                .addComponent(headerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(songNameSubPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Diaxoristiko, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createSequentialGroup()
                        .addComponent(LoopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(takis)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(OpenFolderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(StopButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PlayButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(PauseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(controlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void PlayButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PlayButtonMouseClicked

        player.play();
    }//GEN-LAST:event_PlayButtonMouseClicked

    private void StopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_StopButtonMouseClicked

        player.stop();
    }//GEN-LAST:event_StopButtonMouseClicked

    private void PauseButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PauseButtonMouseClicked

        player.pause();
    }//GEN-LAST:event_PauseButtonMouseClicked

    private void LoopButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LoopButtonMouseClicked
        // elegxoume an briskete se loop , an nai to bgazoyme apo loop an oxi to bazoyme kai enimeronoyme to label 
        if (repeat == false) {
            repeat = true;
            player.setRepeat(repeat);
            takis.setText("looped");

        } else if (repeat == true) {
            repeat = false;
            player.setRepeat(repeat);
            takis.setText("stop looped");

        }
    }//GEN-LAST:event_LoopButtonMouseClicked

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        //pairnoume tis sintetagmenes to pontikiou otan patisoume epanw ston titlo
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        // topo8etoume olo to app sto shmeio pou oi kainourgies sintetagmenes mas briskontai
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();

        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void XButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_XButtonMouseClicked

        this.dispose();

    }//GEN-LAST:event_XButtonMouseClicked

    private void settingsBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingsBtnMouseClicked
        // dimiourgoume to pop up para8iro twn settings
        JOptionPane.showMessageDialog(this, "Your settings dilog will be popup here!");
    }//GEN-LAST:event_settingsBtnMouseClicked

    private void OpenFolderButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpenFolderButtonMouseClicked
        // Energopoioume to ftiaxnoyme to pop up window tou research stous folder mas
        JFileChooser openFileChooser = new JFileChooser(currentDirectory);
        openFileChooser.setFileFilter(new FileTypeFilter(".mp3", "Open MP3 Files Only!"));
        int result = openFileChooser.showOpenDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            songFile = openFileChooser.getSelectedFile();
            player.addToPlayList(songFile);
            player.skipForward();
            currentDirectory = songFile.getAbsolutePath();
            SongNameLabel.setText("Playing Now... | " + songFile.getName());
        }
    }//GEN-LAST:event_OpenFolderButtonMouseClicked

    private void TitleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseClicked

        if (evt.getClickCount() == 2) {
            if (windowCollapsed == false) {
                windowCollapsed = true;

            } else if (windowCollapsed == true) {
                windowCollapsed = false;

            }
        }
    }//GEN-LAST:event_TitleMouseClicked

    private void volumeDownBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeDownBtnMouseClicked
        //Meinoume thn fwnh kata 10%
        volumeDownControl(0.1);
    }//GEN-LAST:event_volumeDownBtnMouseClicked

    private void volumeUpBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeUpBtnMouseClicked
        //afksanoume thn fwnh kata 10%
        volumeUpControl(0.1);
    }//GEN-LAST:event_volumeUpBtnMouseClicked

    private void volumeFullBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volumeFullBtnMouseClicked
        // topo8etoume aftomata thn fwnh sto 100%
        volumeControl(1.0);
    }//GEN-LAST:event_volumeFullBtnMouseClicked

    private void muteBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_muteBtnMouseClicked
        // topo8etoume aftomata thn fwnh sto 0%
        volumeControl(0.0);
    }//GEN-LAST:event_muteBtnMouseClicked

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PlayerFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Diaxoristiko;
    private javax.swing.JLabel LoopButton;
    private javax.swing.JLabel OpenFolderButton;
    private javax.swing.JLabel PauseButton;
    private javax.swing.JLabel PlayButton;
    private javax.swing.JLabel SongNameLabel;
    private javax.swing.JLabel StopButton;
    private javax.swing.JLabel Title;
    private javax.swing.JLabel XButton;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JPanel headerPanel;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel muteBtn;
    private javax.swing.JLabel settingsBtn;
    private javax.swing.JPanel songNameMainPanel;
    private javax.swing.JPanel songNameSubPanel;
    private javax.swing.JLabel takis;
    private javax.swing.JLabel volumeDownBtn;
    private javax.swing.JLabel volumeFullBtn;
    private javax.swing.JLabel volumeUpBtn;
    // End of variables declaration//GEN-END:variables

    // Dimiourgoume mia custom mp3 methodo
    private MP3Player mp3Player() {
        MP3Player mp3Player = new MP3Player();
        return mp3Player;
    }

    // dimiourgoume tis methodous gia auksomeiwsh tou hxou
    private void volumeDownControl(Double valueToPlusMinus) {

        Mixer.Info[] mixers = AudioSystem.getMixerInfo();

        for (Mixer.Info mixerInfo : mixers) {

            Mixer mixer = AudioSystem.getMixer(mixerInfo);

            Line.Info[] lineInfos = mixer.getTargetLineInfo();

            for (Line.Info lineInfo : lineInfos) {

                Line line = null;

                boolean opened = true;

                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;

                    if (!opened) {

                        line.open();
                    }

                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);

                    float currentVolume = volControl.getValue();

                    Double volumeToCut = valueToPlusMinus;

                    float changedCalc = (float) ((float) currentVolume - (double) volumeToCut);

                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {

                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    private void volumeUpControl(Double valueToPlusMinus) {

        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers) {
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for (Line.Info lineInfo : lineInfos) {
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if (!opened) {
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((float) currentVolume + (double) volumeToCut);
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }

    private void volumeControl(Double valueToPlusMinus) {
        Mixer.Info[] mixers = AudioSystem.getMixerInfo();
        for (Mixer.Info mixerInfo : mixers) {
            Mixer mixer = AudioSystem.getMixer(mixerInfo);
            Line.Info[] lineInfos = mixer.getTargetLineInfo();
            for (Line.Info lineInfo : lineInfos) {
                Line line = null;
                boolean opened = true;
                try {
                    line = mixer.getLine(lineInfo);
                    opened = line.isOpen() || line instanceof Clip;
                    if (!opened) {
                        line.open();
                    }
                    FloatControl volControl = (FloatControl) line.getControl(FloatControl.Type.VOLUME);
                    float currentVolume = volControl.getValue();
                    Double volumeToCut = valueToPlusMinus;
                    float changedCalc = (float) ((double) volumeToCut);
                    volControl.setValue(changedCalc);

                } catch (LineUnavailableException lineException) {
                } catch (IllegalArgumentException illException) {
                } finally {
                    if (line != null && !opened) {
                        line.close();
                    }
                }
            }
        }
    }
}
