package Structurel.Facade;

import java.io.File;

public class VideoConversionFacade {
    public static VideoFile convertVideo(String fileName, String format) {
        VideoFile videoFile = new VideoFile(fileName);
        Codec destinationCodec = null;
        if (format.equals("mp4")) {
            destinationCodec =  new MP4CompressionCodec();
        } else if(format.equals("ogg"))
        {
            destinationCodec = new OggCompressionCodec();
        }
        else {
            System.out.println("Coder n'existe pas pour ce Video");
            return null;
        }
        VideoFile intermediateResult = BitrateReader.read(videoFile, destinationCodec);
        VideoFile result = BitrateReader.convert(intermediateResult, destinationCodec);
        AudioMixer.mix(result);
        return result;
    }
}
