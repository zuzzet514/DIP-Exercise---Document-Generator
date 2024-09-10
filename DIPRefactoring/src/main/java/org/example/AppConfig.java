package org.example;

public class AppConfig {

    public static DocumentGenerator generateDocumentGenerator() {

        FileCreatorRegistry registry = new FileCreatorRegistry();
        registry.registerCreators(1, new TxtFileCreator(), TxtFileCreator.getType());

        InputReader inputReader = new ConsoloReaderInput();
        return new DocumentGenerator(inputReader, registry);
    }
}
