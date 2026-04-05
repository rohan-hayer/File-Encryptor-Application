import java.io.File;

public class FileEncryptor {
    public static void main(String[] args) {

        // 16-character key for AES (must be exactly 16 chars)
        String key = "1234567890123456";

        // Create file objects for input and output
        File inputFile = new File("plain.txt");
        File encryptedFile = new File("encrypted.txt");
        File decryptedFile = new File("decrypted.txt");

        try {
            // Encrypt the file
            CryptoUtils.encrypt(key, inputFile, encryptedFile);
            System.out.println("✅ File encrypted successfully: " + encryptedFile.getName());

            // Decrypt the file
            CryptoUtils.decrypt(key, encryptedFile, decryptedFile);
            System.out.println("🔓 File decrypted successfully: " + decryptedFile.getName());

        } catch (Exception e) {
            System.out.println("❌ Error during encryption/decryption:");
            e.printStackTrace();
        }
    }
}