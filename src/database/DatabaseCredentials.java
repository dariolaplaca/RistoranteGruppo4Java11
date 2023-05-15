package database;

    public class DatabaseCredentials {
        private static final String DB_URL = "jdbc:mysql://localhost:3306/develhope";
        private static final String USER = "root";
        private static final String PASS = "password1234";

        public static String getDbUrl() {
            return DB_URL;
        }

        public static String getPASS() {
            return PASS;
        }

        public static String getUSER() {
            return USER;
        }
    }
