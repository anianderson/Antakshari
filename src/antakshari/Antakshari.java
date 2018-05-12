package antakshari;

import frames.Round1;
import frames.ShowTeam;
import frames.TimerFrame;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;

public class Antakshari {

    public static int CURRENT_TEAM;
    public static String JODI[][] = new String[21][2];
    public static String ACTORS[] = new String[24];
    public static String MOVIES[][] = new String[24][12];
    public static String VIDEOS[] = new String[21];
    public static String MUSIC[] = new String[21];
    /*private static final String DB_NAME = "antakshari";
     private static final String DB_USER = "root";
     private static final String DB_PASS = "";*/

    /*public static void showOnScreen(int screen, JFrame frame) {
     GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
     GraphicsDevice[] gd = ge.getScreenDevices();
     if (screen > -1 && screen < gd.length) {
     frame.setLocation(gd[screen].getDefaultConfiguration().getBounds().x + 50, frame.getY());
     } else if (gd.length > 0) {
     frame.setLocation(gd[0].getDefaultConfiguration().getBounds().x + 50, frame.getY());
     } else {
     throw new RuntimeException("No Screens Found");
     }
     }*/
    public static void startTimer(String msg) {
        new TimerFrame(10).setVisible(true);
        TimerFrame.jTextField1.setText("Team " + CURRENT_TEAM);
        TimerFrame.jTextArea1.setText(msg);
    }

    public static void startTimer(String msg, boolean pause) {
        new TimerFrame(10, pause).setVisible(true);
        TimerFrame.jTextField1.setText("Team " + CURRENT_TEAM);
        TimerFrame.jTextArea1.setText(msg);
    }

    public static void close(JFrame f) {
        WindowEvent w = new WindowEvent(f, WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(w);
    }

    private static void initializeVideoArray() {
        for (int i = 0; i < 21; i++) {
            String d = "mp4";
            if (i == 14) {
                d = "MKV";
            }
            VIDEOS[i] = "C:\\Users\\Animesh\\Desktop\\Songs\\ABC\\" + (i + 1) + "." + d;
        }
    }

    private static void initializeMusicArray() {
        for (int i = 0; i < 21; i++) {
            /*String d = "mp4";
             if (i == 14) {
             d = "MKV";
             }*/
            MUSIC[i] = "C:\\Users\\Animesh\\Desktop\\Songs\\mp3\\" + (i + 1) + ".mp3";
        }
    }

    private static void initializeJodi() {
        JODI[0][0] = "Hrithik Roshan";
        JODI[0][1] = "Katrina Kaif";
        JODI[1][0] = "Salman Khan";
        JODI[1][1] = "Madhuri Dixit";
        JODI[2][0] = "Abhishek Bachchan";
        JODI[2][1] = "Rani Mukherjee";
        JODI[3][0] = "Saif Ali Khan";
        JODI[3][1] = "Preity Zinta";
        JODI[4][0] = "Anil Kapoor";
        JODI[4][1] = "Sridevi";
        JODI[5][0] = "Imran Khan";
        JODI[5][1] = "Genelia D'Souza";
        JODI[6][0] = "Govinda";
        JODI[6][1] = "Karishma Kapoor";
        JODI[7][0] = "Akshay Kumar";
        JODI[7][1] = "Katrina Kaif";
        JODI[8][0] = "Hrithik Roshan";
        JODI[8][1] = "Aishwarya Rai Bachchan";
        JODI[9][0] = "Aamir Khan";
        JODI[9][1] = "Juhi Chawla";
        JODI[10][0] = "Anil Kapoor";
        JODI[10][1] = "Madhuri Dixit";
        JODI[11][0] = "Amitabh Bachchan";
        JODI[11][1] = "Rekha";
        JODI[12][0] = "Rajesh Khanna";
        JODI[12][1] = "Sharmila Tagore";
        JODI[13][0] = "Rishi Kapoor";
        JODI[13][1] = "Neetu Singh";
        JODI[14][0] = "Amitabh Bachchan";
        JODI[14][1] = "Jaya Bachchan";
        JODI[15][0] = "Saif Ali Khan";
        JODI[15][1] = "Kareena Kapoor";
        JODI[16][0] = "Shahrukh Khan";
        JODI[16][1] = "Deepika Padukone";
        JODI[17][0] = "Amitabh Bachchan";
        JODI[17][1] = "Hema Malini";
        JODI[18][0] = "Amitabh Bachchan";
        JODI[18][1] = "Zeenat Aman";
        JODI[19][0] = "Shahrukh Khan";
        JODI[19][1] = "Madhuri Dixit";
        JODI[20][0] = "Akshay Kumar";
        JODI[20][1] = "Priyanka Chopra";
    }
    
    private static void initializeActor(){
        ACTORS[0] = "Shahrukh Khan";
        ACTORS[1] = "Salman Khan";
        ACTORS[2] = "Akshay Kumar";
        ACTORS[3] = "Amitabh Bachchan";
        ACTORS[4] = "Aamir Khan";
        ACTORS[5] = "Karisma Kapoor";
        ACTORS[6] = "Ajay Devgan";
        ACTORS[7] = "Katrina Kaif";
        ACTORS[8] = "Akshaye Khanna";
        ACTORS[9] = "Sunny Deol";
        ACTORS[10] = "Priyanka Chopra";
        ACTORS[11] = "Deepika Padukone";
        ACTORS[12] = "Shahid Kapoor";
        ACTORS[13] = "Kareena Kapoor";
        ACTORS[14] = "Shashi Kapoor";
        ACTORS[15] = "Govinda";
        ACTORS[16] = "Emraan Hashmi";
        ACTORS[17] = "Saif Ali Khan";
        ACTORS[18] = "Sanjay Dutt";
        ACTORS[19] = "John Abraham";
        ACTORS[20] = "Abhishek Bachchan";
        ACTORS[21] = "Anil Kapoor";
        ACTORS[22] = "Rajesh Khanna";
        ACTORS[23] = "Aishwarya Rai";
    }
    
    private static void initializeMovies(){
        MOVIES[0][0] = "One 2 Ka 4";
        MOVIES[0][1] = "Chamatkar";
        MOVIES[0][2] = "Ra. One";
        MOVIES[0][3] = "Raju Ban Gaya Gentleman";
        MOVIES[0][4] = "Hum Tumhare Hain Sanam";
        MOVIES[0][5] = "Billu";
        MOVIES[0][6] = "Deewana";
        MOVIES[0][7] = "Josh";
        MOVIES[0][8] = "Zamaana Deewana";
        MOVIES[0][9] = "Dil Aashna Hai";
        MOVIES[0][10] = "King Uncle";
        MOVIES[0][11] = "Kabhi Haan Kabhi Naa";
        MOVIES[1][0] = "Dil Ne Jise Apna Kahaa";
        MOVIES[1][1] = "Bandhan";
        MOVIES[1][2] = "Love";
        MOVIES[1][3] = "Jaan-e-mann";
        MOVIES[1][4] = "Baabul";
        MOVIES[1][5] = "Veer";
        MOVIES[1][6] = "Hum Tumhare Hain Sanam";
        MOVIES[1][7] = "Hello Brother";
        MOVIES[1][8] = "Sangdil Sanam";
        MOVIES[1][9] = "Dulhan Hum Le Jayenge";
        MOVIES[1][10] = "Kyon Ki";
        MOVIES[1][11] = "Ek Ladka Ek Ladki";
        MOVIES[2][0] = "Aarzoo";
        MOVIES[2][1] = "Humko Deewana Kar Gaye";
        MOVIES[2][2] = "Once Upon a Time Again";
        MOVIES[2][3] = "Awara Paagal Deewana";
        MOVIES[2][4] = "Kambakkht Ishq";
        MOVIES[2][5] = "Aankhen";
        MOVIES[2][6] = "Thank You";
        MOVIES[2][7] = "Khatta Meetha";
        MOVIES[2][8] = "Andaaz";
        MOVIES[2][9] = "Patiala House";
        MOVIES[2][10] = "Deewane Huye Paagal";
        MOVIES[2][11] = "Aitraaz";
        MOVIES[3][0] = "Cheeni Kum";
        MOVIES[3][1] = "Mili";
        MOVIES[3][2] = "Suhaag";
        MOVIES[3][3] = "Kaalia";
        MOVIES[3][4] = "Mohabbatein";
        MOVIES[3][5] = "The Great Gambler";
        MOVIES[3][6] = "Aankhen";
        MOVIES[3][7] = "Shahenshah";
        MOVIES[3][8] = "Deewaar";
        MOVIES[3][9] = "Paa";
        MOVIES[3][10] = "Kabhie Kabhie";
        MOVIES[3][11] = "Abhimaan";
        MOVIES[4][0] = "Love Love Love";
        MOVIES[4][1] = "Mela";
        MOVIES[4][2] = "Deewana Mujh Sa Nahin";
        MOVIES[4][3] = "Mangal Pandey : The Rising";
        MOVIES[4][4] = "Dil Hai Ke Manta Nahin";
        MOVIES[4][5] = "Akele Hum Akele Tum";
        MOVIES[4][6] = "Mann";
        MOVIES[4][7] = "Ghulam";
        MOVIES[4][8] = "Talaash";
        MOVIES[4][9] = "Ishq";
        MOVIES[4][10] = "Dil";
        MOVIES[4][11] = "Qayamat Se Qayamat Tak";
        MOVIES[5][0] = "Baaz : A Bird in Danger";
        MOVIES[5][1] = "Dulaara";
        MOVIES[5][2] = "Dangerous Ishq";
        MOVIES[5][3] = "Mere Jeevan Saathi";
        MOVIES[5][4] = "Judwaa";
        MOVIES[5][5] = "Khuddar";
        MOVIES[5][6] = "Coolie No. 1";
        MOVIES[5][7] = "Haseena Maan Jaayegi";
        MOVIES[5][8] = "Hero No. 1";
        MOVIES[5][9] = "Raja Hindustani";
        MOVIES[5][10] = "Dulhan Hum Le Jayenge";
        MOVIES[5][11] = "Biwi No. 1";
        MOVIES[6][0] = "Raju Chacha";
        MOVIES[6][1] = "Kaal";
        MOVIES[6][2] = "London Dreams";
        MOVIES[6][3] = "Halla Bol";
        MOVIES[6][4] = "Hum Dil De Chuke Sanam";
        MOVIES[6][5] = "Tango Charlie";
        MOVIES[6][6] = "Atithi Tum Kab Jaoge?";
        MOVIES[6][7] = "Omkara";
        MOVIES[6][8] = "Khakee";
        MOVIES[6][9] = "All the Best : Fun Begins";
        MOVIES[6][10] = "Apaharan";
        MOVIES[6][11] = "Gangaajal";
        MOVIES[7][0] = "Boom";
        MOVIES[7][1] = "Yuvvraaj";
        MOVIES[7][2] = "Apne";
        MOVIES[7][3] = "Tees Maar Khan";
        MOVIES[7][4] = "Humko Deewana Kar Gaye";
        MOVIES[7][5] = "De Dana Dan";
        MOVIES[7][6] = "Welcome";
        MOVIES[7][7] = "Rajneeti";
        MOVIES[7][8] = "Singh Is Kinng";
        MOVIES[7][9] = "Partner";
        MOVIES[7][10] = "New York";
        MOVIES[7][11] = "Namastey London";
        MOVIES[8][0] = "No Problem";
        MOVIES[8][1] = "Salaam-e-Ishq";
        MOVIES[8][2] = "Tees Maar Khan";
        MOVIES[8][3] = "Humraaz";
        MOVIES[8][4] = "Hungama";
        MOVIES[8][5] = "Hulchul";
        MOVIES[8][6] = "36 China Town";
        MOVIES[8][7] = "Race";
        MOVIES[8][8] = "Taal";
        MOVIES[8][9] = "Players";
        MOVIES[8][10] = "LOC Kargil";
        MOVIES[8][11] = "Gali Gali Chor Hai";
        MOVIES[9][0] = "Khuda Kasam";
        MOVIES[9][1] = "Border";
        MOVIES[9][2] = "Vardi";
        MOVIES[9][3] = "Inteqam";
        MOVIES[9][4] = "Darr";
        MOVIES[9][5] = "Insaniyat";
        MOVIES[9][6] = "Jaani Dushman";
        MOVIES[9][7] = "Yamla Pagla Deewana";
        MOVIES[9][8] = "Apne";
        MOVIES[9][9] = "Naksha";
        MOVIES[9][10] = "Maa Tujhhe Salaam";
        MOVIES[9][11] = "Vishwatma";
        MOVIES[10][0] = "Drona";
        MOVIES[10][1] = "Love Story 2050";
        MOVIES[10][2] = "Aap Ki Khatir";
        MOVIES[10][3] = "Yakeen";
        MOVIES[10][4] = "God Tussi Great Ho";
        MOVIES[10][5] = "Bluffmaster!";
        MOVIES[10][6] = "Pyaar Impossible!";
        MOVIES[10][7] = "What's Your Raashee?";
        MOVIES[10][8] = "Teri Meri Kahaani";
        MOVIES[10][9] = "Anjaana Anjaani";
        MOVIES[10][10] = "Waqt : The Race Against Time";
        MOVIES[10][11] = "7 Khoon Maaf";
        MOVIES[11][0] = "Main Aurr Mrs Khanna";
        MOVIES[11][1] = "Khelein Hum Jee Jaan Sey";
        MOVIES[11][2] = "Dum Maaro Dum";
        MOVIES[11][3] = "Lafangey Parindey";
        MOVIES[11][4] = "Aarakshan";
        MOVIES[11][5] = "Break Ke Baad";
        MOVIES[11][6] = "Chandni Chowk To China";
        MOVIES[11][7] = "Karthik Calling Karthik";
        MOVIES[11][8] = "Desi Boyz";
        MOVIES[11][9] = "Love Aaj Kal";
        MOVIES[11][10] = "Cocktail";
        MOVIES[11][11] = "Housefull";
        MOVIES[12][0] = "Teri Meri Kahaani";
        MOVIES[12][1] = "Mausam";
        MOVIES[12][2] = "Chance Pe Dance";
        MOVIES[12][3] = "Dil Maange More";
        MOVIES[12][4] = "Paathshaala";
        MOVIES[12][5] = "Deewane Huye Paagal";
        MOVIES[12][6] = "Dil Bole Hadippa!";
        MOVIES[12][7] = "Vaah! Life Ho Toh Aisi!";
        MOVIES[12][8] = "Kismat Konnection";
        MOVIES[12][9] = "Badmaash Company";
        MOVIES[12][10] = "Ishq Vishk";
        MOVIES[12][11] = "Milenge Milenge";
        MOVIES[13][0] = "Jeena Sirf Merre Liye";
        MOVIES[13][1] = "Fida";
        MOVIES[13][2] = "Tashan";
        MOVIES[13][3] = "Talaash : The Hunt Begins...";
        MOVIES[13][4] = "Don : The Chase Begins Again";
        MOVIES[13][5] = "Yaadein";
        MOVIES[13][6] = "Refugee";
        MOVIES[13][7] = "Milenge Milenge";
        MOVIES[13][8] = "Mujhe Kucch Kehna Hai";
        MOVIES[13][9] = "Bewafaa";
        MOVIES[13][10] = "Ek Main Aur Ekk Tu";
        MOVIES[13][11] = "Kambakkht Ishq";
        MOVIES[14][0] = "Krodhi";
        MOVIES[14][1] = "Raja Saab";
        MOVIES[14][2] = "Janwar Aur Insaan";
        MOVIES[14][3] = "Roti Kapda Aur Makaan";
        MOVIES[14][4] = "Kranti";
        MOVIES[14][5] = "Doosra Aadmi";
        MOVIES[14][6] = "Namak Halaal";
        MOVIES[14][7] = "Kaala Patthar";
        MOVIES[14][8] = "Deewaar";
        MOVIES[14][9] = "Satyam Shivam Sundaram";
        MOVIES[14][10] = "Jab Jab Phool Khile";
        MOVIES[14][11] = "Aa Gale Lag Jaa";
        MOVIES[15][0] = "Apmaan Ki Aag";
        MOVIES[15][1] = "Ghar Ghar Ki Kahani";
        MOVIES[15][2] = "Raja Bhaiya";
        MOVIES[15][3] = "Sandwich";
        MOVIES[15][4] = "Albela";
        MOVIES[15][5] = "Akhiyon Se Goli Maare";
        MOVIES[15][6] = "Banarasi Babu";
        MOVIES[15][7] = "Aunty No. 1";
        MOVIES[15][8] = "Joru Ka Ghulam";
        MOVIES[15][9] = "Bhagam Bhag";
        MOVIES[15][10] = "Coolie No. 1";
        MOVIES[15][11] = "Dulhe Raja";
        MOVIES[16][0] = "Jawani Diwani";
        MOVIES[16][1] = "Ghanchakkar";
        MOVIES[16][2] = "The Dirty Picture";
        MOVIES[16][3] = "Good Boy, Bad Boy";
        MOVIES[16][4] = "Raaz 2";
        MOVIES[16][5] = "Tum Mile";
        MOVIES[16][6] = "Crook";
        MOVIES[16][7] = "Gangster";
        MOVIES[16][8] = "Awarapan";
        MOVIES[16][9] = "Footpath";
        MOVIES[16][10] = "Shanghai";
        MOVIES[16][11] = "Dil Toh Baccha Hai Ji";
        MOVIES[17][0] = "Aashiq Awara";
        MOVIES[17][1] = "Tu Chor Main Sipahi";
        MOVIES[17][2] = "Aarakshan";
        MOVIES[17][3] = "Hum Tum";
        MOVIES[17][4] = "Tashan";
        MOVIES[17][5] = "Kurbaan";
        MOVIES[17][6] = "LOC Kargil";
        MOVIES[17][7] = "Salaam Namaste";
        MOVIES[17][8] = "Kya Kehna";
        MOVIES[17][9] = "Hum Saath Saath Hain";
        MOVIES[17][10] = "Love Aaj Kal";
        MOVIES[17][11] = "Parineeta";
        MOVIES[18][0] = "Tango Charlie";
        MOVIES[18][1] = "Rascals";
        MOVIES[18][2] = "Total Dhamaal";
        MOVIES[18][3] = "Aladin";
        MOVIES[18][4] = "Blue";
        MOVIES[18][5] = "No Problem";
        MOVIES[18][6] = "Taxi No. 9211";
        MOVIES[18][7] = "Knock Out";
        MOVIES[18][8] = "Khalnayak";
        MOVIES[18][9] = "Vaastav : The Reality";
        MOVIES[18][10] = "Luck";
        MOVIES[18][11] = "Agneepath";
        MOVIES[19][0] = "Kabul Express";
        MOVIES[19][1] = "Aashayein";
        MOVIES[19][2] = "No Smoking";
        MOVIES[19][3] = "I, Me aur Main";
        MOVIES[19][4] = "Jhootha Hi Sahi";
        MOVIES[19][5] = "Jism";
        MOVIES[19][6] = "Kaal";
        MOVIES[19][7] = "Garam Masala";
        MOVIES[19][8] = "Madras Cafe";
        MOVIES[19][9] = "Shootout at Wadala";
        MOVIES[19][10] = "New York";
        MOVIES[19][11] = "Force";
        MOVIES[20][0] = "Drona";
        MOVIES[20][1] = "Khelein Hum Jee Jaan Sey";
        MOVIES[20][2] = "Laaga Chunari Mein Daag";
        MOVIES[20][3] = "Luck by Chance";
        MOVIES[20][4] = "Dostana";
        MOVIES[20][5] = "Raavan";
        MOVIES[20][6] = "Run";
        MOVIES[20][7] = "Jhoom Barabar Jhoom";
        MOVIES[20][8] = "Players";
        MOVIES[20][9] = "Main Prem Ki Deewani Hoon";
        MOVIES[20][10] = "Refugee";
        MOVIES[20][11] = "Kuch Naa Kaho";
        MOVIES[21][0] = "Om Jai Jagadish";
        MOVIES[21][1] = "Taal";
        MOVIES[21][2] = "1942 : A Love Story";
        MOVIES[21][3] = "Ram Lakhan";
        MOVIES[21][4] = "Race";
        MOVIES[21][5] = "Virasat";
        MOVIES[21][6] = "Meri Jung";
        MOVIES[21][7] = "Beta";
        MOVIES[21][8] = "No Entry";
        MOVIES[21][9] = "Welcome";
        MOVIES[21][10] = "Nayak";
        MOVIES[21][11] = "Tezaab";
        MOVIES[22][0] = "Babu";
        MOVIES[22][1] = "Aan Milo Sajna";
        MOVIES[22][2] = "The Train";
        MOVIES[22][3] = "Roti";
        MOVIES[22][4] = "Mehbooba";
        MOVIES[22][5] = "Aradhana";
        MOVIES[22][6] = "Agar Tum Na Hote";
        MOVIES[22][7] = "Kati Patang";
        MOVIES[22][8] = "Hathi Mere Sathi";
        MOVIES[22][9] = "Do Raaste";
        MOVIES[22][10] = "Namak Haraam";
        MOVIES[22][11] = "Amar Prem";
        MOVIES[23][0] = "Albela";
        MOVIES[23][1] = "Dil Ka Rishta";
        MOVIES[23][2] = "Action Replayy";
        MOVIES[23][3] = "Raavan";
        MOVIES[23][4] = "Hum Tumhare Hain Sanam";
        MOVIES[23][5] = "Kuch Naa Kaho";
        MOVIES[23][6] = "Bunty Aur Babli";
        MOVIES[23][7] = "Guzaarish";
        MOVIES[23][8] = "Josh";
        MOVIES[23][9] = "Guru";
        MOVIES[23][10] = "Jodhaa Akbar";
        MOVIES[23][11] = "Aur Pyaar Ho Gaya";
    }

    public static void main(String[] args) {
        /*try {
         try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + DB_NAME, DB_USER, DB_PASS)) {
         Statement stat = conn.createStatement();
         int i = 0;
         try (ResultSet rs = stat.executeQuery("")) {
         while (rs.next()) {
         JODI[i][0] = rs.getString("actor");
         JODI[i][1] = rs.getString("actress");
         i++;
         if (i == 21) {
         break;
         }
         }
         }
         i = 0;
         try (ResultSet rs = stat.executeQuery("SELECT column_name FROM information_schema.columns "
         + "WHERE table_schema = '" + DB_NAME + "' AND table_name = 'movies';")) {
         while (rs.next()) {
         ACTORS[i] = rs.getString("column_name");
         i++;
         if (i == 24) {
         break;
         }
         }
         }
         for (i = 0; i < 24; i++) {
         int j = 0;
         try (ResultSet rs = stat.executeQuery("select " + ACTORS[i] + " from movies")) {
         while (rs.next()) {
         MOVIES[i][j] = rs.getString(ACTORS[i]);
         j++;
         if (j == 12) {
         break;
         }
         }
         }
         }
         }
         } catch (SQLException e) {
         JOptionPane.showMessageDialog(null, e.getMessage());
         }*/
        initializeVideoArray();
        initializeMusicArray();
        initializeJodi();
        initializeActor();
        initializeMovies();
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Round1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ShowTeam().setVisible(true);
            }
        });
    }
}
