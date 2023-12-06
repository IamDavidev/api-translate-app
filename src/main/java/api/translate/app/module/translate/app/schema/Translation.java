package api.translate.app.module.translate.app.schema;

import lombok.AllArgsConstructor;

import java.util.UUID;

@AllArgsConstructor
public class Translation {
    /**
     * ID of the translation
     * Type:  UUID
     * This field represents the ID of the translation
     */
    private UUID id;


    /**
     * Raw text
     * Type:  String
     * Max length: 500
     * This field represents the raw text is going to be translated
     */
    private String rawText;

    /**
     * Output text
     * Type:  String
     * This field represents the output text of the translation
     */
    private String outputText;

    /**
     * Source language
     * Type:  String
     * This field represents the source language of the translation
     *
     * @TODO: create a ENUM of possible values
     * Possible values: "en", "es", "fr", "de", "it", "pt"
     */
    private String sourceLanguage;

    /**
     * Target language
     * Type:  String
     * This field represents the target language of the translation
     *
     * @TODO: create a ENUM of possible values
     * Possible values: "en", "es", "fr", "de", "it", "pt"
     */
    private String targetLanguage;

    /**
     * Translation status
     * Type:  String
     * This field represents the status of the translation
     * Possible values: "pending", "completed"
     */
    private String status;

}
