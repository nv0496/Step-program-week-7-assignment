// Base Class
class ArtPiece {
    String title;
    String artist;

    ArtPiece(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Artist: " + artist);
    }
}

// Painting Class
class Painting extends ArtPiece {
    String brushTechnique;
    String colorPalette;
    String frameSpec;

    Painting(String title, String artist, String brushTechnique, String colorPalette, String frameSpec) {
        super(title, artist);
        this.brushTechnique = brushTechnique;
        this.colorPalette = colorPalette;
        this.frameSpec = frameSpec;
    }

    void showPaintingDetails() {
        System.out.println("Brush Technique: " + brushTechnique);
        System.out.println("Color Palette: " + colorPalette);
        System.out.println("Frame: " + frameSpec);
    }
}

// Sculpture Class
class Sculpture extends ArtPiece {
    String material;
    String dimensions;
    String lighting;

    Sculpture(String title, String artist, String material, String dimensions, String lighting) {
        super(title, artist);
        this.material = material;
        this.dimensions = dimensions;
        this.lighting = lighting;
    }

    void showSculptureDetails() {
        System.out.println("Material: " + material);
        System.out.println("Dimensions: " + dimensions);
        System.out.println("Lighting: " + lighting);
    }
}

// Digital Art Class
class DigitalArt extends ArtPiece {
    String resolution;
    String fileFormat;
    String interactiveElement;

    DigitalArt(String title, String artist, String resolution, String fileFormat, String interactiveElement) {
        super(title, artist);
        this.resolution = resolution;
        this.fileFormat = fileFormat;
        this.interactiveElement = interactiveElement;
    }

    void showDigitalArtDetails() {
        System.out.println("Resolution: " + resolution);
        System.out.println("File Format: " + fileFormat);
        System.out.println("Interactive Element: " + interactiveElement);
    }
}

// Photography Class
class Photography extends ArtPiece {
    String cameraSettings;
    String editingDetails;
    String printSpecs;

    Photography(String title, String artist, String cameraSettings, String editingDetails, String printSpecs) {
        super(title, artist);
        this.cameraSettings = cameraSettings;
        this.editingDetails = editingDetails;
        this.printSpecs = printSpecs;
    }

    void showPhotographyDetails() {
        System.out.println("Camera Settings: " + cameraSettings);
        System.out.println("Editing: " + editingDetails);
        System.out.println("Print Specs: " + printSpecs);
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {
        // Array of generic ArtPieces
        ArtPiece[] gallery = new ArtPiece[4];

        gallery[0] = new Painting("Starry Night", "Van Gogh", "Impasto", "Blue-Yellow", "Ornate Gold Frame");
        gallery[1] = new Sculpture("David", "Michelangelo", "Marble", "5.17m tall", "Spotlight");
        gallery[2] = new DigitalArt("Virtual Waves", "Alice", "4K", "GIF", "Touch Interaction");
        gallery[3] = new Photography("Moonrise", "Ansel Adams", "Aperture f/8", "B&W Darkroom", "Matte Print");

        // Display general info
        for (ArtPiece art : gallery) {
            System.out.println("\n--- Artwork ---");
            art.displayInfo();

            // Downcasting with instanceof
            if (art instanceof Painting) {
                ((Painting) art).showPaintingDetails();
            } else if (art instanceof Sculpture) {
                ((Sculpture) art).showSculptureDetails();
            } else if (art instanceof DigitalArt) {
                ((DigitalArt) art).showDigitalArtDetails();
            } else if (art instanceof Photography) {
                ((Photography) art).showPhotographyDetails();
            }
        }
    }
}
