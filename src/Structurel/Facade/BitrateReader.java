package Structurel.Facade;

// Classe pour la lecture du débit binaire
class BitrateReader {
    public static VideoFile read(VideoFile file, Codec codec) {
        System.out.println("Reading video file: " + file.getFileName() + " with codec: " + codec.type());
        // Logique de lecture du débit binaire
        return file;
    }

    public static VideoFile convert(VideoFile buffer, Codec codec) {
        System.out.println("Converting video file with codec: " + codec.type());
        // Logique de conversion
        return buffer;
    }
}
